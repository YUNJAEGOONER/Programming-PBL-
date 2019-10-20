import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * Write a description of class MovingbyKey here.
 *
 * @author (2018315039 이윤재)
 * @version (2019.10.20)
 */
public class MovingbyKey extends JFrame
{    
    private final int FLYING_UNIT = 10; //레이블이 한 번 움직이는 단위는 10픽셀
    private JLabel la = new JLabel("MOVE"); // 움직일 레이블 생성
    public MovingbyKey()
    {       
        setTitle("MOVING");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        addKeyListener(new MykeyListener());
        la.setLocation(50,50);//레이블의 초기 위치
        la.setSize(100,20);
        add(la);

        setSize(300,300);
        setVisible(true);

        setFocusable(true);
        requestFocus();

        addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
                    Component com = (Component)e.getSource();
                    com.setFocusable(true);
                    com.requestFocus();
                }
            });
    }

    class MykeyListener extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            int keyCode = e.getKeyCode();

            switch(keyCode){
                case KeyEvent.VK_UP:
                la.setLocation(la.getX(),la.getX()-FLYING_UNIT);
            }
        }
    }
    
    public static void main (String[] args){
        new MovingbyKey();
    }
}

