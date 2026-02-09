import java.util.*;

public class ShashlikGrill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long k = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long count1 = 0;
            long temp1 = k;
            while (temp1 >= a) {
                long times = (temp1 - a) / x + 1;
                count1 += times;
                temp1 -= times * x;
            }
            while (temp1 >= b) {
                long times = (temp1 - b) / y + 1;
                count1 += times;
                temp1 -= times * y;
            }

            long count2 = 0;
            long temp2 = k;
            while (temp2 >= b) {
                long times = (temp2 - b) / y + 1;
                count2 += times;
                temp2 -= times * y;
            }
            while (temp2 >= a) {
                long times = (temp2 - a) / x + 1;
                count2 += times;
                temp2 -= times * x;
            }
            System.out.println(Math.max(count1, count2));
        }
    }
}