import javax.swing.*;
import java.awt.*;
/**
 * @author (2018315039 이윤재) @version (2019.10.11)
 */
public class BoarderLayoutEX_Chap9 extends JFrame
{    
    public BoarderLayoutEX_Chap9()
    {
        setTitle("BoarderLayout Sample");//메소드를 이용하여 프레임 타이틀 달기
        setSize(300,300); // 프레임 크기
        setVisible(true);//화면에 출력
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임 윈도우 닫으면 프로그램 종료
        Container c = getContentPane();//컨텐트 팬을 알아낸다
        c.setBackground(Color.BLACK);
        
        c.setLayout(new BorderLayout(30,20));//vGap = 30 , hGap = 20인 BorderLayout
        c.add(new JButton("선"), BorderLayout.NORTH);
        //'선' 이라고 되어있는 버튼을 북쪽에 배치
        c.add(new JButton("문"), BorderLayout.WEST);
        c.add(new JButton("대"), BorderLayout.CENTER);
        c.add(new JButton("학"), BorderLayout.EAST);
        c.add(new JButton("교"), BorderLayout.SOUTH);
    }
    
    public static void main (String[] args){
        new BoarderLayoutEX_Chap9();
    }
}