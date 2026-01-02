package swea.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int ret =0;
        for (int i = 0; i < s.length(); i++) {
            ret+=(int)s.charAt(i)-'0';
        }
        System.out.println(ret);
    }
}
