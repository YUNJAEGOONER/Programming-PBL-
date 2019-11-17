import java.awt.event.*;
import java.util.*;
import javax.swing.*;
/**
 * Write a description of class ListChangeListener here.
 * @author (2018315039 이윤재) @version (2019.11.17)
 */
public class ListChangeListener implements ActionListener
{    
    public JTextField tf;
    public Vector<String> v ;
    public JList<String> nameList;
    
    public ListChangeListener(JTextField tf, Vector<String> v,  JList<String> nameList)
    {
        this.tf = tf;
        this.v = v;
        this.nameList = nameList;
    }

    public void actionPerformed(ActionEvent e){
        JTextField t =(JTextField)e.getSource();
        v.add(t.getText());
        t.setText("");
        nameList.setListData(v);
    }
}
