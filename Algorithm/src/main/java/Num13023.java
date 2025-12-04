import java.util.ArrayList;
import java.util.Scanner;

public class Num13023 {
    static boolean visited[];
    static ArrayList<Integer>[] a;
    static boolean arrive;

    public static void main(String[] args) {

        arrive = false;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        a = new ArrayList[n];

        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            a[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            a[s].add(e);
            a[e].add(s);
        }

        for (int i = 0; i < n; i++) {
            dfs(i, 1);
            if (arrive)
                break;
        }

        if (arrive)
            System.out.println("1");
        else
            System.out.println("0");
    }

    public static void dfs(int now, int depth) {
        if (depth == 5 || arrive) {
            arrive = true;
            return;
        }
        visited[now] = true;
        for (int i : a[now]) {
            if (!visited[i]) {
                dfs(i, depth + 1);
            }
        }
        visited[now] = false;
    }
}
