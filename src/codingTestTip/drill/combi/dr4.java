package codingTestTip.drill.combi;
import java.util.*;
public class dr4 {
    //5C3
    static int n = 5,k= 3;
    static int[]arr = new int[]{1,2,3,4,5};

    public static void main(String[] args) {
        ArrayList<Integer> b = new ArrayList<>();
        combi(-1,b);
    }

    private static void combi(int start, ArrayList<Integer> b) {
        if(b.size()==k){
            for (Integer integer : b) {
                System.out.print(integer+" ");
            }
            System.out.println();
        }
        for (int i=start+1;i<n;i++){
            b.add(arr[i]);
            combi(i,b);
            b.remove(b.size()-1);
        }
    }

}
