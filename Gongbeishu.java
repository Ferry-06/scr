public class Gongbeishu {
    public static void main(String[] args){
        int i=1;
        while(true){
            if(i % 32 == 0 && i % 18 == 0){
                System.out.println("12和18的最小公倍数是:" + i);
                break;
            }
            i++;
        }
    }

}
