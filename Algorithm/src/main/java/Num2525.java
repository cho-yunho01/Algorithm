import java.util.Scanner;

public class Num2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int add = sc.nextInt();

        int sum = num2+add;

        while((sum>59)){
            sum=sum-60;
            num1=num1+1;
        };

        while(num1>23){
            num1=num1-24;
        };
        System.out.println(num1 + " "+sum);
    }
}
