public class Main {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println(a == b); // true (same pool reference)
        System.out.println(a == c); // false (c is a new object)
    }
}
\