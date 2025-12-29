import java.util.Scanner;

public class Num34724 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean tr = true;
        int a[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int t = 0; t < m; t++) {
                a[i][t] = str.charAt(t) - '0';
            }
        }

        for (int i = 0; i < n - 1; i++) {
            for (int t = 0; t < m - 1; t++) {
                if (a[i][t] == 1 && a[i][t + 1] == 1 && a[i + 1][t] == 1 && a[i + 1][t + 1] == 1) {
                    tr = false;
                }
            }
        }

        if(tr){
            System.out.print(0);
        }
        else{
            System.out.print(1);
        }

    }


}
