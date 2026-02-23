import java.util.Scanner;

public class Num5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        int burger = Math.min(a1, Math.min(a2, a3));
        int drink = Math.min(b1, b2);

        int t = burger + drink - 50;

        System.out.println(t);
    }
}
