import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        while (k > 0 && n > 0) {
            if (n % 10 == 0) {
                n /= 10;
                k--;
            } else {
                long d = n % 10;
                long take = Math.min(k, d);
                n -= take;
                k -= take;
            }
        }

        System.out.println(n);
    }
}