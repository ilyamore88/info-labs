num = int(input("Введите 12-тиричное число: "), 12)
numS = ""
num1 = abs(num)
while num1 >= 1:
    numS = str(num1 % 14) + numS
    num1 = num1 // 14
if num < 0:
    numS = '-' + numS
print(numS)
