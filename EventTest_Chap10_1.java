import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class EventTest_Chap10_1 here.
 *
 * @author (2018315039 이윤재)
 * @version (2019.10.19)
 */
public class EventTest_Chap10_1 extends JFrame
{
    public EventTest_Chap10_1()
    {
        setTitle("액션 <=> Action");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JButton JB = new JButton("Action");
        JB.addActionListener(new EventTest_Listener());
        //리스너 달기
        add(JB);
        setSize(350,150);
        setVisible(true);
    }
    
    private class EventTest_Listener implements ActionListener
    //이벤트 리스너 인터페이스 상속
    {
        public void actionPerformed(ActionEvent e){
            JButton button = (JButton)e.getSource();
            //getSource() 이벤트의 소스 컴포너트의 레퍼런스를 리턴(클릭된 버튼 알아내기)
            //getSource()의 리턴타입은 Object이므로 캐스팅필요
            if (button.getText().equals("Action")){
                button.setText("액션");
            }
            else
                button.setText("Action");
        }
    }
    
    public static void main(String[] args){
        JFrame EventTest_Chap10_1 = new EventTest_Chap10_1();
    }
}
