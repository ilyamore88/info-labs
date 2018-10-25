def encodeHuffman(fileIn, fileOut):
    fileIn = open(fileIn, "r")
    text = fileIn.read()
    textSet = set(text)
    textList = []
    for key in textSet:
        textList.append([text.count(key), key])
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
        text = text.replace(l[0], l[1])
    fileOut = open(fileOut, "w")
    fileOut.write(text + "\n")
    for l in codeL:
        fileOut.write(l[0] + " " + l[1] + "\n")
    fileIn.close()
    fileOut.close()
    return True


def decodeHuffman(fileIn, fileOut):
    fileIn = open(fileIn, "r")
    text = ""
    huffDict = {}
    for i in fileIn:
        if text == "":
            text = i.replace("\n", "")
        else:
            l, code = i.split()
            huffDict[code] = l
    fileOut = open(fileOut, "w")
    leng = 1
    while text != "":
        if text[0:leng] in huffDict.keys():
            fileOut.write(huffDict[text[0:leng]])
            text = text[leng:]
            leng = 1
        else:
            leng += 1
    fileIn.close()
    fileOut.close()
    return True


def encodeLZ(fileIn, fileOut):
    fileIn = open(fileIn, "r")
    text = fileIn.read()
    textCode = ""
    LZdict = [""]
    i = 0
    while i != len(text):
        leng = 1
        while (text[i:leng] in LZdict) and (leng != len(text)):
            leng += 1
        textCode = textCode + str(LZdict.index(text[i:leng - 1])) + text[leng - 1]
        LZdict.append(text[i:leng])
        i = leng
    fileOut = open(fileOut, "w")
    fileOut.write(textCode)
    fileIn.close()
    fileOut.close()
    return True


def decodeLZ(fileIn, fileOut):
    fileIn = open(fileIn, "r")
    text = fileIn.read()
    LZdict = [""]
    i = 0
    fileOut = open(fileOut, "w")
    while i != len(text):
        LZdict.append(LZdict[int(text[i])] + text[i + 1])
        fileOut.write(LZdict[int(text[i])] + text[i + 1])
        i += 2
    fileIn.close()
    fileOut.close()
    return True


encodeHuffman("huffmanIn.txt", "huffmanOut.txt")
encodeLZ("lzIn.txt", "lzOut.txt")

fileIn = open("huffmanIn.txt", "r")
textHufIn = fileIn.read()
fileIn.close()
fileIn = open("huffmanOut.txt", "r")
textHufOut = fileIn.read()
textHufOut = textHufOut[0:textHufOut.index("\n")]
fileIn.close()
fileIn = open("lzIn.txt", "r")
textLZIn = fileIn.read()
fileIn.close()
fileIn = open("lzOut.txt", "r")
textLZOut = fileIn.read()
fileIn.close()

print("Huffman message: ", textHufIn)
print("Huffman encode message: ", textHufOut)
print("Коэффициент сжатия: ", len(textHufIn) * 8 / len(textHufOut))
print("\n")

print("LZ message: ", textLZIn)
print("LZ encode message: ", textLZOut)
print("Коэффициент сжатия: ", len(textLZIn) / len(textLZOut))