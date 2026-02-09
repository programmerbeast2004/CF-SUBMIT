import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[] b=new long[n];
            for(int i=0;i<n;i++){
                b[i]=sc.nextLong();
            }
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                long prevB=(i==0)?0:b[i-1];
                long diff=b[i]-prevB;
                long lastPos=i-diff;
                if(lastPos>=0 && lastPos<i){
                    a[i]=a[(int)lastPos];
                } else{
                    a[i]=i+1;
                }
            }
            
            for(int i=0;i<n;i++){
                System.out.print(a[i]);
                if(i<n-1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}