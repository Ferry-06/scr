class Staff{
    int salary;
    String name;
}
public class yinyong {
    public static  void modifySalary(int salary ){
        salary +=1000;
    }
    public static void modifySalary(Staff staff){
        staff.salary +=1000;
    }
    public static  void main(String[] args){
        Staff staff= new Staff();
        staff.name="小严";
        staff.salary=18000;
        System.out.println(staff.name +"的薪水是:" + staff.salary+"元/月");
        modifySalary(staff.salary);
        System.out.println("值传递后薪水:"+ staff.name +"加薪后的薪水是:" + staff.salary+"元/月");
        modifySalary(staff);
        System.out.println("引用传递后薪水:"+ staff.name +"加薪后的薪水是:" + staff.salary+"元/月");
    }
}
