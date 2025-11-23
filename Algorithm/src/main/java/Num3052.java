import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num3052 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<10;i++){
            int num=sc.nextInt();
            int a = num%42;
            if(arr.contains(a)){
                continue;
            }
            else{
                arr.add(a);
            }

        }

        System.out.println(arr.size());



    }
}
