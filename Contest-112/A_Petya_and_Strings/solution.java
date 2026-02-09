import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        
        int comp=str1.compareTo(str2);
        if(comp>0){
            System.out.println(1);
        }
        else if(comp<0){
            System.out.println(-1);
        }
        else{
            System.out.println(0);
        }
    }
    
}