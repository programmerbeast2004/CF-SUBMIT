import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int[] sorted=a.clone();
            Arrays.sort(sorted);
            boolean[] visited=new boolean[n];
            boolean possible=true;
            for(int i=1;i<=n;i++){
                if(visited[i-1])continue;
                List<Integer>compA=new ArrayList<>();
                List<Integer>compS=new ArrayList<>();
                int cur=i;
                while(cur<=n) {
                    if(visited[cur-1]) break;
                    visited[cur-1]=true;
                    compA.add(a[cur-1]);
                    compS.add(sorted[cur-1]);
                    cur *= 2;
                }
                Collections.sort(compA);
                Collections.sort(compS);

                if (!compA.equals(compS)) {
                    possible=false;
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
    }
}