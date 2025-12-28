import java.util.Scanner;

public class Num2741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++){
            if(i<num){
                System.out.println(i);
            }
            else{
                System.out.print(i);
            }
        }
    }
}
