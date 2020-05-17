import java.io.FileReader;
import java.io.IOException;

public class FileRead
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("fileread.txt");
        int len = 0;

        /* //使用FileReader读取文件中文
        while((len = fr.read()) != -1)
        {
            System.out.print((char)len);
        }
        */

        char[] cs = new char[1024];
        while((len = fr.read(cs)) != -1)
        {
            System.out.println(new String(cs , 0 , len));
        }
        fr.close();
    }
}
