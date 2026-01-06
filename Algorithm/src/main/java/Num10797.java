import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num10797 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int a[] = new int[5];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            a[i]=Integer.parseInt(st.nextToken());
        }
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if(a[i] == num){
                count++;
            }
        }
        System.out.print(count  );

    }
}
