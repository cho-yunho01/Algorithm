import java.util.Scanner;

public class Num2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int sum = 0;
        boolean tr = false;
        for(int i=0;i<7;i++){
            int num = sc.nextInt();

            if(num%2!=0){
                tr = true;
                if(min>num){
                    min=num;
                }
                sum = sum+num;

            }

        }

        if(!tr)
            System.out.println("-1");
        else{
            System.out.println(sum);
            System.out.println(min);
        }

    }
}
