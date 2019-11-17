import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class JButton_EX here.
 * @author (2018315039 이윤재) @version (2019.11.16)
 */
public class JRadioButton_EX extends JFrame
{
    public JRadioButton_EX()
    {
        setTitle("JRadio Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,400);
        setVisible(true);
        setLayout(new FlowLayout());
        
        ButtonGroup g = new ButtonGroup();//버튼 그룹 객체 생성
        JRadioButton apple = new JRadioButton("Apple"); //문자열 라디오버튼
        JRadioButton pear = new JRadioButton("Pear");
        JRadioButton cherry = new JRadioButton("Cherry");
        cherry.setBorderPainted(true);//라디오 버튼의 이미지 윤곽선 출력
        g.add(apple); g.add(pear);g.add(cherry);
        
        add(apple); add(pear); add(cherry);
    }    
    public static void main (String[] args){
        new JRadioButton_EX();
    }
}


