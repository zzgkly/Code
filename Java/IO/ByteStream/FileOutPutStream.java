import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStream
{
    public static void main(String[] args) throws IOException
    {

        FileOutputStream fos = new FileOutputStream(new File ("demo.txt") , false);
        
        
        for (int i = 0; i < 10; i++) {

            //写入字符串的方法，getBytes
            fos.write("I love zky!\n".getBytes());
        }
        


        /*//如果传递进去的有负数，第一个字节和第二个字节会相加组成中文显示
        byte[] bytes = {65 ,  66 , 67 , 68 , 69};
        fos.write(bytes , 1 , 3);
        fos.close();
        */
    }
}
