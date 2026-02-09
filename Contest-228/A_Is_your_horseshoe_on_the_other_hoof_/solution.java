import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        Set<Integer> s = new HashSet<>();
        s.add(a);
        s.add(b);
        s.add(c);
        s.add(d);
        System.out.println(4 - s.size());
    }
}