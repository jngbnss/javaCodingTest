package d1231.b2.q2605;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            arr[x] = i;
        }
        for (int i : arr1) {
            System.out.print(i+' ');
        }

    }
}
