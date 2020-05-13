public class ThreadUnsafe
{
    public static void main(String[] args)
    {
        BuyTicket buyTicket = new BuyTicket();
        new Thread(buyTicket , "zhouan").start();
        new Thread(buyTicket , "xdd").start();
        new Thread(buyTicket , "zky").start();
    }
}


class BuyTicket implements Runnable
{
    private int tickNums = 10;
    boolean flag = true; //外部停止方式

    @Override
    public void run()
    {

        //买票
        while(flag)
        {
            try
            {
                buy();
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    private void buy() throws InterruptedException
    {


        //判断是否有票
        if(tickNums <= 0)
        {
            flag = false;
            return;
        }


        //延时
        Thread.sleep(100);


        //谁卖票
        System.out.println(Thread.currentThread().getName() + "拿到了第" + tickNums-- + "张票");
    }

}
