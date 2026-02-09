import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int[] b=new int[m];
            for(int i=0;i<m;i++){
                b[i]=sc.nextInt();
            }
            int ans=m+n;
            if(n+m >2){
            if (a[n-1] == y - 1 || b[m-1] == x - 1) {
                ans -= 1;
            }
            }
            System.out.println(ans);
        }
    }
}