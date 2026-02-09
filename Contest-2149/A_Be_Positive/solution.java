import java.util.*;
public class Main{
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                while(t-->0){
                        int n=sc.nextInt();
                        int[] a=new int[n];
                        int neg=0, zero=0;
                        for (int i = 0; i < n; i++) {
                                a[i] = sc.nextInt();
                                if (a[i] == -1) neg++;
                                if (a[i] == 0) zero++;
                        }
                        int ops=zero;
                        if(neg%2==1){
                                ops+=2;
                        }
                        System.out.println(ops);
                }
        }
}