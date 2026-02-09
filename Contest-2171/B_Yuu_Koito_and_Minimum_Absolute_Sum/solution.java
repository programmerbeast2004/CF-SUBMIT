import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            int ans;
            boolean leftKnown = a[0]!=-1;
            boolean rightKnown = a[n-1]!=-1;
            if(leftKnown && rightKnown) ans = Math.abs(a[n-1]-a[0]);
            else ans = 0;
            if(!leftKnown && !rightKnown){
                a[0]=0;
                a[n-1]=0;
            } else if(!leftKnown){
                a[0]=a[n-1];
            } else if(!rightKnown){
                a[n-1]=a[0];
            }
            for(int i=1;i<n-1;i++) if(a[i]==-1) a[i]=0;
            System.out.println(ans);
            StringBuilder sb=new StringBuilder();
            for(int x:a) sb.append(x).append(" ");
            System.out.println(sb.toString().trim());
        }
    }
}