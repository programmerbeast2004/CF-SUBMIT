import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            long g=sc.nextLong();
            for(int i=1;i<n;i++){
                long a=sc.nextLong();
                g=gcd(g, a);
            }
            if(g==1){
                System.out.println(2);
                continue;
            }
            for(int x=2; ; x++){
                if(gcd(g,x)==1){
                    System.out.println(x);
                    break;
                }
            }
        }
    }
    static long gcd(long a, long b){
        while(b != 0){
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}