import java.util.*;
public class Main{
        public static long compute(int[] a){
                long sum=0;
                int mx=0;
                for(int x:a){
                        mx=Math.max(mx,x);
                        sum+=mx;
                }
                return sum;
        }
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                while(t-->0){
                        int n=sc.nextInt();
                        int[] a=new int[n];
                        for(int i=0;i<n;i++){
                                a[i]=sc.nextInt();
                        }
                        long ans=compute(a);
                        for(int i=1;i<n;i++){
                                int curmax=a[i];
                                long sum=curmax;
                                int mx=curmax;
                                for(int j=0;j<n;j++){
                                        if(j==i) continue;
                                        mx=Math.max(mx,a[j]);
                                        sum+=mx;
                                }
                                ans=Math.max(ans,sum);
                        }
                        System.out.println(ans);
                }
        }
}