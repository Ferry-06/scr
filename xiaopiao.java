import java.util.Scanner;
public class xiaopiao {
    String name;
    double price;
    int number;
    int sum_price;
    public xiaopiao(){
        System.out.println("请输入顾客购买商品的种类数:");
    }
    public static void main(String[] args){
        xiaopiao xp=new xiaopiao();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请依次输入商品的名称,单价,数量:");
        xp.name=scanner .next();
        xp.price=scanner.nextDouble();
        xp.number=scanner.nextInt();
        xp.sum_price = (int)(xp.price * xp.number);
        System.out.println("商品:"+xp.name +",单价:"+xp.price +",数量:" +xp.number +", 小计:"+xp.sum_price);





    }


}
