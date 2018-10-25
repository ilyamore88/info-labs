class Encoder:

    def encode(self, textIn):
        textOut = ""
        return textOut;

    def decode(self, textIn):
        textOut = ""
        return textOut;


class HuffmanEncoder(Encoder):

    def __init__(self):
        self.compressionCoef = 0

    def encode(self, textIn):
        text = textIn
        textSet = set(textIn)
        textList = []
        for key in textSet:
            textList.append([textIn.count(key), key])
        textList.sort()
        elem = []
        while len(textList) > 1:
            elem.append(textList[0][0] + textList[1][0])
            elem.append("(" + textList[0][1] + textList[1][1] + ")")
            textList.append([elem.pop(0), elem.pop(0)])
            textList.pop(0)
            textList.pop(0)
            textList.sort()
        text1 = textList[0][1]
        codeL = []
        code = ""
        for l in text1:
            if l == '(':
                code = code + '0'
            elif l == ')':
                code = code[:len(code) - 2] + '1'
            else:
                codeL.append([l, code])
                code = code[:len(code) - 1] + '1'
        for l in codeL:
            textIn = textIn.replace(l[0], l[1])
        self.__setCompressionCoef(text, textIn)
        textOut = textIn
        for l in codeL:
            textOut += "\n" + l[0] + " " + l[1]
        return textOut

    def decode(self, textIn):
        text = textIn[0:textIn.find("\n")]
        textIn = textIn[textIn.find("\n") + 1:]
        huffDict = {}
        while textIn.count("\n") != 0:
            i = textIn[0:textIn.find("\n")]
            textIn = textIn[textIn.find("\n") + 1:]
            l, code = i.split()
            huffDict[code] = l
        else:
            l, code = textIn.split()
            huffDict[code] = l
        leng = 1
        textOut = ""
        while text != "":
            if text[0:leng] in huffDict.keys():
                textOut += huffDict[text[0:leng]]
                text = text[leng:]
                leng = 1
            else:
                leng += 1
        return textOut

    def __setCompressionCoef(self, textIn, textCode):
        self.compressionCoef = len(textIn) * 8 / len(textCode)

    def getCompressionCoef(self):
        if (self.compressionCoef != 0):
            return self.compressionCoef
        else:
            print("Коэффициент сжатия не рассчитан!")


class LZEncoder(Encoder):

    def __init__(self):
        self.compressionCoef = 0

    def encode(self, textIn):
        textOut = ""
        LZdict = [""]
        i = 0
        while i != len(textIn):
            leng = 1
            while (textIn[i:leng] in LZdict) and (leng != len(textIn)):
                leng += 1
            textOut = textOut + str(LZdict.index(textIn[i:leng - 1])) + textIn[leng - 1]
            LZdict.append(textIn[i:leng])
            i = leng
        self.__setCompressionCoef(textIn, textOut)
        return textOut

    def decode(self, textIn):
        LZdict = [""]
        textOut = ""
        i = 0
        while i != len(textIn):
            LZdict.append(LZdict[int(textIn[i])] + textIn[i + 1])
            textOut += LZdict[int(textIn[i])] + textIn[i + 1]
            i += 2
        return textOut

    def __setCompressionCoef(self, textIn, textCode):
        self.compressionCoef = len(textIn) / len(textCode)

    def getCompressionCoef(self):
        if (self.compressionCoef != 0):
            return self.compressionCoef
        else:
            print("Коэффициент сжатия не рассчитан!")


hEncoder = HuffmanEncoder()
lzEncoder = LZEncoder()
textPrim = "Python is a widely used high-level programming language for general-purpose programming, created by Guido van Rossum and first released in 1991."
print(hEncoder.encode(textPrim))
print(hEncoder.getCompressionCoef())
print()
print(lzEncoder.encode(textPrim))
print(lzEncoder.getCompressionCoef())
