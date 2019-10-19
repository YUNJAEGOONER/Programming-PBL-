import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 * @author (2018315039 이윤재)@version (2019.10.19)
 */
public class MyKeyListener_2 extends KeyAdapter
{
    Container C;
    JLabel JL;
    public MyKeyListener_2(Container C, JLabel JL){
        this.C = C; this.JL = JL;
    }
    public void keyPressed(KeyEvent e){
        int keyCode = e.getKeyCode();
        if (keyCode == 53){
            JL.setText(KeyEvent.getKeyText(keyCode)+"키가 입력 되었음");            
            C.setBackground(Color.GREEN);
        }
        else if (KeyEvent.getKeyText(keyCode) == "F1"){
            JL.setText(KeyEvent.getKeyText(keyCode)+"키가 입력 되었음");            
            C.setBackground(Color.YELLOW);
        }
        else{
            JL.setText(KeyEvent.getKeyText(keyCode)+"키가 입력 되었음");            
            C.setBackground(Color.GRAY);
        }
    }
}
