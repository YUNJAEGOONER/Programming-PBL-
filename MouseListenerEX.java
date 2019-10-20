import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class MouseListenerEX here.
 *
 * @author (2018315039 이윤재)
 * @version (2019.10.20)
 */
public class MouseListenerEX extends JFrame
{
    private JLabel la = new JLabel("Null");
    public MouseListenerEX()
    {
        setTitle("Mouse_Listener_Event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        Container c = getContentPane();

        c.addMouseListener(new MyMouseListener());
        c.addMouseMotionListener(new MyMouseListener());

        add(la);
        setSize(300,200);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener, MouseMotionListener{
        public void mousePressed(MouseEvent e){
            //마우스 버튼이 눌러졌을 때
            la.setText("mousePressed(" +e.getX() + "," + e.getY() + ")");
        }

        public void mouseReleased(MouseEvent e){
            //눌러진 버튼이 떨어질 때
            la.setText("mouseReleased(" +e.getX() + "," + e.getY() + ")");
        }

        public void mouseClicked(MouseEvent e){
        }

        public void mouseEntered(MouseEvent e){
            //마우스가 컴포넌트 위에 올라갈 때
            Component c = (Component)e.getSource();
            c.setBackground(Color.CYAN);
        }

        public void mouseExited(MouseEvent e){
            //마우스가 컴포넌트에서 내려올 때
            Component c = (Component)e.getSource();
            c.setBackground(Color.YELLOW);
        }

        public void mouseDragged(MouseEvent e){
            //마우스가 드래그 되는 동안
            la.setText("MouseDragged(" +e.getX() + "," + e.getY() + ")");
        }        

        public void mouseMoved(MouseEvent e){
            //마우스가 움직이는 동안 
            la.setText("MouseMoved(" +e.getX() + "," + e.getY() + ")");
        }
    }
    
    public static void main(String[] args){
        new MouseListenerEX();
    }
}

