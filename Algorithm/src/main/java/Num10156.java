import java.util.Scanner;

public class Num10156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a * b;
        int result = sum - c;

        if (result < 0) {
            result = 0;
        }

        System.out.println(result);
    }
}
