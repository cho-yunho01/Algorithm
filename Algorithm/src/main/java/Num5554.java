import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num5554 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int time =  Integer.parseInt(st.nextToken());
            sum += time;
        }
        int minute = sum / 60;
        int second = sum % 60;
        System.out.println(minute);
        System.out.print(second);
    }
}
