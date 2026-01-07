import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num14652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
//        int size[][] = new int[a][b];
//        int count = 0;
//        for (int i = 0; i < a; i++) {
//            for (int t = 0; t < b; t++) {
//                size[i][t]=count;
//                if(size[i][t] == num){
//                    System.out.print(i + " "+ t);
//                }
//                count++;
//            }
//        }

        int row = num/b;
        int col = num%b;
        System.out.print(row + " " + col);

    }
}
