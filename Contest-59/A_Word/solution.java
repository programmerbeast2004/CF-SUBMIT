import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        int  upper=0;
        for(char c:word.toCharArray()){
            if(Character.isUpperCase(c)) upper++;
        }
        int lower=word.length()-upper;
        
        if (upper > lower) {
            System.out.println(word.toUpperCase());
        } else if(lower>upper){
            System.out.println(word.toLowerCase());
        }
        else{
             System.out.println(word.toLowerCase());

        }
    }
}