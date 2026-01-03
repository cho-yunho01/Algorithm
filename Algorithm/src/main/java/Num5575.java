import java.util.Scanner;

public class Num5575 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {

            int sh = sc.nextInt();
            int sm = sc.nextInt();
            int ss = sc.nextInt();

            int eh = sc.nextInt();
            int em = sc.nextInt();
            int es = sc.nextInt();

            if (es < ss) {
                es += 60;
                em--;
            }

            int s = es - ss;

            if (em < sm) {
                em += 60;
                eh--;
            }

            int m = em - sm;
            int h = eh - sh;

            System.out.print(h + " " + m + " " + s);

        }

    }
}
