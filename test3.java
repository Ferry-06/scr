/*
public class test3 {
    public static void main(String[] args){
        int money=100;

        for(int i=0;i<20;i++){
            for(int j=0;j<34;j++){
                for(int k=0;k<300;k++){
                    if(i+j+k==100 && money==5*i+3*j+k/3 && k%3==0)  {
                        System.out.println("公鸡有:"+i+"只"+"母鸡有:"+j+"只"+"小鸡有:"+k+"只");
                    }
                }

            }
        }
    }
}

 */


/*
public class test3{
    public static void main(String[] args){
        System.out.println("请输出水仙花数:");
        for(int i=100;i<1000;i++){
           int k=i/100;
            int j=i/10%10;
            int m=i%10;
            if(i==k*100+j*10+m*1 && i==k*k*k+j*j*j+m*m*m){
                System.out.println("水仙花数有:"+i);
            }
        }
    }
}
*/

public class test3{
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("该数组为:" + arr[i][j]);
                if (i < j) {
                    int a;
                    a = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = a;
                }


            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("转换后的数组为:" + arr[i][j]);
            }
            System.out.println();
            }
        }
    }


