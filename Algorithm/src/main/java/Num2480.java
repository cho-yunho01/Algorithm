import java.util.Scanner;

public class Num2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int sum=0;

        int n [] = new int[7];
        n[num1]++;
        n[num2]++;
        n[num3]++;
        boolean tr = false;
        for(int i=1;i<=6;i++){
            if(n[i]==3){
                sum = 10000+i*1000+sum;
                tr = true;
            }
            else if(n[i]==2){
                sum = 1000+i*100;
                tr = true;
            }
            else{
                continue;
            }
        }
        int max = 0;
        if(!tr){
            for(int i=1;i<=6;i++){
                if(n[i]==1 && max<i){
                    max = i;
                }
            }
            max = max*100;
            System.out.println(max);
        }
        else{
            System.out.println(sum);
        }


    }
}
