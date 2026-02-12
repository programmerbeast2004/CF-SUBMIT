import java.util.*;
public class Main{
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                while(t-->0){
                        long x=sc.nextLong();
                        int c=0;
                        for(long y=x;y<=x+90;y++){
                                if(y-digit(y)==x){
                                        c++;
                                }
                        }
                        System.out.println(c);
                }
        }
        public static int digit(long n){
                int s=0;
                while(n>0){
                        s+=n%10;
                        n/=10;
                }
                return s;
        }
}