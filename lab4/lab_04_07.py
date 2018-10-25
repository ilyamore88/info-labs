import textwrap


class Row:
    count = 0

    def __init__(self, collection, value):
        self.collection = collection
        self.value = value
        self.id = Row.count
        self.countOne = 0
        for i in self.collection:
            self.countOne += i
        Row.count += 1


class Table:

    def __init__(self, rowsNum):
        self.rowsNum = rowsNum
        self.rows = []

    def addRow(self, row):
        for rowi in self.rows:
            if rowi.id == row.id:
                print("Строка с указаным id уже существует")
                return 1
        self.rows.append(row)
        return 0

    def setRow(self, row):
        for rowi in self.rows:
            if rowi.id == row.id:
                self.rows[self.rows.index(rowi)] = row
                return 0
        print("Строки с указаным id не существует")
        return 1

    def getRow(self, rowId):
        for rowi in self.rows:
            if rowi.id == rowId:
                return rowi
        print("Строки с указаным id не существует")
        return 1

    def display(self):
        print("id", end="\t")
        for i in range(0, len(self.rows[0].collection)):
            print("x" + str(i + 1), end="\t")
        print("\tf(x1,x2)")
        for row in self.rows:
            print(row.id, end="\t")
            for i in row.collection:
                print(i, end="\t")
            print("|\t{}".format(row.value))


class LogicFunction:

    def __init__(self, variablesNum, table):
        self.variablesNum = variablesNum
        self.table = table

    def getExpression(self):
        # Шаг 1 - получение импликантов
        # Расчёт длины Хемминга
        def hammingDist(a, b):
            d = 0
            for i in range(len(a)):
                if (a[i] != b[i]):
                    d += 1
            return d

        # Возвращает импликант (комбинирует a и b с заменой отличающихся символов на '-'
        def comb(a, b):
            res = ""
            for i in range(len(a)):
                if a[i] == b[i]:
                    res += a[i]
                else:
                    res += "-"
            return res

        # Возвращает список импликантов
        def getImplicants(listImp):
            result = []
            isEnd = True
            for i in range(len(listImp)):
                isCombine = False
                for j in range(len(listImp)):
                    if hammingDist(listImp[i], listImp[j]) == 1:
                        isCombine = True
                        isEnd = False
                        resComb = comb(listImp[i], listImp[j])
                        if not (resComb in result):
                            result.append(resComb)
                if isCombine == False:
                    result.append(listImp[i])
            if isEnd:
                return result
            else:
                return getImplicants(result)

        # Получение значений переменных в строках с занчением истинности
        collections = []
        for row in self.table.rows:
            if row.value == 1:
                collections.append("".join(str(elem) for elem in row.collection))
        # Получения списка импликантов
        implicants = getImplicants(collections)
        print(implicants)

        # Этап 2
        # Проверка на поглощение минтермы импликантом
        def isMatch(collection, implicant):
            for i in range(len(collection)):
                if (implicant[i] != collection[i]) and (implicant[i] != "-"):
                    return False
            return True

        # Нахождение суммы элементов колонки с индексом columnIndex, возвращает индекс строки, где была 1
        def columnSum(table, indexColumn):
            sum = 0
            indexRow = 0
            for i in range(len(table)):
                if table[i][indexColumn] == 1:
                    sum += 1
                    indexRow = i
            return sum, indexRow

        # Находит строку с максимальным кол-вом единиц
        def maxRowSum(table):
            max = 0
            index = 0
            for i in range(len(table)):
                summ = sum(table[i])
                if summ > max:
                    max = summ
                    index = i
            return index

        # Удаляет столбцы, у которых в строке с индексом rowIndex стоит 1 (в indexColumnStart передаём номер столбца, с которого начинать проверку, по умолчанию 0)
        def deleteColumns(table, indexRow, indexColumnStart=0):
            if sum(table[indexRow]) == 0:
                return
            if table[indexRow][indexColumnStart] == 1:
                for j in range(len(table)):
                    del table[j][indexColumnStart]  # Удаление столбца
                deleteColumns(table, indexRow, indexColumnStart)
            else:
                deleteColumns(table, indexRow, indexColumnStart + 1)

        # Получение функции
        def getFunction(table, implicants):
            func = ""
            for i in range(len(table[0])):
                sum, indexRow = columnSum(table, i)
                if sum == 1:
                    deleteColumns(table, indexRow)
                    del table[indexRow]  # Удаление строки
                    func += implicants.pop(indexRow)
                    break
                else:
                    indexRow = maxRowSum(table)
                    deleteColumns(table, indexRow)
                    del table[indexRow]
                    func += implicants.pop(indexRow)
            if (len(table) == 0) or (len(table[0]) == 0):
                return func
            func += getFunction(table, implicants)
            return func

        table = []
        for i in range(len(implicants)):
            table.append([])
            for collection in collections:
                table[i].append(1 if isMatch(collection, implicants[i]) else 0)
        print(table)
        func = getFunction(table, implicants)

        # Парсер функции (её подготовка к выводу)
        funcs = textwrap.wrap(func, self.variablesNum)  # Разбитие функции на подфункции длиной variablesNum
        print(funcs)
        funcResult = ""
        for func in funcs:
            funcResult += "("
            for i in range(len(func)):
                if func[i] == "1":
                    funcResult += "x" + str(i + 1) + " and "
                elif func[i] == "0":
                    funcResult += "not(x" + str(i + 1) + ") and "
            funcResult = funcResult[:len(funcResult) - 5] + ") or "
        funcResult = funcResult[:len(funcResult) - 4]
        return funcResult

    def getTable(self):
        return self.table

    def printTable(self):
        self.table.display()


# rows = [
#     Row([0, 0, 0, 0], 0),
#     Row([0, 0, 0, 1], 0),
#     Row([0, 0, 1, 0], 0),
#     Row([0, 0, 1, 1], 0),
#     Row([0, 1, 0, 0], 1),
#     Row([0, 1, 0, 1], 0),
#     Row([0, 1, 1, 0], 0),
#     Row([0, 1, 1, 1], 0),
#     Row([1, 0, 0, 0], 1),
#     Row([1, 0, 0, 1], 1),
#     Row([1, 0, 1, 0], 1),
#     Row([1, 0, 1, 1], 1),
#     Row([1, 1, 0, 0], 1),
#     Row([1, 1, 0, 1], 0),
#     Row([1, 1, 1, 0], 1),
#     Row([1, 1, 1, 1], 1)
# ]

# rows = [
#     Row([0, 0], 1),
#     Row([0, 1], 0),
#     Row([1, 0], 0),
#     Row([1, 1], 1),
# ]

rows = [
    Row([0, 0, 0, 0], 0),
    Row([0, 0, 0, 1], 0),
    Row([0, 0, 1, 0], 1),
    Row([0, 0, 1, 1], 1),
    Row([0, 1, 0, 0], 0),
    Row([0, 1, 0, 1], 0),
    Row([0, 1, 1, 0], 0),
    Row([0, 1, 1, 1], 0),
    Row([1, 0, 0, 0], 1),
    Row([1, 0, 0, 1], 1),
    Row([1, 0, 1, 0], 1),
    Row([1, 0, 1, 1], 0),
    Row([1, 1, 0, 0], 0),
    Row([1, 1, 0, 1], 1),
    Row([1, 1, 1, 0], 0),
    Row([1, 1, 1, 1], 1)
]

table1 = Table(len(rows))
for row in rows:
    table1.addRow(row)
table1.display()

lf1 = LogicFunction(4, table1)
print(lf1.getExpression())
