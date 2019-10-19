import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class KeyChangeBackground_2 here.
 *
 * @author (2018315039 이윤재)
 * @version (2019.10.19)
 */
public class KeyChangeBackground_2 extends JFrame
{
    private JLabel JL = new JLabel();

    public KeyChangeBackground_2()
    {
        setTitle("KeyListener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container C = getContentPane();

        C.addKeyListener(new MykeyListener());
        C.add(JL);
        setVisible(true);
        setSize(300,150);

        C.setFocusable(true);
        C.requestFocus();

    }

    class MykeyListener extends KeyAdapter{ 
        public void keyPressed(KeyEvent e){
            Container contentPane = (Container)e.getSource();
            //이벤트 소스 알아내기
            JL.setText(KeyEvent.getKeyText(e.getKeyCode())+"키가 입력 되었음");
            if (e.getKeyChar() == '%'){ //입력한 키가 % 인경우 (% 는 유니코드)        
                contentPane.setBackground(Color.GREEN);
            }
            else if (e.getKeyCode() == KeyEvent.VK_F1)
            //입력한 키가 F1인 경우
            {                         
                contentPane.setBackground(Color.YELLOW);
            }
        } 
    }

    public static void main(String[] args){
        new KeyChangeBackground_2();
    }
}
