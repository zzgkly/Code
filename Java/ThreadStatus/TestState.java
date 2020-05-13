public class TestState
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread thread = new Thread(() -> 
        {
            for(int i = 0; i < 5; i++)
            {
                try
                {
                    Thread.sleep(1000);
                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            System.out.println("===========================");
        });


        //观察状态
        Thread.State state = thread.getState();
        System.out.println(state);

        //观察后
        thread.start();//启动线程
        state = thread.getState();
        System.out.println(state);


        while(state != Thread.State.TERMINATED)
        {
            //只要线程不停止，就一直输出状态
            Thread.sleep(100);
            state = thread.getState(); //更新线程状态
            System.out.println(state);
        }



    }
}
