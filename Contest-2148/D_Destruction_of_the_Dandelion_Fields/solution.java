import java.io.*;
import java.util.*;

public class Main {
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }
        long nextLong() throws IOException {
            int c;
            while ((c = read()) <= ' ') if (c == -1) return Long.MIN_VALUE;
            int sign = 1;
            if (c == '-') { sign = -1; c = read(); }
            long val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }
        int nextInt() throws IOException { return (int) nextLong(); }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder sb = new StringBuilder();
        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            long sumEven = 0L;
            ArrayList<Long> odds = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                long x = fs.nextLong();
                if ((x & 1L) == 0L) sumEven += x;
                else odds.add(x);
            }
            int k = odds.size();
            if (k == 0) {
                sb.append("0\n");
                continue;
            }
            Collections.sort(odds, Collections.reverseOrder());
            int take = (k + 1) / 2;
            long sumTake = 0L;
            for (int i = 0; i < take; ++i) sumTake += odds.get(i);
            sb.append(sumEven + sumTake).append('\n');
        }
        System.out.print(sb.toString());
    }
}