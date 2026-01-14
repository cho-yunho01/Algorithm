import java.util.Scanner;

public class Num10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(i==num-1){
                sb.append(a+b);
            }
            else{
                sb.append(a+b+"\n");
            }
        }

        System.out.print(sb.toString());
    }
}
