import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class JComboBox_EX here.
 *
 * @author (2018315039 이윤재) @version (2019.11.17)
 */
public class JComboBox_EX extends JFrame
{
    private String [] fruits = {"Apple","Banana","Kiwi","Mango","Pear"};
    private String [] names = {"Kitae", "Jaemoon", "Hyosoo"};
    public JComboBox_EX()
    {
        setTitle("JAVA_CHAP11_JComboBox<E>");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setVisible(true);
        setLayout(new FlowLayout());
        
        JComboBox<String> cb_1 = new JComboBox<String>(fruits);
        //문자열 콤보박스 생성        
        JComboBox<String> cb_2 = new JComboBox<String>();// 빈 콤보박스 생성        
        for (int i =0 ; i < names.length ; i ++){
            cb_2.addItem(names[i]);// 빈 콤보박스에 문자열 아이템 삽입
        }        
        add(cb_1); add(cb_2); 
    }
    
    public static void main (String[] args){
        new JComboBox_EX();
    }   
}
