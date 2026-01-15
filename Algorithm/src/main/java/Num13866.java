import java.util.Scanner;

public class Num13866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];

        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIndex = 0, minIndex = 0;

        for (int i = 0; i < 4; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
            }
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (i != maxIndex && i != minIndex) {
                sum += a[i];
            }
        }

        System.out.println(Math.abs((max + min) - sum));
    }
}
