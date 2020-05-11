public class Polymorphism {
    public static void main(String[] args) {

        //Student类 能调用的方法都是自己的或者继承父类的
        Student student1 = new Student();
        //Person 父类，可以指向子类，但是不能调用子类特有的方法
        Person student2 = new Student();
        Object student3 = new Student();

        student1.eat();
        //student2.eqt(); //报错
        ((Student)student2).eat(); //强制转换，能运行，但还是指向new的地址

    }
}



class Person {
    public void run() {
        System.out.println("I am a teache!");
    }

}

class Student extends Person {
    @Override
    public void run() {
        System.out.println("I am a student!");
    }

    public void eat() {
        System.out.println("I like eat fruits!");
    }
}
