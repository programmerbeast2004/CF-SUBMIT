import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            int[] pref = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
                pref[i] = (pref[i - 1] + a[i]) % 3;
            }

            boolean found = false;
            for (int l = 1; l < n && !found; l++) {
                for (int r = l + 1; r < n; r++) {
                    int s1 = pref[l];
                    int s2 = (pref[r] - pref[l] + 3) % 3;
                    int s3 = (pref[n] - pref[r] + 3) % 3;

                    if ((s1 == s2 && s2 == s3) || 
                        (s1 != s2 && s1 != s3 && s2 != s3)) {
                        System.out.println(l + " " + r);
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                System.out.println("0 0");
            }
        }
    }
}