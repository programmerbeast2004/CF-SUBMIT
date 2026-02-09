import java.util.*;
public class SmoothArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-- > 0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] c=new int[n];
            for(int i=0;i<n;i++) {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++) {
                c[i]=sc.nextInt();
            }
            System.out.println(solve(n, a, c));
        }
    }
    
    static long solve(int n, int[] a, int[] c) {
        long[] dp = new long[n + 1];
        Arrays.fill(dp,Long.MAX_VALUE);
        dp[n]=0;
        for (int i=0;i<n;i++) {
            long[] newDp=new long[n+1];
            Arrays.fill(newDp,Long.MAX_VALUE);
            for (int j=0;j<=n;j++){
                if(dp[j] !=Long.MAX_VALUE){
                    newDp[j]=Math.min(newDp[j],dp[j]+c[i]);
                }
            }
            for(int j=0;j<=n;j++) {
                if (dp[j] !=Long.MAX_VALUE) {
                    if (j==n || a[i]>=a[j]) {
                        newDp[i]=Math.min(newDp[i], dp[j]);
                    }
                }
            }
            dp = newDp;
        }
        
        long ans=Long.MAX_VALUE;
        for(int j=0;j<=n;j++) {
            ans=Math.min(ans,dp[j]);
        }
        return ans;
    }
}