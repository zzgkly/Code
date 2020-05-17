import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("filewrite.txt");
        //fw.write(99);
    

        char[] cs = {'Z' , 'H' , 'O' , 'U' , 'A' , 'N'};
        fw.write(cs);

        fw.write("我的名字是");

        fw.write("安周周安" , 2 , 2);

        //必须刷新或者关闭，才能完成操作文件步骤
        fw.flush();
        fw.close();
    }
}
