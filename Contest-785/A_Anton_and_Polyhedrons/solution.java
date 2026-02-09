import java.util.*;
public class Main{
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                Map<String, Integer> faces = new HashMap<>();
        faces.put("Tetrahedron", 4);
        faces.put("Cube", 6);
        faces.put("Octahedron", 8);
        faces.put("Dodecahedron", 12);
        faces.put("Icosahedron", 20);
        int n=sc.nextInt();
        sc.nextLine();
        long t=0;
        for(int i=0;i<n;i++){
                String s=sc.nextLine();
                t+=faces.get(s);
        }
        System.out.println(t);
        }
}