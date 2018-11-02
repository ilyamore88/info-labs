package Bank;

public class AccountBYN extends Account {
    public AccountBYN(int id, double limit, double savings, double dollarRate) {
        super(id, limit, savings, dollarRate);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Limit: " + this.limit + " BYN");
        System.out.println("Savings: " + this.savings + " BYN");
        System.out.println("Dollar rate: " + this.dollarRate);
        System.out.println();
    }

    @Override
    public void printSavings() {
        super.printSavings();
        System.out.println("Current balance on BYN account is " + this.savings + " BYN");
    }
}
