public class jishu {
    public static void main(String[] args){
        int i=1;
        int sum=0;
        for(i=1;i<=100;i++){
            if(i % 2 == 0){
                continue;
            }
            sum+=i;
        }
        System.out.println("sum=:" +sum);
    }
}
