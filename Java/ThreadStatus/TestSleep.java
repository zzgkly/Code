import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSleep implements Runnable
{

    private int ticketNums = 10;

    @Override
    public void run()
    {
        while (true)
        {
            if(ticketNums <= 0)
            {
                break;
            }
            try{
                Thread.sleep(100);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "--->>>拿到了第" + ticketNums-- + "张票" );
        }

    }



    //倒计时10秒
    public static  void tenDown() throws InterruptedException
    {
        int num = 10;
        while(true)
        {
            Thread.sleep(1000);
            System.out.println(num--);
            if(num <= 0)
            {
                break;
            }
        }
    }




    public static void main(String[] args)
    {
        TestSleep testSleep = new TestSleep();

        new Thread(testSleep , "周安").start();
        new Thread(testSleep , "小叮当").start();
        new Thread(testSleep , "小学生").start();
        new Thread(testSleep , "黄牛党").start();

        try
        {
            tenDown();
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        Date startDate = new Date(System.currentTimeMillis());




        //获取系统每秒的时间
        while(true)
        {
            try
            {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(startDate));
                startDate = new Date(System.currentTimeMillis());
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }





}
