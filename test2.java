import java.util.Random;
import java.util.Scanner;

public class test2 {
    //红包分配问题
    public static void assign_n_m(int n ,int m,int[] arr){
         //m为总金额,n为人数
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            if(i==n-1){
                arr[i]= m;
                break;
            }
            arr[i]= random.nextInt(m-i-n)+1;
            m -= arr[i];
        }
        disturb_arr(arr);
    }
    //原定洗牌
    public static void disturb_arr(int[] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int temp = random.nextInt(arr.length);
            int a = arr[i];
            arr[i]=temp;
            arr[temp] = a;
        }
    }
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入抢红包人数");
        n = sc.nextInt();
        System.out.println("输入红包总金额");
        m = sc.nextInt();
        int[] arr = new int[n];
        while(true){
            if(m>n&&m>0&&n>0) break;
            System.out.println("输入m不能小于n且n,m不能小于零");
            System.out.println("输入抢红包人数");
            n = sc.nextInt();
            System.out.println("输入红包总金额");
            m = sc.nextInt();
        }
        assign_n_m(n,m,arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第"+(i+1)+"个人抢的金额为"+arr[i]);
        }
    }
}
