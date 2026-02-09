import java.util.*;

public class Preparing_Olympiad {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int x = sc.nextInt();

        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }

        System.out.println(Number_Way(c, l, r, x));
    }

    public static int Number_Way(int[] c, int l, int r, int x) {
        int n = c.length;
        int count = 0;

        for (int mask = 0; mask < (1 << n); mask++) {
            if (Fast(mask) >= 2 && isPossible(c, l, r, x, mask)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPossible(int[] c, int l, int r, int x, int mask) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int idx = 0;

        while (mask > 0) {
            if ((mask & 1) == 1) {
                sum += c[idx];
                min = Math.min(min, c[idx]);
                max = Math.max(max, c[idx]);
            }
            mask >>= 1;
            idx++;
        }

        return sum >= l && sum <= r && (max - min) >= x;
    }

    public static int Fast(int n) {
        int ans = 0;
        while (n > 0) {
            ans++;
            n = n & (n - 1);
        }
        return ans;
    }
}