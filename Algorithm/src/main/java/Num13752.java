import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num13752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();

            for (int t = 0; t < k; t++) {
                sb.append("=");
            }

            System.out.println(sb.toString());
        }
    }
}
