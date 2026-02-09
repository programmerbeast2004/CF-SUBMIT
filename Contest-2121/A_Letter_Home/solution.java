import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int[] x= new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = sc.nextInt();
            }
            int min=x[0];
            int max=x[n-1];
            int steps=Math.abs(s-min)+Math.abs(max-min);
            int stepsa=Math.abs(s-max)+Math.abs(max-min);
            System.out.println(Math.min(steps,stepsa));
        }
    }
      
}