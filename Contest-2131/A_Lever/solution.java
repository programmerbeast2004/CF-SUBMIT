import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            int[] b = new int[n];
            String[] partsA = br.readLine().trim().split(" ");
            String[] partsB = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(partsA[i]);
            for (int i = 0; i < n; i++) b[i] = Integer.parseInt(partsB[i]);
            int iterations = 0;
            while (true) {
                iterations++;
                boolean decreased = false;
                for (int i = 0; i < n; i++) {
                    if (a[i] > b[i]) {
                        a[i]--;
                        decreased = true;
                        break;
                    }
                }
                for (int i = 0; i < n; i++) {
                    if (a[i] < b[i]) {
                        a[i]++;
                        break;
                    }
                }
                
                if (!decreased) break;
            }
            
            System.out.println(iterations);
        }
    }
}