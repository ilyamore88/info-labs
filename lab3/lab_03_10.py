text1 = open("text1.txt", "r")
text = text1.read()
textSet = set(text.split())
textDict = {}
for key in textSet:
    textDict[key] = text.count(key)
for item in textDict.items():
    print(item)
text1.close()
