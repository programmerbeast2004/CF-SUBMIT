import java.util.*;
public class Main{
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int[] arr=new int[n];
                for(int i=0;i<n;i++){
                        arr[i]=sc.nextInt();
                }
                int max=arr[0];
                int min=arr[0];
                int maxi=0;
                int mini=0;
                for(int i=0;i<n;i++){
                        if(arr[i]>max){
                                max=arr[i];
                                maxi=i;
                        }
                        if(arr[i]<=min){
                                min=arr[i];
                                mini=i;
                        }
                        
                }
                int moves=maxi+(n-1-mini);
                if(maxi>mini) moves--;
                System.out.println(moves);
        }
}