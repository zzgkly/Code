public class Demo {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;



        //如果需要捕获异常，则从小到大捕获
        try {
            new Demo().a();
        } catch (Error e) {
            System.out.println("This is Error");
        } catch (Exception e) {
            System.out.println("This is Exception");
        } catch (Throwable t) {
            System.out.println("This is Throwable");
        }

        finally {
            //finally肯定会被执行
            System.out.println("这里肯定会被执行");
        }
    }

    public void a() {
        b();
    }

    public void b() {
        a();
    }
}
