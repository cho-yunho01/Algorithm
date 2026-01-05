import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Num12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int a[] = new int[num];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Stack<Integer> s = new Stack<Integer>();

        int count = 1;
        for (int i = 0; i < num; i++) {
            if (a[i] == count) {
                count++;
            } else {
                s.add(a[i]);
            }
        }
        boolean tr = true;
        while (!s.isEmpty()) {
            if (s.pop() == count) {
                count++;
            } else {
                tr = false;
                break;
            }
        }
        if (tr) {
            System.out.print("Nice");
        } else {
            System.out.print("Sad");
        }

    }
}
