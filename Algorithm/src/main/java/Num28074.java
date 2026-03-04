import java.util.Scanner;

public class Num28074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.contains("M") && input.contains("O")
                && input.contains("B") && input.contains("I") && input.contains("S")) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
