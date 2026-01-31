import java.util.Scanner;

public class Num10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            String line = sc.nextLine();
            String[] str = line.split(",");

            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            System.out.println(a + b);
        }

    }
}
