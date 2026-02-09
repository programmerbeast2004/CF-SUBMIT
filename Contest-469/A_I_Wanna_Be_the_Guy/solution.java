import java.util.*;
public class Main{
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                Set<Integer> set=new HashSet<>();
                int p=sc.nextInt();
                for(int i=0;i<p;i++){
                        set.add(sc.nextInt());
                }
                int q=sc.nextInt();
                for(int j=0;j<q;j++){
                        set.add(sc.nextInt());
                }
                if(set.size()==n){
                        System.out.println("I become the guy.");
                }
                else{
                        System.out.println("Oh, my keyboard!");
                }
        }
}