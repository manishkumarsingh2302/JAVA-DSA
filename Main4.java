import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();

            int aliceScore = 0;
            int bobScore = 0;
            char server = 'A';

            for (int i = 0; i < n; i++) {
                char winner = s.charAt(i);
                if (winner == server) {
                    if (server == 'A') {
                        aliceScore++;
                    } else {
                        bobScore++;
                    }
                } else {
                    server = winner; // Receiver becomes server
                }
            }

            System.out.println(aliceScore + " " + bobScore);
        }

        scanner.close();
    }
}
