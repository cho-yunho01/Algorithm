import java.util.Scanner;

public class Num2522 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int t = 0; t < n - i; t++) {
                System.out.print(" ");
            }
            for (int t = 0; t < i; t++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int t = 0; t < n - i; t++) {
                System.out.print(" ");
            }
            for (int t = 0; t < i; t++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
