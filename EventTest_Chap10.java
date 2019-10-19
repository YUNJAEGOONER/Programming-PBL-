import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class EventTest_Chap10 here.
 *
 * @author (2018315039 이윤재)
 * @version (2019.10.19)
 */
public class EventTest_Chap10 extends JFrame
{    
    public EventTest_Chap10()
    {
        setTitle("액션 <=> Action");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JButton JB = new JButton("Action");
        JB.addActionListener(new EventTesr_Listener());
        //리스너 달기
        add(JB);
        setSize(350,150);
        setVisible(true);
    }
    
    public static void main(String[] args){
        JFrame EventTest_Chap10 = new EventTest_Chap10();
    }
}
