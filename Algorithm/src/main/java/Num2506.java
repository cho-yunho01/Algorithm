import java.util.Scanner;

public class Num2506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sum =0;
        int count = 1;
        for(int i=0;i<size;i++){
            int a = sc.nextInt();
            if(a==1){
                sum = sum+count;
                count++;
            }else{
                count = 1;
            }
        }

        System.out.println(sum);
    }
}
