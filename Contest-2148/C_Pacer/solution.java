import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            long m = sc.nextLong();
            long prevTime = 0;
            int prevSide = 0;
            long points = 0;
            for(int i=0;i<n;i++){
                long a=sc.nextLong();
                int b=sc.nextInt();
                long dt=a-prevTime;
                if((prevSide^b)==dt % 2){
                    points += dt;
                }
                else points += dt - 1;
                prevTime = a;
                prevSide = b;
            }

            points += m-prevTime;
            System.out.println(points);
        }
    }
}