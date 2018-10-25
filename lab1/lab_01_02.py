'''
Логические операции
'''
f = True
g = False
print("f: ", f)
print("not f: ", not f)
print("f and g: ", f and g)
print("f or g: ", f or g)
print("f == g: ", f == g)
print("f != g: ", f != g)
print("\n")
h = 3
i = 5
print("h = ", h)
print("i = ", i)
print("h > i: ", h > i)
print("h < i: ", h < i)
print("h >= i: ", h >= i)
print("0 < h <= i: ", 0 < h <= i)
print("\n\n")
'''
Побитовые операции
'''
j = 7
k = 20
print("j = %d; j in binary format: %s" % (j, bin(j)))
print("k = %d; k in binary format: %s" % (k, bin(k)))
print("j & k: %d; binary: %s" % (j & k, bin(j & k)))  # побитовое AND
print("j | k: %d; binary: %s" % (j | k, bin(j | k)))  # побитовое OR
print("j ^ k: %d; binary: %s" % (j ^ k, bin(j ^ k)))  # побитовое XOR
print("~k: %d; binary: %s" % (~k, bin(~k)))  # инверсия двоичного числа
print("k>>1: %d; binary: %s" % (k >> 1, bin(k >> 1)))  # сдвиг на один бит вправо
print("k<<1: %d; binary: %s" % (k << 1, bin(k << 1)))  # сдвиг на один бит влево
print("\n\n")

a = 7014
b = 7021
c = True
d = False
print("NOT(c AND d)\t", not (c and d))
print("c AND d OR NOT(c AND d)\t", c and d or not (c and d))
print("NOT c OR d\t", not c or d)
print("a<=b\t", a <= b)
print("a>b OR a==b\t", a > b or a == b)
print("NOT(a<b)\t", not (a < b))
print("\n\n")

s = 154
p = 6
print("%d in binary format: %s" % (s, bin(s)))
print("%d in binary format: %s" % (p, bin(p)))
s = s | p
print("s | p: %d; binary: %s" % (s, bin(s)))
s = s >> 2
p = p >> 2
print("s >> 2: %d; binary: %s" % (s, bin(s)))
print("p >> 2: %d; binary: %s" % (p, bin(p)))