import javax.swing.event.*;
import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class MyChangeListener here. 
 * @author (2018315039 이윤재) @version (2019.11.17) 
 */
public class MyChangeListener implements ChangeListener
{
    JSlider [] sl;
    JLabel colorLabel;;
    public MyChangeListener(JSlider[] sl, JLabel colorLabel)
    {
        this.sl = sl;
        this.colorLabel = colorLabel;
    }
    public void stateChanged(ChangeEvent e){
        int red = sl[0].getValue(); // red 슬라이더로 부터 red 성분 값 얻기
        int green = sl[1].getValue();
        int blue = sl[2].getValue();
        colorLabel.setBackground(new Color(red, green,blue));
    }

}
