import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        
        int remove = 0;
        for (int i = 1; i < n; i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                remove++;
            }
        }
        
        System.out.println(remove);
    }
}