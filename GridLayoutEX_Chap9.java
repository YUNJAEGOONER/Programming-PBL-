import javax.swing.*;
import java.awt.*;
/**
 * @author (2018315039 이윤재)
 * @version (2019.10.12)
 */
public class GridLayoutEX_Chap9 extends JFrame
{
    public GridLayoutEX_Chap9(){
        setTitle("GridLayout sample");//메소드를 이용하여 프레임 타이틀 달기
        setSize(300,200); // 프레임 크기
        setVisible(true);//화면에 출력
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임 윈도우 닫으면 프로그램 종료
        GridLayout grid = new GridLayout(4,2);
        grid.setVgap(5);
        Container c = getContentPane();//컨텐트 팬을 알아낸다
        c.setLayout(grid);

        c.add(new JLabel("이름 : "));
        c.add(new JTextField(""));
        c.add(new JLabel("학번 : "));
        c.add(new JTextField(""));
        c.add(new JLabel("학과 : "));
        c.add(new JTextField(""));
        c.add(new JLabel("과목 : "));
        c.add(new JTextField(""));
    }
    public static void main(String[] args){
        new GridLayoutEX_Chap9();
    }
}
