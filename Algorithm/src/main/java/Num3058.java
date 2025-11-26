import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num3058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int [][] a = new int[size][7];

        for(int j=0;j<size;j++){
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<7;i++){
                a[j][i]= Integer.parseInt(st.nextToken());
            }
        }

        for(int j=0;j<size;j++){
            int min =Integer.MAX_VALUE;
            int sum=0;
            for(int i=0;i<7;i++){
                if(a[j][i]%2==0){
                    sum = a[j][i]+sum;
                    if(min>a[j][i])
                        min=a[j][i];
                }
            }
            System.out.println(sum + " "+ min);
        }




    }
}
