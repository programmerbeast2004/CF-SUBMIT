import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int kth=a[k-1];
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]>=kth && a[i]>0){
                c++;
            }
        }
        System.out.println(c);
    }
}