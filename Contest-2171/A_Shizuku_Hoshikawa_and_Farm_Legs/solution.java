import java.util.*;
public class Main{
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
                int n=sc.nextInt();
                if(n%2==1){
                        System.out.println(0);
                }
                else{
                        int S=n/2;
                        int ans=S/2+1;
                        System.out.println(ans);
                }
        }
        }
}