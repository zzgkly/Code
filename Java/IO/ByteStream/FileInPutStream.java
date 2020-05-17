import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInPutStream
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fis = new FileInputStream(new File("demo.txt"));
        
        /* //一次读取一个字节
        int len = 0;
        while((len = fis.read()) != -1)
        {
            System.out.println((char)len);
        }
        */

        //一次读取一个数组
        byte[] bytes = new byte[1024];
        /*
        int len = fis.read(bytes);
        System.out.println(len);
        System.out.println(Arrays.toString(bytes)); //调用toString方法打印
        System.out.println(new String(bytes)); // 数组转换成字符串打印
        */  

        int len = 0; //记录每次读取有效字节个数
        while((len = fis.read(bytes)) != -1)
        {
            System.out.println(new String(bytes , 0 , len));
        }

        fis.close();
    }
}
