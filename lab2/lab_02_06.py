num = int(input("Введите 16-тиричное 8-ми разрядное число: "), 16)
if num >= 0:
    print("Дополнительный код: ", bin(num))
else:
    numS = bin(num)[3:]
    numS = numS.replace('0', '2')
    numS = numS.replace('1', '0')
    numS = numS.replace('2', '1')
    numS = '1' + numS
    num = int(numS, 2) + 1
    print("Дополнительный код:", bin(num))
