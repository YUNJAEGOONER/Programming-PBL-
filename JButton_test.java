import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class JButton_test here.
 * @author (2018315039 이윤재) @version (2019.11.16)
 */
public class JButton_test extends JFrame
{
    public JButton_test()
    {
        setTitle("JButton_TEST");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);        
        ImageIcon normal = new ImageIcon("images/bluej-icon_1.png");
        JButton button = new JButton("Blue J" , normal);
        //normalIcon, 버튼이 보통 상태에 있을 때
        add(button);        
        ImageIcon rollover = new ImageIcon("images/bluej-icon_2.png");
        button.setRolloverIcon(rollover);
        //rolloberIcon, 마우스가 올라갈때 출력되는 이미지       
        ImageIcon pressed = new ImageIcon("images/bluej-icon_3.png");
        button.setPressedIcon(pressed);
        //pressedIcon, 버튼이 눌러져 있는 동안 출력되는 이미지       
        setLayout(new FlowLayout());
    }    
    public static void main(String[] args){
        new JButton_test();
    }
}


