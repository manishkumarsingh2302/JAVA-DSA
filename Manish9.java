import java.util.*;

public class Manish9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int[] problems = new int[4];
        for (int i = 0; i < 4; i++) {
            problems[i] = sc.nextInt();
        }
        
        int target = 10;
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (problems[i] >= target) {
                count++;
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}
