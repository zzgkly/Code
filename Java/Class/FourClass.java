public class FourClass
{


    public static void main(String[] args)
    {
        FourClass fourClass = new FourClass();
        fourClass.out();
        FourClass.Inner inner = fourClass.new Inner();
        inner.in();
        System.out.println("==================");
        inner.getId();

        new Test().test();
        System.out.println("==================");
        Test test = new Test();
        test.test();
        System.out.println("==================");

        Test test2 = new Test()
        {
            @Override
            public void hello()
            {
                System.out.println("I am say hello world!");
            }
        };

        test2.hello();


    }


    private int id = 12;
    public void out()
    {
        System.out.println("This is outer method!");

        class Inner
        {
            public void inner()
            {
                System.out.println("This is in method class method!");
            }
        }
    }

    class Inner
    {
        public void in()
        {
            System.out.println("This is inner method!");
        }
        public void getId()
        {
            System.out.println(id);
        }
    }
}


class Test
{
    public void test()
    {
        System.out.println("This is another method!");
    }


    public void hello()
    {
        System.out.println("Hello World!");
    }
}
