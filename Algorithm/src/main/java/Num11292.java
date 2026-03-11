import java.util.Scanner;

public class Num11292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            String[] name = new String[n];
            double[] h = new double[n];

            double max = 0.0;

            for (int i = 0; i < n; i++) {
                name[i] = sc.next();
                h[i] = sc.nextDouble();
                if (h[i] > max) {
                    max = h[i];
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (h[i] == max) {
                    sb.append(name[i]).append(" ");
                }
            }

            System.out.println(sb.toString().trim());
        }

    }
}
