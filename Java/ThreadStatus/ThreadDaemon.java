public class ThreadDaemon
{
    public static void main(String[] args)
    {
        God god = new God();
        You you = new You();

        Thread thread = new Thread(god);
        thread.setDaemon(true); //默认false表示用户进程


        thread.start();

        new Thread(you).start();
    }
}



class God implements Runnable
{
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("I am a god");
        }
    }
}


class You implements Runnable
{
    @Override
    public void run()
    {
        int i = 0;
        while(i < 36500)
        {
            System.out.println("I ma a man");
            i++;
        }

        System.out.println("My name is zhouan ,  i love zky forever and can't give up!");
    }
}
