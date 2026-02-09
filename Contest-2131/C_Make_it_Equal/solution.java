import java.io.*;
import java.util.*;
public class Main {
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        FastScanner() { br = new BufferedReader(new InputStreamReader(System.in)); }
        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                String line = br.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }
        int nextInt() throws IOException { return Integer.parseInt(next()); }
        long nextLong() throws IOException { return Long.parseLong(next()); }
    }
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = fs.nextInt();
            long k = fs.nextLong();
            Map<Long, Long> cntS = new HashMap<>();
            Map<Long, Long> cntT = new HashMap<>();
            for (int i = 0; i < n; i++) {
                long x = fs.nextLong();
                long r = x % k;
                cntS.put(r, cntS.getOrDefault(r, 0L) + 1L);
            }
            for (int i = 0; i < n; i++) {
                long x = fs.nextLong();
                long r = x % k;
                cntT.put(r, cntT.getOrDefault(r, 0L) + 1L);
            }
            Set<Long> keys = new HashSet<>();
            keys.addAll(cntS.keySet());
            keys.addAll(cntT.keySet());
            boolean ok = true;
            Set<Long> seen = new HashSet<>();
            for (long r : keys) {
                if (seen.contains(r)) continue;
                long opp = (k - r) % k; // partner residue
                if (r == opp) {
                    // self-pair: must match exactly
                    long sCnt = cntS.getOrDefault(r, 0L);
                    long tCnt = cntT.getOrDefault(r, 0L);
                    if (sCnt != tCnt) { ok = false; break; }
                    seen.add(r);
                } else {
                    long sSum = cntS.getOrDefault(r, 0L) + cntS.getOrDefault(opp, 0L);
                    long tSum = cntT.getOrDefault(r, 0L) + cntT.getOrDefault(opp, 0L);
                    if (sSum != tSum) { ok = false; break; }
                    seen.add(r);
                    seen.add(opp);
                }
            }
            sb.append(ok ? "YES\n" : "NO\n");
        }
        System.out.print(sb.toString());
    }
}