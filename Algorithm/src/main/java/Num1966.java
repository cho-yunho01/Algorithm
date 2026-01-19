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

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            Deque<Document> deque = new ArrayDeque<>();
            st = new StringTokenizer(br.readLine());

            for (int t = 0; t < m; t++) {
                int size = Integer.parseInt(st.nextToken());
                deque.add(new Document(size, t));
            }
            int count = 0;

            while (true) {
                int max = 0;
                int max_index = 0;
                for (Document d : deque) {
                    if (d.priority > max) {
                        max = d.priority;
                        max_index = d.index;
                    }
                }

                if (deque.peekFirst().getPriority() < max) {
                    deque.add(deque.pollFirst());
                } else {
                    Document result= deque.pollFirst();
                    count++;

                    if (result.getIndex() == n) {
                        break;
                    }
                }
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

        public int getPriority() {
            return priority;
        }
        public int  getIndex() {
            return index;
        }
    }

}
