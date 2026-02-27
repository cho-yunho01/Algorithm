import java.util.Scanner;

public class Num1470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int totalTime = 0;

        if (a < 0) {
            totalTime = totalTime + (-a) * c;
            totalTime = totalTime + d;
            totalTime = totalTime + b * e;
        } else {
            totalTime = totalTime + (b - a) * e;
        }
        System.out.println(totalTime);
    }
}
