import java.util.Scanner;
import java.util.Stack;
public class Num1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();

        int num = 1;
        boolean tr = true;
        for (int i = 0; i < a.length; i++) {
            int su = a[i];
            if (su >= num) {
                while (su >= num) {
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }
            else {
                int p = stack.pop();
                if (n > su) {
                    System.out.println("NO");
                    tr = false;
                    break;
                }

                else {
                    sb.append("-\n");
                }
            }
        }
        if (tr)
            System.out.println(sb.toString());
    }
}
