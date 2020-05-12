import java.util.ArrayList;
import java.util.List;

public class WrapperClass
{
    /**
     *  包装类
     *
     *  优点.
     *      1. 某些方法的参数必须是对象，为了让基本数据类型数据作为参数，提供包
     *      装类
     *      2. 包装类还可以提供更多功能
     *      3. 特别注意：可以实现字符串和基本数据类型之间转换
     *
     *
     *  @author zhouan
     * */
    public static void main(String[] args)
    {

        //基本包装类操作
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.toBinaryString(13));
        System.out.println(Integer.toOctalString(13));
        System.out.println(Integer.toHexString(13));
        System.out.println("=================================");



        //实现字符串和基本数据类型之间的转换
        String string = "12345";
        System.out.println(Integer.parseInt(string));
    }
}
