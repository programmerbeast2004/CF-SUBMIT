import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            long r=a%b;
            if(r==0){
                System.out.println(0);
            }
            else{
                System.out.println(b-r);
            }
        }
    }
}