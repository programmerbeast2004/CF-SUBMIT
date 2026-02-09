import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String prev = sc.next();
        int gr = 1;
        
        for (int i = 1; i < n; i++) {
            String curr = sc.next();
            if (!curr.equals(prev)) {
                gr++;
            }
            prev = curr;
        }
        
        System.out.println(gr);
    }
}