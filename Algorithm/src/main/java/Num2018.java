import java.util.Scanner;

public class Num2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 1;
        int e = 1;

        int sum = 1;
        int count = 1;

        while (e != n) {
            if (sum == n) {
                count++;
                e++;
                sum = sum + e;

            } else if (sum > n) {
                s++;
                sum = sum - s;

            } else {
                e++;
                sum = sum + e;
            }
        }
        System.out.println(count);
    }
}
