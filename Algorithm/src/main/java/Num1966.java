import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Num1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(st.nextToken());

        for(int i=0;i<num;i++){
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int a[] = new int[m];

            st = new StringTokenizer(br.readLine());

            for(int j=0;j<m;j++){
                a[j] = Integer.parseInt(st.nextToken());
            }
            int count = 0;
            Deque<Integer> deque = new ArrayDeque<>();
            for(int j=0;j<m;j++){
                deque.add(a[j]);
            }
            while(deque.getFirst()!=a[n]){
                deque.add(deque.removeFirst());
                count++;
            }
            sb.append(count).append("\n");
        }

        System.out.print(sb.toString());
    }

    static class Document {
        int priority;
        int index;

        Document(int priority, int index) {
            this.priority = priority;
            this.index = index;
        }
    }

}
