import java.util.Scanner;

public class Num11943 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int o1 = sc.nextInt();
        int a2 = sc.nextInt();
        int o2 = sc.nextInt();
        int num = 0;

        if (a1 + o2 > o1 + a2) {
            num = o1 + a2;
        } else {
            num = a1 + o2;
        }
    }
}
