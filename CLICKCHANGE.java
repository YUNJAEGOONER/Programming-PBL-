import javax.swing.*; import java.awt.*; import java.awt.event.*;
/**
 * @author (2018315039 이윤재) @version (2019.10.20)
 */
public class CLICKCHANGE extends JFrame
{
    Container c;
    public CLICKCHANGE(){
        setTitle("Mouse_Listener_Event");setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        c = getContentPane(); 
        JButton jb = new JButton("BackGroundChange"); add(jb);
        jb.addMouseListener(new MyMouseListener());
        setSize(300,200);setVisible(true);
    }
    class MyMouseListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){            
            JButton jb = (JButton)e.getSource();
            if (e.getClickCount() == 2){//마우스 클릭 횟수 알아내기
                c.setBackground(Color.BLUE);//컨텐트팬의 배경색 바꾸기
            } 
            else{
                c.setBackground(Color.BLACK);
            }
        }        
    }
    public static void main(String[] args){
        new CLICKCHANGE();
    }
}
