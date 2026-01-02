package swea.homework;
import java.io.*;
import java.util.*;
public class q13 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if(a==1){
            if(b==2){
                System.out.println("B");
            }else{
                System.out.println("A");
            }
        }else if(a==2){
            if(b==3) {
                System.out.println("B");
            }else {
                System.out.println("A");
            }
        }else{
            if(b==1){
                System.out.println("B");
            }else {
                System.out.println("A");
            }
        }

    }
}
