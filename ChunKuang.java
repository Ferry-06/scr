import java.util.Scanner;
public class ChunKuang {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        long password=951344;
        long input;
        do{
            System.out.println("请输入您的取款密码:");
            input=scanner.nextInt();
        }while(input!= password);
        System.out.println("密码正确,你可以进行取款!");
    }

}
