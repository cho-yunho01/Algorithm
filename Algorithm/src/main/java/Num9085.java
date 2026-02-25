import java.util.Scanner;

public class Num9085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int sum = 0;

            for (int j = 0; j < n; j++) {
                int num = sc.nextInt();
                sum = sum + num;
            }
            System.out.println(sum);
        }
    }
}
