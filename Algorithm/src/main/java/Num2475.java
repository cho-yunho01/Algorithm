import java.util.Scanner;

public class Num2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] a = str.split(" ");
        int sum =0;
        for(int i = 0;i<a.length;i++){
            int b = Integer.parseInt(a[i]);
            sum = b*b+sum;
        }

        System.out.println(sum%10);


    }
}
