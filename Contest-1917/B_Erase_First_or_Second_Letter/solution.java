import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean[] seen = new boolean[26];
            long ans = 0;
            long dist = 0;

            for (int i = 0; i < n; i++) {
                int idx = s.charAt(i) - 'a';
                if (!seen[idx]) {
                    seen[idx] = true;
                    dist++;
                }
                ans += dist;
            }

            System.out.println(ans);
        }
        sc.close();
    }
}