import java.util.*;
public class Solution{
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                while(t-->0){
                        int n=sc.nextInt();
                        long[] arr=new long[n];
                        for(int i=0;i<n;i++){
                                arr[i]=sc.nextLong();
                        }
                        long ans=arr[0];
                        long cur=arr[0];
                        for(int i=1;i<n;i++){
                                if(Math.abs(arr[i])%2!=Math.abs(arr[i-1])%2){
                                        cur=Math.max(arr[i],cur+arr[i]);
                                }
                                else{
                                        cur=arr[i];
                                }
                                ans=Math.max(ans,cur);
                        }
                        
                        System.out.println(ans);
                }
        }
}