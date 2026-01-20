import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Num1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 개수 구하기
        int n = Integer.parseInt(st.nextToken());

        // 문자열 저장 선언
        ArrayList<String> str = new ArrayList<>();


        // 가장 긴 문자열 크기
        int max = Integer.MIN_VALUE;

        // 문자열 저장
        for (int i = 0; i < n; i++){
            str.add(br.readLine());
            int size = str.get(i).length();
            // 문자열 길이 제일 긴거 탐색
            if(size > max){
                max = size;
            }
        }

        if(n == 1){
            System.out.println(str.get(0));
        }
        else{
            Queue<Character> q = new LinkedList<>();

            // 탐색하려는 index위치
            int index = 0;

            while(index<max){

                // 같은지 틀린지 비교 Boolean
                boolean tr = true;

                for(int i = 0; i < n-1; i++){

                    String str1 = str.get(i);
                    String str2 = str.get(i+1);

                    // str1 or str2 중 하나라도 null이면 false후 null
                    if(str1 == null || str2 == null){
                        tr = false;
                        break;
                    }
                    // 같으면 다음 str과 비교
                    else if(str1.charAt(index) == str2.charAt(index)){
                        continue;
                    }
                    // 다르다면 false 후 나가기
                    else{
                        tr = false;
                        break;
                    }
                }
                if(tr){
                    q.add(str.get(0).charAt(index));
                }
                else{
                    q.add('?');
                }

                index++;

            }

            while(!q.isEmpty()){
                System.out.print(q.poll());
            }

        }

    }
}
