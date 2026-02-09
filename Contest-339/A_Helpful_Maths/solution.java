import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String nums[]=str.split("\\+");
        Arrays.sort(nums);
        System.out.println(String.join("+",nums));
    }
}