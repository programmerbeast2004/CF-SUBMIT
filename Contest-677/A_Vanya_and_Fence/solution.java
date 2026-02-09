import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int h = sc.nextInt();
        
        int totalWidth = 0;
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            if (height > h) {
                totalWidth += 2;
            } else {
                totalWidth += 1;
            }
        }
        
        System.out.println(totalWidth);
    }
}