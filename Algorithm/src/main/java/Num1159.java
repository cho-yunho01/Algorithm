import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Num1159 {
    public static void main(String[] args) throws IOException {
        ArrayList<Sung> arr = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            // 성 빼오기
            char c = st.nextToken().charAt(0);

            if (arr.isEmpty()) {
                arr.add(new Sung(1, c));
            }

            else {
                int index = 0;
                boolean flag = false;
                for (int t = 0; t < arr.size(); t++) {
                    char ch = arr.get(t).getC();
                    // 이미 있으면 카운트 증가
                    if (ch == c) {
                        flag = true;
                        index = t;
                    }
                    else{
                        continue;
                    }
                }
                if(flag){
                    arr.get(index).plusCount();
                }
                // 없으면 새로운 성 추가
                else {
                    arr.add(new Sung(1, c));
                }
            }
        }

        arr.sort((a, b) -> a.getC() - b.getC());

        for (int i = 0; i < arr.size(); i++) {
            int count = arr.get(i).getCount();
            if(count>=5){
                sb.append(arr.get(i).getC());
            }
            else{
                continue;
            }
        }


        if (sb.length() == 0) {
            System.out.println("PREDAJA");
        } else {
            System.out.println(sb.toString());
        }



    }


    public static class Sung {
        int count;
        char c;

        public Sung(int count, char c) {
            this.count = count;
            this.c = c;
        }

        public int getCount() {
            return count;
        }

        public void plusCount() {
            count++;
        }

        public char getC() {
            return c;
        }

    }

}


