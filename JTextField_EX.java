import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class JTextField_EX here.
 * @author (2018315039 이윤재) @version (2019.11.16)
 */
public class JTextField_EX extends JFrame
{    
    public JTextField_EX()
    {
        setTitle("JAVA_CHAP11");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setVisible(true);
        setLayout(new FlowLayout());
        add(new JLabel("이름"));
        add(new JTextField(20));
        add(new JLabel("학과"));
        add(new JTextField(20));
        add(new JLabel("학교"));
        JTextField jf = new JTextField();
        jf.setText("선문대학교");
        jf.setEnabled(false);//텍스트 수정 불가
        add(jf);
    }
    public static void main(String[] args){
        new JTextField_EX();
    }
}

