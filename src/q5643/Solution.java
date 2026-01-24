package q5643;

import java.io.*;
import java.util.*;

public class Solution {
    static ArrayList<Integer>[] upper;
    static ArrayList<Integer>[] down;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = br.readLine();
        if (firstLine == null) return;

        int t = Integer.parseInt(firstLine.trim());
        StringBuilder finalResult = new StringBuilder();

        for (int idx = 1; idx <= t; idx++) {
            // N 읽기 (빈 줄 방어 로직)
            int n = nextInt(br);
            // M 읽기
            int m = nextInt(br);

            upper = new ArrayList[n + 1];
            down = new ArrayList[n + 1];

            for (int i = 1; i <= n; i++) {
                upper[i] = new ArrayList<>();
                down[i] = new ArrayList<>();
            }

            // M개의 간선 정보 읽기
            for (int i = 0; i < m; i++) {
                int a = nextInt(br);
                int b = nextInt(br);
                upper[a].add(b);
                down[b].add(a);
            }

            int ret = 0;
            for (int i = 1; i <= n; i++) {
                visited = new boolean[n + 1];
                int upCount = dfs(i, upper) - 1;

                visited = new boolean[n + 1];
                int downCount = dfs(i, down) - 1;

                if (upCount + downCount == n - 1) {
                    ret++;
                }
            }
            finalResult.append("#").append(idx).append(" ").append(ret).append("\n");
        }
        System.out.print(finalResult);
    }

    // [핵심] 빈 줄이나 공백이 몇 개가 있든 다음 숫자만 찾아주는 메서드
    static StringTokenizer st;
    static int nextInt(BufferedReader br) throws IOException {
        while (st == null || !st.hasMoreElements()) {
            String line = br.readLine();
            if (line == null) return -1;
            st = new StringTokenizer(line);
        }
        return Integer.parseInt(st.nextToken());
    }

    static int dfs(int now, ArrayList<Integer>[] adj) {
        visited[now] = true;
        int count = 1;
        for (int next : adj[now]) {
            if (!visited[next]) {
                count += dfs(next, adj);
            }
        }
        return count;
    }
}