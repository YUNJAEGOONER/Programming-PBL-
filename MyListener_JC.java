import java.awt.event.*;
import javax.swing.*;
/**
 * Write a description of class MyActionListener here.
 * @author (2018315039 이윤재) @version (2019.11.16)
 */
public class MyListener_JC implements ActionListener
{
    public void actionPerformed(ActionEvent e){
        JButton b = (JButton)e.getSource();
        JComponent_EX frame = (JComponent_EX)b.getTopLevelAncestor();
        frame.setTitle(b.getX() + "," + b.getY());
    }
}

