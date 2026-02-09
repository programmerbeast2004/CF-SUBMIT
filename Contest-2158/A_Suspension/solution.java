import java.util.*;
public class Main{
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                while(t-->0){
                        int n=sc.nextInt();
                        int y=sc.nextInt();
                        int r=sc.nextInt();
                        int max=y/2;
                        int ans=Math.min(n,r+max);
                        System.out.println(ans);
                }
        }
}