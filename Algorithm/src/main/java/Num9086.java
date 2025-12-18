import java.util.Scanner;

public class Num9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<num;i++){
            String str = sc.nextLine();
            if(str.length()==1){
                System.out.print(str);
                System.out.print(str);
                System.out.println();
            }
            else{
                char c [] = str.toCharArray();
                System.out.print(c[0]);
                System.out.println(c[c.length-1]);
            }


        }
    }
}
