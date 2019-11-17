import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * Write a description of class JTextArea here.
 * @author (2018315039 이윤재) @version (2019.11.16)
 */
public class JTextArea_EX extends JFrame
{
    private JTextField tf = new JTextField(20);
    private JTextArea ta = new JTextArea(7,20);
    public JTextArea_EX()
    {
        setTitle("JAVA_CHAP11_JTextArea");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setVisible(true);
        setLayout(new FlowLayout());
        add(new JLabel("입력후 <ENTER> 키를 입력하세요"));
        add(tf);
        add(new JScrollPane(ta));
        //JTextArea는 Scroll기능을 지원 하지 않으므로 JScroll에 삽입하여 스크롤바 지원

        tf.addActionListener(new MyActionListener(){
                public void actionPerformed(ActionEvent e){
                    JTextField t = (JTextField)e.getSource();
                    ta.append(t.getText() + "\n");
                    t.setText("");
                }            
            });
    }

    public static void main(String[] args){
        new JTextArea_EX();
    }
}

