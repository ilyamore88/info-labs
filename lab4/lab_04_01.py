import time


class Ticket:

    def __init__(self, date, name, deadline):
        self.createDate = date
        self.owner = name
        self.deadline = deadline

    def __del__(self):
        print("Delete ticket: ", time.asctime(self.createDate))

    def display(self):
        print("Ticket:")
        print(" createDate: ", time.asctime(self.createDate))
        print(" owner: ", self.owner)
        print(" deadline: ", time.asctime(self.deadline))


# создание объект класса
ticket1 = Ticket(time.localtime(), "Ivan Ivanov", \
                 time.strptime("17.12.2017", "%d.%m.%Y"))
# вызов метода
ticket1.display()
# получение значения атрибута
print("Owner: ", ticket1.owner)
print("Owner(getattr): ", getattr(ticket1, "owner"))
# проверка наличия атрибута
print("hasattr: ", hasattr(ticket1, "owner"))
setattr(ticket1, "owner", "Alexei Petrov")  # установка значения атрибута
print("Owner(setattr): ", ticket1.owner)
delattr(ticket1, "owner")  # удаление значения атрибута
if hasattr(ticket1, "owner"):
    print("delattr: ", ticket1.owner)
else:
    print("Attr \"owner\" is deleted")
# del ticket1  # удаление объекта
# print(ticket1)

print("\n")
currentTime = time.strftime("%d %b %Y %H:%M:%S", time.localtime())
print(currentTime)
print("\n")

strTime = "17.07.2017 10:53:00"
entrTime = time.strptime(strTime, "%d.%m.%Y %H:%M:%S")
print(entrTime)
