public class StaticExample {
    static int result;

    public static void main(String[] args) {
        int[] array = {-3, 20, 5, 16, 27};

        for (int value : array) {
            result = (value % 4 == 0) ? 1 : 0;
            System.out.println(result);
        }

        Triangle t1 = new Triangle(3);
        Triangle t2 = new Triangle(4);
        Triangle.chackTriangles(t1, t2);
    }
}
