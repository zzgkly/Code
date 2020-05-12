import java.awt.Color;

import javax.swing.JFrame;


public class Frame {
    public static void main(String[] args) {

        MyJFrame  myJFrame1 = new MyJFrame(100, 100, 200 , 200 , Color.blue);
        MyJFrame  myJFrame2 = new MyJFrame(300, 100, 200 , 200 , Color.red);
        MyJFrame  myJFrame3 = new MyJFrame(100, 300, 200 , 200 , Color.yellow);
        MyJFrame  myJFrame4 = new MyJFrame(300, 300, 200 , 200 , Color.pink);
    }

}


class MyJFrame extends JFrame {
    static int id = 0;

    public MyJFrame(int x , int y, int w, int h , Color color)
    {
        super("MyFrame" + (++id));

        setBackground(color);
        setBounds(x , y , w , h);
        setVisible(true);
    }
}
