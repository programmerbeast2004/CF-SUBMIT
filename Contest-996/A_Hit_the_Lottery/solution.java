import java.util.*;
public class Main{
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int[] notes={100,20,10,5,1};
                int ct=0;
                for(int note:notes){
                        ct+=n/note;
                        n%=note;
                }
                System.out.println(ct);
        }
}