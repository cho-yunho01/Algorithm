import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int arr [] = new int[a];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<a;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        long left = 1;
        long right = arr[a-1];
        long mid=0;
        while(left<=right){
            long count=0;
            mid = (left+right)/2;
            for(int i=0;i<a;i++){
                count=count+(arr[i]/mid);
            }
            if(count<b){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        System.out.println(right);
    }
}
