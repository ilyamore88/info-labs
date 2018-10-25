public class SecondClass {
    public static void main(String[] args) {
        String s = "13.7";
        Double a = new Double(s);
        char c = "qwe".charAt(2);
        System.out.println(a);
        System.out.println(c);

        Integer iS = new Integer("135");
        System.out.println(iS);
        iS = Integer.parseInt("135");
        System.out.println(iS);
        String s1 = "Java is one of the best languages!";
        System.out.println(s1.charAt(5));
        System.out.println(s1.equals("Java is one of the most beautiful languages!"));
        System.out.println(s1.indexOf("best"));
    }
}
