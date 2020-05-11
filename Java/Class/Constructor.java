public class Constructor
{
    public static void main(String[] args)
    {
        WuCan wuCan = new WuCan("ZhouAn");
        System.out.println(wuCan.getName());
    }
}


class WuCan
{
    private String name;


    public WuCan(){}
    public WuCan(String name)
    {
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}
