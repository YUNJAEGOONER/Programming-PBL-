import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * 마우스 버튼을 누르면 마우스 포인트가 있는 위치로 문자열 옮기기
 *
 * @author (2018315039 이윤재)
 * @version (2019.10.19)
 */
public class MouseMove_Chap10 extends JFrame
{
    private JLabel la = new JLabel("Click");
    public MouseMove_Chap10()
    {
        setTitle("MouseMove");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(new MyMouseListener(la));
        setLayout(null);
        la.setSize(50,20);
        add(la);        
        setVisible(true); 
        setSize(250,250);
    }
    
    
    public static void main(String[] args){
        JFrame mf = new MouseMove_Chap10();
    }
}
