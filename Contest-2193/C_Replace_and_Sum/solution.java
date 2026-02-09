import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            
            long[] a = new long[n];
            long[] b = new long[n];
            
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            for (int i = 0; i < n; i++) b[i] = sc.nextLong();
            
            long[] bestAtPos = new long[n];
            long maxFound = 0;
            
            for (int i = n - 1; i >= 0; i--) {
                maxFound = Math.max(maxFound, Math.max(a[i], b[i]));
                bestAtPos[i] = maxFound;
            }
            
            long[] prefixSum = new long[n + 1];
            for (int i = 0; i < n; i++) {
                prefixSum[i + 1] = prefixSum[i] + bestAtPos[i];
            }
            
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < q; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                sb.append(prefixSum[r] - prefixSum[l - 1]).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}