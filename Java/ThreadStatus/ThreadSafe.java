public class ThreadSafe
{
    public static void main(String[] args)
    {
        Account account = new Account("结婚基金", 100);

        Drawing drawing1 = new Drawing(account, 50 , "你");
        Drawing drawing2 = new Drawing(account, 100 , "你的老婆");

        drawing1.start();
        drawing2.start();
    }
}


class Account
{
    int money; //余额
    String name ; //卡名

    public Account(String name , int money)
    {
        this.name = name;
        this.money = money;
    }
}


class Drawing extends Thread
{
    Account account; //账户

    int drawingMoney; //取了多少钱

    int nowMoney; //现在手里的钱

    public Drawing(Account account , int drawingMoney ,String name)
    {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    @Override
    public void run()
    {
        //判断有没有钱
        if(account.money - drawingMoney < 0)
        {
            System.out.println(Thread.currentThread().getName() + "钱不够，取不了");
            return;
        }


        try
        {
            Thread.sleep(1000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        //卡内余额 = 余额 - 要取的钱
        account.money = account.money - drawingMoney;

        //你手里的钱
        nowMoney = nowMoney + drawingMoney;

        System.out.println(account.name + "余额为： " + account.money);
        //Thread.currentThread().getName() = this.getName();
        System.out.println(this.getName() + "手里的钱" + nowMoney);
    }
}
