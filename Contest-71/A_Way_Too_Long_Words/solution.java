import java.util.*;
public class Main{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String word=sc.nextLine();
            if(word.length()>10){
                int mid=word.length()-2;
                String abb=word.charAt(0)+String.valueOf(mid)+word.charAt(word.length()-1);
                System.out.println(abb);
            }
            else{
                System.out.println(word);
            }
        }
    }
}