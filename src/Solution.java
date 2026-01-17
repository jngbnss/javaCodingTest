import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <=t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int []rev = new int[n];
            for(int j=0;j<n;j++){
                rev[j] = arr[n-1-j];
            }
            long ret =0;
            int mx =0;
            for (int j = 0; j <n ; j++) {
                mx = Math.max(mx, rev[j]);
                if (mx == rev[j]){
                    mx = rev[j];
                }else{
                    ret+=(mx-rev[j]);
                }

            }
            System.out.println(ret);
        }

    }
}