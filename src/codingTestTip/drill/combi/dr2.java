package codingTestTip.drill.combi;

import java.util.ArrayList;
public class dr2 {
    static int n = 9,k=4,cnt;
    static int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
    public static void main(String[] args) {
        ArrayList<Integer> b = new ArrayList<>();
        combi(-1,b);
        System.out.println("cnt = " + cnt);
    }

    private static void combi(int startIndex, ArrayList<Integer> b) {
        if(b.size()==k){
            print(b);
            cnt++;
            return;
        }
        for (int i = startIndex+1; i < n; i++) {
            b.add(arr[i]);
            combi(i,b);
            b.remove(b.size()-1);

        }
    }

    private static void print(ArrayList<Integer> b) {
        for (Integer integer : b) {
            System.out.print(integer+" ");

        }

        System.out.println();
    }
}
