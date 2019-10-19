import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Write a description of class MouseMove_Chap10_1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MouseMove_Chap10_1 extends JFrame
{
    private JLabel la = new JLabel("Click");

    public MouseMove_Chap10_1()
    {
        setTitle("MouseMove");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(new MymouseListener_1());
        setLayout(null);
        la.setSize(50,20);
        add(la);        
        setVisible(true); 
        setSize(250,250);
    }

    class MymouseListener_1 extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            int X = e.getX();//마우스 클릭 좌표 X 
            int Y = e.getY();//마우스 클릭 좌표 Y
            la.setLocation(X,Y);//레이블 위치 정하기
        }
    }

    public static void main(String[] args){
        JFrame mf = new MouseMove_Chap10_1();
    }
}
