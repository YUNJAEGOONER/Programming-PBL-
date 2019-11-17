import java.awt.*;
import javax.swing.*;
import java.util.*;
/**
 * Write a description of class ListChangeEx here.
 * @author (2018315039 이윤재) @version (2019.11.17)
 */
public class ListChangeEx extends JFrame
{
    public JTextField tf = new JTextField(10);
    public Vector<String> v = new Vector<String>();
    public JList<String> nameList = new JList<String>();
    public ListChangeEx(){  
        setTitle("JAVA_CHAP11_JList<E>");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setVisible(true);
        setLayout(new FlowLayout());
        add(new JLabel("입력후 <ENTER> 키를 입력하세요"));
        add(tf);

        v.add("황기태");
        v.add("이재문");
        nameList.setVisibleRowCount(5);
        nameList.setFixedCellWidth(100);
        add(new JScrollPane(nameList));
        ListChangeListener a = new ListChangeListener(tf,v,nameList);
        tf.addActionListener(a);
    }        
}
