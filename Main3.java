public class Main3 {
    public static void main(String[] args) {
        String str = "Manish";
        String rev = "";

        for (int i = str.length() ; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("Reversed: " + rev);
    }
}
