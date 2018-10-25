'''
Форматированный ввод/вывод данных
'''
m = 10
pi = 3.1415927
print("m = ", m)
print("m = %d" % m)
print("%7d" % m)
print("pi = ", pi)
print("%.3f" % pi)
print("%10.4f\n" % pi)
print("m = {}, pi = {}".format(m, pi))
ch = 'A'
print("ch = %c" % ch)
s = "Hello"
print("s = %s" % s)
print("\n\n")
code = input("Enter your position number in group: ")
n1, n2 = input("Enter two numbers splitted by space: ").split()
d, m, y = input("Enter three numbers splitted by \'.\': ").split('.')
print("{} + {} = {}".format(n1, n2, float(n1) + float(n2)))
print("Your birthday is %s.%s.%s and you are %d in the group list" % (d, m, y, int(code)))
print("\n\n")

print("m = %4d; pi = %.3f" % (int(m), pi))
print("m = {}; pi = {}".format(m, pi))
print("\n\n")

year = input("Введите номер Вашего курса: ")
print("Вы на %s курсе" % year)
print("\n\n")

r1, m1, p1 = input(
    "Введите ваши баллы по русскому языку, математике и профильному предмету, разделённые запятой: ").split(',')
print("Ваши баллы за ЕГЭ: русский язык - %s б., математика - %s б., профильный предмет - %s б.," % (r1, m1, p1))
print("\n\n")

day = int(input("Введите дату Вашего рождения: "))
root = day % 8 + 2
num1 = int(input("Введите 12-ти разрядное число с основанием %d " % root), root)
print("В десятичной системе Ваше число - %d" % num1)
print("\n\n")

num2 = int(input("Введите число: "))
print("%d * 2 = %d" % (num2, num2 << 1))
print("%d / 2 = %d" % (num2, num2 >> 1))