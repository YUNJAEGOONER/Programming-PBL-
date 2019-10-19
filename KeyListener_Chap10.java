import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class KeyListener_Chap10 here.
 *
 * @author (2018315039 이윤재) 
 * @version (2019.10.19)
 */
public class KeyListener_Chap10 extends JFrame
{
    private JLabel [] KeyMessage = new JLabel [3];
    public KeyListener_Chap10()
    {
        setTitle("KeyListener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        addKeyListener(new MyKeyListener(KeyMessage));

        KeyMessage[0] = new JLabel ("getKeyCode()");
        KeyMessage[1] = new JLabel ("getKeyChar()");
        KeyMessage[2] = new JLabel ("getKeyText()");

        for(int i=0;i<KeyMessage.length;i++){
            add(KeyMessage[i]);
        }
        setVisible(true);
        setSize(300,150);
        setFocusable(true);
        requestFocus();

    }

    public static void main(String[] args){
        new KeyListener_Chap10();
    }
}


