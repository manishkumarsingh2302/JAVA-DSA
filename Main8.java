import java.util.*;

public class Main8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  
        while (T-- > 0) {
            int maxT = sc.nextInt();
            int maxN = sc.nextInt();
            int sumN = sc.nextInt();
            int fullCases = Math.min(sumN / maxN, maxT);
            int remaining = sumN - fullCases * maxN;
            long total = (long) fullCases * maxN * maxN;
            if (fullCases < maxT && remaining > 0) {
                total += (long) remaining * remaining;
            }
            
            System.out.println(total);
        }
        
        sc.close();
    }
}
