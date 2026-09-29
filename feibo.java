public class feibo {
    public static void main(String[] args){
        int first =1;
        int second =2;
        int n=20;
        System.out.println("斐波那契数列的前二十项是:");
        System.out.println(first + "\n" + second + "");
        for(int i = 3;i <= n;i++){
            int next=first + second ;
            System.out.println(next + "");
            first=second;
            second=next;




        }
    }


}
