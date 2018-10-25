import itertools

str = input("Введите строку, из символов которой будут составлены различные комбинации: ")
comb = list(itertools.permutations(str))
comb = list(set(comb))
for elem in comb:
    for l in elem:
        print(l, end="")
    print()
