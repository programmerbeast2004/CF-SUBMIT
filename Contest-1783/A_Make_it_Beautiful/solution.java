import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean same = true;
            for (int i = 1; i < n; i++) {
                if (arr[i] != arr[0]) {
                    same = false;
                    break;
                }
            }

            if (same) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");
            Arrays.sort(arr);

            // print max element first
            System.out.print(arr[n - 1] + " ");
            for (int i = 0; i < n - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}