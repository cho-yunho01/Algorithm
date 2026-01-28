import java.util.Scanner;

public class Num1855 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        int t = str.length() / n;
        char[][] arr = new char[t][n];
        int index = 0;

        for (int i = 0; i < t; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = str.charAt(index++);
                }
            }

            else {
                for (int j = n - 1; j >= 0; j--) {
                    arr[i][j] = str.charAt(index++);
                }
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < t; i++) {
                sb.append(arr[i][j]);
            }
        }
        System.out.println(sb.toString());
    }
}
