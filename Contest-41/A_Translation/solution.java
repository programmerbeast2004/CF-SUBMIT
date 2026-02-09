import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String st1=sc.nextLine();
        String st2=sc.nextLine();
        String reversed = new StringBuilder(st2).reverse().toString();
        
        if(st1.equals(reversed)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}