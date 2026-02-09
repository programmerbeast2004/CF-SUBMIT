import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        while (true) {
            y++;
            if (isBeautiful(y)) {
                System.out.println(y);
                break;
            }
        }
    }
    private static boolean isBeautiful(int year) {
        String s = String.valueOf(year);
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) return false;
            set.add(c);
        }
        return true;
    }
}