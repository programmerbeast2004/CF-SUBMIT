import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();

            long[] b = new long[n];
            for (int i = 0; i < n; i++) b[i] = sc.nextLong();

            Arrays.sort(a);
            for (int i = 0, j = n - 1; i < j; i++, j--) {
                long tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }

            long[] pref = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                pref[i] = pref[i - 1] + b[i - 1];
            }

            long ans = 0;

            for (int k = 1; k <= n; k++) {
                long x = a[k - 1];

                int l = 0, r = n;
                while (l < r) {
                    int mid = (l + r + 1) / 2;
                    if (pref[mid] <= k) l = mid;
                    else r = mid - 1;
                }

                ans = Math.max(ans, x * l);
            }

            System.out.println(ans);
        }
    }
}