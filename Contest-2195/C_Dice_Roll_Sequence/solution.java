import java.util.*;

public class Main {

    static final int INF = 1000000000;

    static int opposite(int x) {
        if (x == 1) return 6;
        if (x == 6) return 1;
        if (x == 2) return 5;
        if (x == 5) return 2;
        if (x == 3) return 4;
        return 3; // x == 4
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int[] prev = new int[7];
            int[] curr = new int[7];

            for (int x = 1; x <= 6; x++) {
                prev[x] = (a[0] == x) ? 0 : 1;
            }

            for (int i = 1; i < n; i++) {
                Arrays.fill(curr, INF);

                for (int x = 1; x <= 6; x++) {
                    int cost = (a[i] == x) ? 0 : 1;

                    for (int y = 1; y <= 6; y++) {
                        if (y != x && y != opposite(x)) {
                            curr[x] = Math.min(curr[x], prev[y] + cost);
                        }
                    }
                }

                int[] temp = prev;
                prev = curr;
                curr = temp;
            }

            int ans = INF;
            for (int x = 1; x <= 6; x++) {
                ans = Math.min(ans, prev[x]);
            }

            System.out.println(ans);
        }
    }
}