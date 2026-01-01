import java.util.Scanner;

public class Num4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == 0 && b ==0){
                break;
            }
            else{
                if(a<b || a==b){
                    sb.append("No \n");
                }
                else {
                    sb.append("Yes\n");
                }

            }
        }

        System.out.println(sb.toString());
    }
}
