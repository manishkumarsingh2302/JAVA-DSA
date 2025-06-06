public class StringExample {
    public static void main(String[] args) {
        String name = "Java Programming";

        System.out.println("Original: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Char at 2nd position: " + name.charAt(1));
        System.out.println("Substring (5 to 16): " + name.substring(5, 16));
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Contains 'gram': " + name.contains("gram"));
        System.out.println("Replaced: " + name.replace("a", "@"));
    }
}
