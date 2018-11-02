package Bank;

public class AccountUSD extends Account {
    public AccountUSD(int id, double limit, double savings, double dollarRate) {
        super(id, limit, savings, dollarRate);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Limit: " + this.limit + " USD");
        System.out.println("Savings: " + this.savings + " USD");
        System.out.println("Dollar rate: " + this.dollarRate);
        System.out.println();
    }

    @Override
    public void printSaves() {
        super.printSaves();
        System.out.println("Current balance on USD account is " + this.savings + " USD");
    }
}
