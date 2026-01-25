import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num1024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken()); // 원하는 합
        int L = Integer.parseInt(st.nextToken()); // 최소 길이

        // 길이를 L부터 100까지 하나씩 시험
        for (int len = L; len <= 100; len++) {
            /*
                N = 25, len = 5
                찾는 모양:

                start, start+1, start+2, start+3, start+4

                쪼개면:

                (start * 5) + (0+1+2+3+4)

                (0+1+2+3+4) 는?
                0+1+2+3+4 = 10

                코드로는

                len*(len-1)/2
                = 5*4/2
                = 10

                그래서 rest는?
                rest = 25 - 10 = 15

                이 말은 곧
                start * 5 = 15
                → start = 3
                👉 실제 수열:
                3 4 5 6 7
                합 = 25
             */

            long rest = N - (long) len * (len - 1) / 2;

            // start가 정수로 나와야 함
            if (rest % len != 0) continue;

            long start = rest / len;

            // 음이 아닌 정수 조건
            if (start < 0) continue;

            // 여기 오면 정답
            for (int i = 0; i < len; i++) {
                System.out.print((start + i) + " ");
            }
            System.out.println();
            return;
        }

        // 끝까지 못 찾으면
        System.out.println(-1);
    }

}
