import java.util.Scanner;

public class Num10987 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        System.out.println(count);

    }
}
