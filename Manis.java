public class Manis {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World"); // Hello World
        System.out.println(sb);

        sb.insert(6, "Java "); // Hello Java World
        System.out.println(sb);

        sb.replace(6, 10, "Manish"); // Hello Manish World
        System.out.println(sb);

        sb.delete(6, 13); // Hello  World
        System.out.println(sb);

        sb.reverse(); // dlroW olleH
        System.out.println(sb);
    }
}
