import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Propertie
{
    public static void main(String[] args) throws IOException 
    {
        show1();    
        show2();
        System.out.println("=======================================");
        show3();
    }

    private static void show1()
    {
        Properties prop = new Properties();

        //向集合中添加数据
        prop.setProperty("xdd", "18");
        prop.setProperty("zgl", "19");
        prop.setProperty("zhouan", "20");
        prop.setProperty("zky", "22");


        //使用stringPropertyNames提取键，存储到set集合中
        Set<String> set = prop.stringPropertyNames();


        //遍历set集合，取出Properties每一个键key
        for(String key : set)
        {
            String value = prop.getProperty(key);
            System.out.println(key + ": " + value);
        }
    }

    private static void show2() throws IOException
    {
        Properties prop = new Properties();
        prop.setProperty("zhouan" , "175");
        prop.setProperty("zky" , "172");
        prop.setProperty("zgl" , "180");

        FileWriter fw = new FileWriter("filewrite.txt");
        

        //store把集合中的临时数据，持久化写在硬盘上
        //字符流可以写中文，字节流会乱码
        prop.store(fw, "wclgdj");

        fw.close();
    }

    private static void show3() throws IOException
    {
        Properties prop = new Properties();

        //load方法读取保存键值对的文件
        prop.load(new FileReader("filewrite.txt"));

        Set<String> set = prop.stringPropertyNames();
        for(String key : set)
        {
            String value = prop.getProperty(key);
            System.out.println(key + ": " + value);
        }
    }
}
