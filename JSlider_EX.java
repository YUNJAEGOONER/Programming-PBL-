import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
/**
 * Write a description of class JSlider here.
 * @author (2018315039 이윤재) @version (2019.11.17)
 */
public class JSlider_EX extends JFrame
{
    JLabel colorLabel;
    JSlider [] sl = new JSlider[3];
    public JSlider_EX(){
        setTitle("JAVA_CHAP11_JComboBox<E>");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setVisible(true);
        setLayout(new FlowLayout());        
        colorLabel = new JLabel("     SLIDER EXAMPLE     ");        
        for(int i = 0 ; i < sl.length;  i++){
            sl[i] = new JSlider(JSlider.HORIZONTAL, 0 ,255, 128);
            // 수평슬라이더, 최솟값 0, 최댓값 255, value 초깃값 128
            sl[i].setPaintLabels(true); //슬라이더의 라벨이 보이도록
            sl[i].setPaintTicks(true); //슬라이더의 눈금을 보이게
            sl[i].setPaintTrack(true);//슬라이더의 트랙이 보이게
            sl[i].setMajorTickSpacing(50); // 큰 눈금 간격 설정
            sl[i].setMinorTickSpacing(10); // 작은 눈금 간격 설정
            sl[i].addChangeListener(new MyChangeListener(sl,colorLabel));
            add(sl[i]);
        }
        sl[0].setForeground(Color.RED); //슬라이더의 색 설정
        sl[1].setForeground(Color.GREEN);
        sl[2].setForeground(Color.BLUE);       
        colorLabel.setOpaque(true);// 레이블의 배경색이 보이도록 불투명성 설정
        add(colorLabel);
     }
}
