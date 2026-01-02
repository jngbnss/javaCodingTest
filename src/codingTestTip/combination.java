package codingTestTip;

import java.util.*;

public class combination {
    static int n = 5,k=3;
    static int []arr=new int[]{1,2,3,4,5};

    public static void main(String[] args) {
        ArrayList<Integer> b = new ArrayList<Integer>();
        combi(-1,b);
    }

    static void combi(int idx,List<Integer>b){
        if(b.size()==k){
            print(b);
            return;
        }
        for (int i = idx+1; i <n; i++) {
            b.add(arr[i]);
            combi(i,b);
            b.removeLast(); // b.pop_back();

        }
    }
    static void print(List<Integer>b){
        for (Integer integer : b) {
            System.out.print(integer+" ");
        }
        System.out.println();
    }
}
