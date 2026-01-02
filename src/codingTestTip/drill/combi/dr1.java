package codingTestTip.drill.combi;
import java.util.*;

public class dr1 {
    static int n = 5,k=3;
    static int[]arr = new int[]{1,2,3,4,5};

    public static void main(String[] args) {
        ArrayList<Integer> b = new ArrayList<>();
        combi(-1,b);

    }

    private static void combi(int start, ArrayList<Integer> b) {
        if(b.size() ==k){
            print(b);
            return;
        }
        for(int i=start+1;i<n;i++){
            b.add(arr[i]);
            combi(i,b);
            b.remove(b.size()-1);
        }
    }

    private static void print(ArrayList<Integer> b) {
        for (Integer x : b) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
