package sorting.q10989;
import java.io.*;
import java.util.*;
public class Main1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            ints[i] = x;
        }
        Arrays.sort(ints);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }
}
