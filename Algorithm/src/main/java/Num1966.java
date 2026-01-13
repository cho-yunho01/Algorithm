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

            int result=0;
            Deque<Document> deque = new ArrayDeque<>();
            st = new StringTokenizer(br.readLine());


            for(int t=0;t<m;t++){
                deque.add(new Document(t,Integer.parseInt(st.nextToken())));
                if(n==t){
                    result = deque.peekLast().getPriority();
                }
            }
            int count = 0;

            while(deque.size()!=result){
                int max = 0;
                int max_index = 0;
                for(Document d:deque){
                    if(d.priority>max){
                        max = d.priority;
                        max_index = d.index;
                    }
                }

                int minus;
                // 제일 큰 수가 뒤에 있을 때
                if(max_index>deque.size()/2){
                    minus = deque.size()-max_index;
                    for(int t=0;t<minus;t++){
                        deque.add(deque.removeFirst());
                        count++;
                    }
                }

                // 제일 큰 수가 앞에 있을 때
                else if(max_index<deque.size()/2){
                    minus = deque.size()-max_index;
                    for(int t=0;t<minus;t++){
                        deque.add(deque.removeLast());
                        count++;
                    }
                }
                // 중앙에 있을 때
                else{
                    minus = deque.size()-1;
                    for(int t=0;t<minus;t++){
                        deque.add(deque.removeFirst());
                        count++;
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
    }

}
