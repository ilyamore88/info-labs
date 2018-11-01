public class OverloadExample {
    public static void main(String[] args) {
        Plant p1 = new Plant();
        Plant p2 = new Plant("tulip", "purple");
        Plant p3 = new Plant("cactus");
        Plant p4 = new Plant("potato","yellow","Belarus");
        Plant p5 = new Plant("tomato", "red",false);

        p1.print();
        p2.print();
        p3.print();
        p4.print();
        p5.print();
    }
}
