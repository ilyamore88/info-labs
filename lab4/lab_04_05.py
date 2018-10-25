class Person:

    def __init__(self, firstname, lastname, age):
        self.firstname = firstname
        self.lastname = lastname
        self.age = age

    def display(self):
        print("Firstname: {}\nLastname: {}\nAge: {}\n".format(self.firstname, self.lastname, self.age))


class Student(Person):
    count = 0

    def __init__(self, firstname, lastname, age, recordBook):
        self.firstname = firstname
        self.lastname = lastname
        self.age = age
        self.recordBook = recordBook
        self.studentID = self.count
        Student.count += 1

    def display(self):
        print("Student ID: {}\nFirstname: {}\nLastname: {}\nAge: {}\nStudent's record book: {}\n".format(self.studentID,
                                                                                                       self.firstname,
                                                                                                       self.lastname,
                                                                                                       self.age,
                                                                                                       self.recordBook))


class Professor(Person):
    count = 0

    def __init__(self, firstname, lastname, age, degree):
        self.firstname = firstname
        self.lastname = lastname
        self.age = age
        self.degree = degree
        self.professorID = self.count
        Student.count += 1

    def display(self):
        print("Professor ID: {}\nFirstname: {}\nLastname: {}\nAge: {}\nProfessor's degree: {}\n".format(self.professorID,
                                                                                                      self.firstname,
                                                                                                      self.lastname,
                                                                                                      self.age,
                                                                                                      self.degree))


student1 = Student("Ilya", "Moroz", 17, [5, 5, 5, 4])
student2 = Student("Maria", "Portnova", 18, [3, 2, 2, 3, 2])
student3 = Student("Stepan", "Portnov", 13, [1, 1, 1, 1, 1, 1])
student1.display()
student2.display()
student3.display()

professor1 = Professor("Andrey", "Vladimirovich", 35, "Доцент")
professor2 = Professor("Maria", "Portnova", 18, "Доктор наук компьютерных")
professor3 = Professor("Egor", "Moseev", 44, "Доктор наук")
professor1.display()
professor2.display()
professor3.display()
