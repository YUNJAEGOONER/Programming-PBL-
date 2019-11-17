import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * @author (2018315039 이윤재) @version (2019.11.16)
 */
public class JComponent_EX extends JFrame
{
    public JComponent_EX()
    {
        setTitle("Example of JComponent");
        setSize(250,200);
        setVisible(true);
        setLayout(new FlowLayout());
        
        JButton JB1 = new JButton("Magenta/Yellow Button");
        JB1.setBackground(Color.YELLOW); //버튼의 배경색 설정
        JB1.setForeground(Color.MAGENTA); // 버튼의 글자색 설정
        JB1.setFont(new Font("Arial", Font.ITALIC , 20)); // 폰트 ,폰트 크기 설정 
        
        JButton JB2 = new JButton("Disabled Button");
        JB2.setEnabled(false); //버튼 비활성화
        
        JButton JB3 = new JButton(" getX(), getY()");
        JB3.addActionListener(new MyListener_JC());
        
        add(JB1); add(JB2); add(JB3);
    }
}


