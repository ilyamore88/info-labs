package Bank;

public class Account {
    static String holderName;
    int id;
    double limit;
    double savings;
    double dollarRate;  //Коэффициент относительно доллара. Позже позволит переводить деньги из одного счёта в другой

    public Account(int id, double limit, double savings, double dollarRate) {
        this.id = id;
        this.limit = limit;
        this.savings = savings;
        this.dollarRate = dollarRate;
    }

    public void print() {
        System.out.println("Holder name: " + Account.holderName);
    }

    public void printSaves() {
    }

    public void transferToAccount(Account toAccount, double howMuch) {
        if (howMuch > this.savings) {
            System.out.println("Error!");
        } else {
            toAccount.savings += currencyExchange(howMuch, this.dollarRate, toAccount.dollarRate);
            this.savings -= howMuch;
            if (toAccount.savings > toAccount.limit) {
                this.savings += currencyExchange(toAccount.savings - toAccount.limit, toAccount.dollarRate, this.dollarRate);
                toAccount.savings = toAccount.limit;
                System.out.println("Превышен лимит! Непереведённые деньги возвращены на счёт.");
            }
            this.printSaves();
            toAccount.printSaves();
        }
    }

    static void transferToAccount(Account fromAccount, Account toAccount, double howMuch) {
        fromAccount.transferToAccount(toAccount, howMuch);
    }   //Статический метод для перевода с одного счёта на другой

    static double toDollar(double money, double dollarRate) {
        return money / dollarRate;
    }   //Перевод в доллары

    static double fromDollar(double money, double dollarRate) {
        return money * dollarRate;
    }   //Перевод из долларов

    static double currencyExchange(double money, double fromDollarRate, double toDollarRate) {
        return fromDollar(toDollar(money, fromDollarRate), toDollarRate);
    }   //Перевод из одной валюты в другую

    public void addMoney(double howMuch) {
        if (this.savings + howMuch > this.limit) {
            System.out.println("Вы превысили лимит!");
            System.out.println("Сдача (" + (this.savings + howMuch - this.limit) + ") будет возвращена после операции");
        }
        this.savings = (this.savings + howMuch <= this.limit) ? this.savings + howMuch : this.limit;    //Тернальный оператор (Просто почему бы и нет)
        this.printSaves();
    }

    static void addMoney(Account toAccount, double howMuch) {
        toAccount.addMoney(howMuch);
    }

    public static void setHolderName(String holderName) {
        Account.holderName = holderName;
    }
}
