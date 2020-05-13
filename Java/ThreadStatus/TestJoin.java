public class TestJoin implements Runnable
{
    @Override
    public void run()
    {
        for(int i = 0; i < 100; i++)
        {
            System.out.println("VIP" + i);
        }
    }

    public static void main(String[] args) throws InterruptedException
    {

        //启动vip进程
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();


        for(int i = 0; i < 1000; i++)
        {
            if(i == 200)
            {
                thread.join();
            }
            System.out.println("main " + i);
        }

    }
}
