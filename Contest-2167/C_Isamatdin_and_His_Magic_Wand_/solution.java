import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            boolean hasEven=false, hasOdd=false;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]%2==0) hasEven=true;
                else hasOdd=true;
            }
            
            if(hasEven && hasOdd){
                Arrays.sort(a);
            }
            for(int i=0;i<n;i++){
                System.out.print(a[i]+(i==n-1?"\n":" "));
            }
        }
    }
}