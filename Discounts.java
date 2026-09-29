import java.util.Scanner;
public class Discounts{
    public static void main(String[] args){
        double ShopAmount=0;
        double PayCount=0;
        String discountInfo="";
        System.out.println("本商场今日搞促销活动,不同购物金额对应的折扣如下:");
        System.out.println("购物金额不超过100,无优惠.");
        System.out.println("购物金额超过100,不超过200,打九折.:");
        System.out.println("购物金额超过200,不超过300,打八折");
        System.out.println("购物金额超过300,打七折");
        System.out.println("----------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的购物金额:");
        ShopAmount=scanner.nextDouble();
        if (ShopAmount < 100){
            PayCount=ShopAmount;
            discountInfo="不享受任何优惠";
        } else if (100 < ShopAmount && ShopAmount <= 200){
            PayCount=ShopAmount * 0.9;
            discountInfo="此次购物享受九折优惠";
        }  else if (200 < ShopAmount && ShopAmount <= 300){
            PayCount=ShopAmount * 0.8;
            discountInfo="此次购物享受八折优惠";
        } else if (300< ShopAmount){
            PayCount=ShopAmount * 0.7;
            discountInfo="此次购物享受七折优惠";
        }
        System.out.println("购物金额:"+ ShopAmount + "元");
        System.out.println("应支付金额:"+ PayCount + "元");
        System.out.println("优惠信息:"+ discountInfo);




    }
}
