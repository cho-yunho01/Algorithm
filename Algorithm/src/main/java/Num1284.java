import java.io.IOException;
import java.util.Scanner;

public class Num1284 {
    public static void main(String[] args) throws IOException {
        while(true){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.equals("0")){
            break;
        }
        int sum = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                sum += 2;
            }
            else if(s.charAt(i) == '0'){
                sum += 4;
            }
            else{
                sum += 3;
            }

            if(i == s.length()-1){
                sum += s.length()-1;
            }
        }

            System.out.println(sum+2);


        }
    }
}
