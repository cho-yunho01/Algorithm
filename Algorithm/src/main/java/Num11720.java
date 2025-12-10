import java.util.Scanner;

public class Num11720 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String str = sc.next();
        char[] c = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum = sum+Integer.parseInt(c[i]+"");
        }
        System.out.print(sum);
    }
}
