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
