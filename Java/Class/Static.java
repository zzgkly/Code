//静态导入包，可以直接调用方法和属性
import static java.lang.Math.*;

public class Static
{
    public static void main(String[] args)
    {

        //静态>匿名>构造
        Student student1 = new Student();
        System.out.println("=================================");
        
        //System.out.println(Student.score);//不能访问非静态
        System.out.println(student1.age); //静态建议直接类访问
        System.out.println(student1.score);
        System.out.println(Student.age);
        System.out.println("=================================");

        Student.go();
        student1.run();
        System.out.println("=================================");
        
        System.out.println(random());
        System.out.println(PI);

    }
}


class Student
{
    static int age;
    double score;

    public void run()
    {
        System.out.println("I am in running!");
    }

    public static void go()
    {
        System.out.println("Now i am to go to!");
    }

    public Student()
    {
        System.out.println("构造方法");
    }

    static 
    {
        System.out.println("静态代码块");
    }

    {
        System.out.println("匿名代码块");
    }
}

