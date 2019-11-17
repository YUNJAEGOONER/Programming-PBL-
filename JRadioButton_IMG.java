import java.awt.event.*; import javax.swing.*; import java.awt.*;
import java.util.*;
/**
 * Write a description of class JRadioButton_IMG here.
 * @author (2018315039 이윤재) @version (2019.11.16)
 */
public class JRadioButton_IMG extends JFrame
{
    private ArrayList<JRadioButton> button = new ArrayList<JRadioButton>();
    private ArrayList<String> string = new ArrayList<String>();
    private ArrayList<ImageIcon> image = new ArrayList<ImageIcon>();
    private JLabel img = new JLabel();
    public JRadioButton_IMG()
    {
        setTitle("JRadio Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,400);
        setVisible(true);
        setLayout(new BorderLayout());

        JPanel radiopanel = new JPanel();
        radiopanel.setBackground(Color.GRAY);

        string.add("BlueJ"); string.add("RedJ"); string.add("GreenJ"); 
        image.add(new ImageIcon("images/bluej-icon_1.png")); 
        image.add(new ImageIcon("images/bluej-icon_2.png"));
        image.add(new ImageIcon("images/bluej-icon_3.png")); 

        ButtonGroup g = new ButtonGroup();//버튼 그룹 객체 생성
        for(int i = 0; i <string.size() ; i++){           
            button.add(new JRadioButton(string.get(i)));
        }

        for(int i = 0; i < string.size() ; i++){
            g.add(button.get(i));
            radiopanel.add(button.get(i));
            button.get(i).addItemListener(new MyItemListener_JR());
        }
        
        button.get(2).setSelected(true);
        add(radiopanel, BorderLayout.NORTH);
        add(img, BorderLayout.CENTER);
        img.setHorizontalAlignment(SwingConstants.CENTER);

    } 

    class MyItemListener_JR implements ItemListener{
        public void itemStateChanged(ItemEvent e){
            if (e.getStateChange() == ItemEvent.DESELECTED){
                return;
            }
            if(button.get(0).isSelected()){
                img.setIcon(image.get(0));
            }
            else if(button.get(1).isSelected()){
                img.setIcon(image.get(1));
            }
            else {
                img.setIcon(image.get(2));
            }
        }
    }
}
