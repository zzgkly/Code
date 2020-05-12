### 构造器(Constructor)

#### 特点

1. **与类名相同**
2. **没有返回值**

#### 作用

1. **new 本质在调用构造方法**
2. **初始化对象的值**

#### 注意

1. **定义有参构造之后，如果想使用无参，必须创建无参构造；不定义则jre默认使用无参构造**

### 类与对象

#### 特点

1. **类是一个模板**
2. **对象是一个具体的模板实例**

#### 方法

1. **定义**
2. **调用**

#### 对象的引用

1. **引用类型： 基本类型（8）**
2. **对象是通过引用来操作的： 堆--->>>栈**

#### 属性

1. **字段Field 成员变量**
2. **默认初始化： 数字：0 ，0.0；char：\u000；boolean：false；引用；null**
3. **修饰符 属性类型 属性名  = 属性值**

#### 对象的创建以及使用

1. **必须使用new关键字创造 Person person = new Person()**
2. **对象的属性 person.name**
3. **对象的方法 person.study()**

### 类

1. **静态属性	属性**
2. **动态方法	方法**

#### 继承

1. **单继承，子类可以使用父类的方法**
2. **父类如果要使用子类方法，则必须强制转换类**
3. **判断子父类可以用Instanceof方法**

#### 抽象类

1. **不能new 实例化 , 只能靠子类实现；约束**
2. **抽象类中可以写普通的方法**
3. **抽象方法必须在抽象类中**

#### 接口

1. **约束**
2. **定义一些方法，让不同的人实现**
3. **public abstact**
4. **public static final**
5. **不能被实例化，接口中没有构造方法**
6. **implemets可以实现多个接口**
7. **必须要重写接口中的方法**

#### 几种类的写法

```java
public class FourClass
{


    public static void main(String[] args)
    {
        FourClass fourClass = new FourClass();
        fourClass.out();
        FourClass.Inner inner = fourClass.new Inner();
        inner.in();
        System.out.println("==================");
        inner.getId();

        new Test().test();
        System.out.println("==================");
        Test test = new Test();
        test.test();
        System.out.println("==================");

        Test test2 = new Test()
        {
            @Override
            public void hello()
            {
                System.out.println("I am say hello world!");
            }
        };

        test2.hello();


    }


    private int id = 12;
    public void out()
    {
        System.out.println("This is outer method!");

        class Inner
        {
            public void inner()
            {
                System.out.println("This is in method class method!");
            }
        }
    }

    class Inner
    {
        public void in()
        {
            System.out.println("This is inner method!");
        }
        public void getId()
        {
            System.out.println(id);
        }
    }
}


class Test
{
    public void test()
    {
        System.out.println("This is another method!");
    }


    public void hello()
    {
        System.out.println("Hello World!");
    }
}

```



### GUI

#### 面板JPanel

```java
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class  PanelShow
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame();

        JPanel jPanel = new JPanel();


        //设置布局,默认置顶
        jFrame.setLayout(null);
            
        //窗口坐标
        jFrame.setBounds(300 , 300 , 500 , 500);
        jFrame.setBackground(Color.black);

        //面板JPanel设置坐标，相对与JFrame
        jPanel.setBounds(5 , 50 , 400 , 400);
        jPanel.setBackground(Color.red);

        jFrame.add(jPanel);

        //设置可见性
        jFrame.setVisible(true);


        //监听事件，监听窗口关闭事件System.exit(0)
        //适配器模式
        

        jFrame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
}
```

