import javax.swing.*;
import java.awt.*;
import java.io.*;
/**
 * Write a description of class Container_noLayout here.
 *
 * @author (2018315039 이윤재)
 * @version (2019.10.12)
 */
public class Container_noLayout extends JFrame
{  
    public Container_noLayout()
    {
        setTitle("Null Container Sample");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Container c = getContentPane();
        c.setLayout(null);//컨텐트팬의 배치관리자 제거

        JLabel la = new JLabel("선문대학교");//JLable 컴포넌트 생성
        la.setLocation(130,50);//la의 위치 지정
        la.setSize(200,20);//la의 사이즈 지정
        c.add(la);//la를 컨텐트팬에 부착

        try{
            FileInputStream fin = new FileInputStream("C:\\Users\\entity\\Desktop\\test.txt");
            InputStreamReader in = new InputStreamReader(fin,"MS949");
            int k;
            int i = 0;
            while((k=in.read()) != -1){
                i = i + 1;
                String n = Character.toString((char)k);
                JButton b = new JButton(n);//String n이 써있는 버튼만들기
                b.setLocation(i*15, i*15);//버튼의 위치 정하기
                b.setSize(80,20);//버튼의 사이즈 정하기
                c.add(b); // 컨텐트팬에 버튼을 추가하기
            }
        }catch(IOException e){
            System.out.println("Error");
        }        
    }

    public static void main (String[] args)
    {
        new Container_noLayout();
    }
}
