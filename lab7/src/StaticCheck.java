public class StaticCheck {
    public static void main(String[] args) {
        while (true) {
            StaticContainer.operation();
            if (StaticContainer.counter > 100) {
                break;
            }
        }
        System.out.println(StaticContainer.counter);
    }
}
