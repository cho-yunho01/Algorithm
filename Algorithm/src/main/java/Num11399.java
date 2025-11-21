import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num11399 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int a[] = new int[num];
        int s[] = new int[num];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<num;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        for(int i=0;i<num;i++){
            if(i==0)
                s[i]=a[i];
            else{
                s[i]=s[i-1]+a[i];
            }
        }
        int sum=0;
        for(int i=0;i<num;i++){
            sum=sum+s[i];
        }
        System.out.println(sum);
    }
}
