import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            boolean[] exists = new boolean[n + 1];
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (val <= n) {
                    exists[val] = true;
                }
            }
            
            ArrayList<Integer> nums = new ArrayList<>();
            int[] result = new int[n + 1];
            Arrays.fill(result, -1);
            Queue<Integer> q = new LinkedList<>();
            
            if (exists[1]) {
                result[1] = 1;
            }
            
            for (int i = 2; i <= n; i++) {
                if (exists[i]) {
                    nums.add(i);
                    result[i] = 1;
                    q.add(i);
                }
            }
            
            while (!q.isEmpty()) {
                int curr = q.poll();
                
                for (int val : nums) {
                    long next = (long) curr * val;
                    
                    if (next > n) break;
                    
                    int nextIdx = (int) next;
                    if (result[nextIdx] == -1) {
                        result[nextIdx] = result[curr] + 1;
                        q.add(nextIdx);
                    }
                }
            }
            
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                sb.append(result[i]).append(i == n ? "" : " ");
            }
            System.out.println(sb.toString());
        }
    }
}