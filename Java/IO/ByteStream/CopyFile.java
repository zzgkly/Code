import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile
{
    public static void main(String[] args) throws IOException
    {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream(new File("demo.txt"));
        FileOutputStream fos = new FileOutputStream(new File("demoCopy.txt"));

        /* //一个一个字节读取
        int len = 0;
        while((len = fis.read()) != -1)
        {
            fos.write(len);
        }
        */

        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read()) != -1)
        {
            fos.write(bytes , 0  , len);
        }


        //见关写后关读
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();
        System.out.println("文件共耗时: " + (end - start));
    }
}
