package Bank;

public class Main {
    public static void main(String[] args) {
        Account.setHolderName("Ilya Moroz");
        AccountRUB accRub = new AccountRUB(1, 10000, 0, 65.65);
        AccountUSD accUsd = new AccountUSD(2, 10000, 500, 1);
        AccountBYN accByn = new AccountBYN(3, 10000, 500, 2.12);
        accRub.print();
        accUsd.print();
        accByn.print();
        accUsd.transferToAccount(accRub, 100);
        accRub.addMoney(5000);
        Account.transferToAccount(accByn, accUsd, 200);
        Account.addMoney(accByn,9000.5);
    }
}
