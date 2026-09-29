public class test1 {
    public static void main(String[] args) {
    /*    Scanner sc = new Scanner(System.in);
        String str2 = sc.nextLine();
        String str = sc.next();
        System.out.println(str);
        System.out.println(str2);*/
        int[] arr = {1,2,3,4};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
        int a = 1;
        int b = 2;
        System.out.println(a);
        change1(a,b);
        System.out.println(a);
    }

    public static void change1(int a,int b) {
        int c=a;
         a=b;
         b=c;
    }
    public static void change(int[] arr){
            int a;
            a=arr[0];
            arr[0]=arr[1];
            arr[1]=a;
    }
}


