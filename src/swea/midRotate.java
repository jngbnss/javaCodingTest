package swea;
import java.io.*;
import java.util.*;
public class midRotate { //Solution
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int idx = 1;
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][n];
            for(int i=0;i<n;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String s = st.nextToken();
                for(int j=0;j<n;j++){
                    arr[i][j] = s.charAt(j);
                }
            }
            // 정답을 한줄씩 만들어서 ret1 ret2 ret3 에다가 저장할 생각인데
            // 이렇게는 안되니까 배열에 저장해야겠다
            String[] ret = new String[n+1];
            // 한번 돌리고 첫번째 행들을 [1]에 저장하고 한칸 띄면 될것같은데
            // for i for j = n-i-1; 이런식이었나
            // 회전하는 것만 연습해보고 해보자



        }
    }

}
