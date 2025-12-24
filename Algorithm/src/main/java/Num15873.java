import java.util.Scanner;

public class Num15873 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result;
        if (s.length() == 2) {
            result = (s.charAt(0) - '0') + (s.charAt(1) - '0');
        } else if (s.length() == 3) {
            result = 10 + (s.charAt(2) - '0');
        } else {
            result = 20;
        }
        System.out.println(result);
    }
}
