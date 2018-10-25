class HammingEncoder:
    __controlBits = 0
    __dataBits = 0;

    def __init__(self, dataBits):
        self.__dataBits = dataBits;
        self.__controlBits = len(bin(self.__dataBits)) - 2

    def encode(self, str1):
        ctrlBits = []
        for i in range(0, self.__controlBits):
            ctrlBits.append([pow(2, i), 0])
            str1 = str1[0:pow(2, i) - 1] + "0" + str1[pow(2, i) - 1:]
        for i in range(0, len(str1)):
            if str1[i] == "1":
                iBin = bin(i + 1)[2:]
                for i1 in range(0, len(iBin)):
                    if iBin[i1] == "1":
                        ctrlBits[len(iBin) - i1 - 1][1] += 1
        print(ctrlBits)
        for i in ctrlBits:
            str1 = str1[:i[0] - 1] + str(i[1] % 2) + str1[i[0]:]
        return str1

    def decode(self, str1):
        str2 = str1
        for i in reversed(range(0, self.__controlBits)):
            str2 = str2[0:pow(2, i) - 1] + str2[pow(2, i):]
        he = HammingEncoder(self.__dataBits)
        str2 = he.encode(str2)
        errorCode = 0
        for i in range(0, len(str1)):
            if str1[i] != str2[i]:
                errorCode += i + 1
        errorCode -= 1
        if str1[errorCode] == "0":
            str1 = str1[0:errorCode] + "1" + str1[errorCode + 1:]
        else:
            str1 = str1[0:errorCode] + "0" + str1[errorCode + 1:]
        return str1


he = HammingEncoder(16)
print(he.encode("0100010000111101"))
print(he.decode("100110000101001011101"))
