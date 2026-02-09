import java.util.*;
public class Main{
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                while(t-->0){
                        int n=sc.nextInt();
                        int[] freq=new int[102];
                        
                        for(int i=0;i<n;i++){
                                int x=sc.nextInt();
                                freq[x]++;
                        }
                        int score=0;
                        while(score<=100 && freq[score]>0){
                                score++;
                        }
                        System.out.println(score);
                }
        }
}