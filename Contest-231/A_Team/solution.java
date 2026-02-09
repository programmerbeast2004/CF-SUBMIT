import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int sum=a+b+c;
            if(sum>=2){
            count++;
        }
        }
        System.out.println(count);
        
    }
}