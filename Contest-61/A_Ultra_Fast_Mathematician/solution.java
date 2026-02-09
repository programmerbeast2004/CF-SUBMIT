import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<a.length();i++){
            res.append(a.charAt(i)==b.charAt(i) ? '0':'1');
        }
        System.out.println(res);
    }
}