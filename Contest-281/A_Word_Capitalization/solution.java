import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        System.out.println(Character.toUpperCase(str.charAt(0))+str.substring(1));
    }
}