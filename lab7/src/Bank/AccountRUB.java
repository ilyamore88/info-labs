package Bank;

public class AccountRUB extends Account {
    public AccountRUB(int id, double limit, double savings, double dollarRate) {
        super(id, limit, savings, dollarRate);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Limit: " + this.limit + " RUB");
        System.out.println("Savings: " + this.savings + " RUB");
        System.out.println("Dollar rate: " + this.dollarRate);
        System.out.println();
    }

    @Override
    public void printSaves() {
        super.printSaves();
        System.out.println("Current balance on RUB account is " + this.savings + " RUB");
    }
}
