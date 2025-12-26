import java.util.Scanner;

public class Num2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        for(int i =0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){

            for(int t=i+1;t<a.length;t++){
                if(a[t]<a[i]){
                    int temp = a[t];
                    a[t]=a[i];
                    a[i]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            if(i==a.length-1){
                System.out.print(a[i]);
            }else {
                System.out.print(a[i]+" ");
            }
        }
    }
}
