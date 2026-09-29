/*class Person{
    String name;
    int age;
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
class Student extends Person{
    public void study(){
        System.out.println("学习");
    }
}
class Teacher extends Person{
    int salary;
    public void teach(){
        System.out.println("教书");
    }
}
public class Example {
public static void main(String[] args){
    Student student = new Student();
    student.name="肖程";
    student.age=23;
    System.out.println("我叫" + student.name + ",我今年" + student.age + "岁.");
    System.out.println("我可执行如下方法:");
    student.eat();
    student.sleep();
    student.study();
    Teacher teacher = new Teacher();
    teacher.name="冯瑞";
    teacher.age=21;
    teacher.salary=18000;
    System.out.println("我叫" + teacher.name + ",我今年" + teacher.age + "岁.我的薪水是:" + teacher.salary);
    System.out.println("我可执行如下方法:");
    teacher.eat();
    teacher.sleep();
    teacher.teach();
}
}
*//*




*/
/*
class Animal{
    public void speak(){
        System.out.println("动物发出叫声");
    }
}
class Dog extends Animal{
    @Override
    public void speak(){
        System.out.println("狗发出汪汪声");
    }
}
class Cat extends Animal{
    @Override
    public void speak(){
        System.out.println("猫发出喵喵声");
    }
}
public class Example{
    public static void main(String[] args){
        Animal animal = new Animal();
        animal.speak();
        Dog dog= new Dog();
        dog.speak();
        Cat cat= new Cat();
        cat.speak();
    }
}

*//*



final class Parent{
    private String name;
    public Parent(){
        System.out.println("无参构造函数");

    }
}
class Son extends Parent{
    public Son(){

    }
}
public class Example{
    public static void main(String[] args){
        Son son=new Son();
    }
}
*/

/*
// 排序
public class Example {
    public static void main(String[] args){
        int arr[]={4,6,7,2,3,5,1};
        int next;
        for(int i=0;i<arr.length;i++) {
            System.out.println("第" + (i + 1) + "个数是:" + arr[i]);
        }
            for (int i = 0; i < arr.length; i++) {

                for ( int j = i+1; j < arr.length ; j++) {
                    if (arr[i] > arr[j]) {
                        next = arr[j];
                        arr[j] = arr[i];
                        arr[i] = next;
                    }
                }
            }
            for(int i=0;i<arr.length;i++){
                System.out.println(""+arr[i]);
            }

        }

    }

 */

//斐波那契额数列(for循环)
/*
public class Example {
    public static void main(String[] args){
        int i=0;
        int j=1;
        int n=0;
        int sum=0;
        for(n=0;n<10;n++){
             sum=i+j;
            System.out.println(""+sum);
            i=j;
            j=sum;

        }

    }
}

 */

// 斐波那契数列(递归)
/*
public class Example {
    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("" + fib(i));
        }
    }
}

 */

