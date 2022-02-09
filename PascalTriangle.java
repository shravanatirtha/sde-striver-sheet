import java.util.*;

public class PascalTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(triangle(n));
        sc.close();
    }
    public static List<List<Integer>> triangle(int n){
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        List<Integer> row;
        List<Integer> prev=null;
        for(int i=0;i<n;i++){
            row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || i==j) row.add(1);
                else row.add(prev.get(j-1)+prev.get(j));
            }
            prev=row;
            list.add(row);
        }
        return list;
    }
}