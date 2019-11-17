import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class CheckBox_EX here.
 * @author (2018315039 이윤재) @version (2019.11.16)
 */
public class CheckBox_EX extends JFrame
{    
    public CheckBox_EX()
    {
        setTitle("Example of CheckBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(350,250);
        setVisible(true);        
        JCheckBox pycharm = new JCheckBox("pycharm");
        JCheckBox Thony = new JCheckBox("Thony");                
        ImageIcon BJIcon = new ImageIcon("images/BLUEJ_CheckBox.png");
        ImageIcon selectedBJ = new ImageIcon("images/BLUEJ_CheckBox_2.png");        
        JCheckBox BlueJ= new JCheckBox("Blue J",BJIcon);
        BlueJ.setBorderPainted(true);//체크박스 외각선 보이기
        BlueJ.setSelectedIcon(selectedBJ);//선택 상태 이미지 등록        
        add(pycharm); add(Thony); add(BlueJ);
    }        
    public static void main(String[] args){
        new CheckBox_EX();
    }
}


