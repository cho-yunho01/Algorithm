import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Num10926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for(int i=0;i<3;i++){
            if(i<2)
                sb.append("?");
            else
                sb.append("!");
        }
        System.out.println(sb.toString());
    }
}
