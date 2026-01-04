import java.util.Scanner;

public class Num5532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int Aminus=0;
        if(A%C == 0 ){
            Aminus = A/C;
        }
        else{
            Aminus = A/C+1;
        }

        int Bminus=0;
        if(B%D == 0 ){
            Bminus = B/D;
        }
        else{
            Bminus = B/D+1;
        }

        if(Aminus>Bminus){
            System.out.print(L-Aminus);
        }
        else if(Bminus>Aminus){
            System.out.print(L-Bminus);
        }
        else{
            System.out.print(L-Aminus);
        }



    }
}
