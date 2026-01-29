import java.util.Scanner;

public class Num11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sb.append("Case #"+ i +": "+n+" + "+m+" = "+ (n+m)+"\n");
        }
        System.out.print(sb.toString());
    }
}
