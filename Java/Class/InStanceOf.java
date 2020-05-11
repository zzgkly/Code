public class InStanceOf
{
    public static void main(String[] args)
    {
        Object object = new Student();

        System.out.println(object instanceof Student);//true
        System.out.println(object instanceof Person);//true
        System.out.println(object instanceof Object);//true
        System.out.println(object instanceof String);//false
        System.out.println("===============================");

        Person person = new Person();
        System.out.println(person instanceof Student);//false
        System.out.println(person instanceof Person);//true
        System.out.println(person instanceof Object);//true
        //System.out.println(person instanceof String);//编译报错
        System.out.println("===============================");

        Student student = new Student();
        System.out.println(student instanceof Student);//true
        System.out.println(student instanceof Person);//true
        System.out.println(student instanceof Object);//true
        //System.out.println(person instanceof String);//编译报错
        System.out.println("===============================");

    }

}
