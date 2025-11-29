import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Num9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            char a[] = str.toCharArray();
            Queue<Character> q = new LinkedList<>();
            boolean tr = true;

            for (int t = 0; t < a.length; t++) {
                if (a[t] == ')') {
                    if (q.isEmpty() || q.peek() == ')') {
                        tr = false;
                        break;
                    } else if (q.peek() == '(')
                        q.poll();
                } else {
                    q.add(a[t]);
                }
            }

            if (!q.isEmpty())
                tr = false;


            System.out.println(tr ? "YES" : "NO");
        }
    }
}
