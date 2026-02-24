import java.util.Scanner;

public class Num5596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = 0;
        int t = 0;


        for (int i = 0; i < 4; i++) {
            int num = sc.nextInt();
            s = s + num;
        }


        for (int i = 0; i < 4; i++) {
            int num = sc.nextInt();
            t = t + num;
        }

        System.out.println(Math.max(s, t));

    }
}
