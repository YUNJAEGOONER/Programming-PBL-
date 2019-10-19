import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * @author (2018315039 이윤재)
 * @version (2019.10.19)
 */
public class KeyChangesBackground extends JFrame
{
    private JLabel JL = new JLabel();    
    public KeyChangesBackground()
    {
        setTitle("KeyListener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        Container C = getContentPane();
        JL.setSize(50,20);
        C.add(JL);
        addKeyListener(new MyKeyListener_2(C,JL));        
        setVisible(true);
        setSize(300,150);
        setFocusable(true);
        requestFocus();
    }    
    public static void main(String[] args){
        new KeyChangesBackground();
    }
}


