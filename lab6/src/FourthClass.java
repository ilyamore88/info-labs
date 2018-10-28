public class FourthClass {
    public static void main(String[] args) {
        int p = 0;
        for (int i = 0; i < 30; i++) {
            if (i % 2 == 0) {
                double d = (double) i / 4;
                System.out.print(d + "; ");
            }
        }
        System.out.println();
        int year = 2016;
        switch (year) {
            case 2014:
                System.out.println("You're 3rd year student");
                break;
            case 2015:
                System.out.println("You're 2nd year student");
                break;
            case 2016:
                System.out.println("You're 1st year student");
                break;
        }

        System.out.println("x1\tx2\tx3\t\tf(x1 && x2 || !x3)");
        for (int x1 = 0; x1 < 2; x1++) {
            for (int x2 = 0; x2 < 2; x2++) {
                for (int x3 = 0; x3 < 2; x3++) {
                    boolean b1 = x1 == 1;
                    boolean b2 = x2 == 1;
                    boolean b3 = x3 == 1;
                    System.out.println(x1 + "\t" + x2 + "\t" + x3 + "\t\t" + (b1 && b2 || !b3));
                }
            }
        }
        System.out.println();

        System.out.println("x1\tx2\tx3\t\tf(x1 && x2 || !x3)");
        int x1 = 0, x2 = 0, x3 = 0;
        while (x1 < 2) {
            while (x2 < 2) {
                while (x3 < 2) {
                    boolean b1 = x1 == 1;
                    boolean b2 = x2 == 1;
                    boolean b3 = x3 == 1;
                    System.out.println(x1 + "\t" + x2 + "\t" + x3 + "\t\t" + (b1 && b2 || !b3));
                    x3++;
                }
                x3 = 0;
                x2++;
            }
            x2 = 0;
            x1++;
        }
        x1 = 0;
        System.out.println();

        System.out.println("x1\tx2\tx3\t\tf(x1 && x2 || !x3)");
        x1 = 0;
        x2 = 0;
        x3 = 0;
        do {
            do {
                do {
                    boolean b1 = x1 == 1;
                    boolean b2 = x2 == 1;
                    boolean b3 = x3 == 1;
                    System.out.println(x1 + "\t" + x2 + "\t" + x3 + "\t\t" + (b1 && b2 || !b3));
                    x3++;
                } while (x3 < 2);
                x3 = 0;
                x2++;
            } while (x2 < 2);
            x2 = 0;
            x1++;
        } while (x1 < 2);
        x1 = 0;
        System.out.println();
    }
}
