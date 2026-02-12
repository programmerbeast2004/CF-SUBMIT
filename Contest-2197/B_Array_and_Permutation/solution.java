import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int[] p = new int[n];
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++)
                p[i] = sc.nextInt();
                
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            
            ArrayList<Integer> list = new ArrayList<>();
            list.add(a[0]);
            
            for (int i = 1; i < n; i++) {
                if (a[i] != a[i - 1]) {
                    list.add(a[i]);
                }
            }
            
            int j = 0;
            
            for (int i = 0; i < n && j < list.size(); i++) {
                if (p[i] == list.get(j)) {
                    j++;
                }
            }
            
            if (j == list.size())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}