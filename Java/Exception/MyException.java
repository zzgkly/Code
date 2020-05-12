public class MyException extends Exception//自定义异常
{
    private int detail;


    public MyException(int a)
    {
        this.detail = a;
    }


    @Override
    public String toString()
    {
        return "MyException{" + " detail=" + detail + " }";
    }


    public static void main(String[] args)
    {
        try
        {
            test(100);
        }catch(MyException e)
        {
            System.out.println("MyException==>   " + e);
        }
    }

    static void test(int a) throws MyException
    {
        System.out.println("传递参数为： " + a);
        if(a > 10)
        {
            throw new MyException(a); //抛出异常
        }
        System.out.println("OK");
    }
}
