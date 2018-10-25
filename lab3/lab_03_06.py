'''
Функции
'''


def dictUpdate(a):
    a.update([("x", 5)])
    print("dict in function: ", a)
    return


def dictNoUpdate(a):
    a = a.copy()
    a.update([("y", 3)])
    print("dict in function: ", a)
    return


def returnFunc(a):
    def f1(a):
        print("returned f1(a): ", a)

    return f1


d = {"v": 7}
dictUpdate(d)
print("dict out of function: ", d)
dictNoUpdate(d)
print("dict out of function: ", d)
f = returnFunc(d)
print("f: ", f)
f(2)
print("\n")


def returnMod(num):
    return num % 15


def fact(numF):
    if numF == 0:
        return 1
    else:
        return fact(numF - 1) * numF


num = int(input("Введите число: "))
mod15 = returnMod(num)
print("num % 15 =", mod15)

print(fact(int(input("Факториал: "))))
