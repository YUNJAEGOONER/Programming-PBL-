import javax.swing.*;//스윙 컴포넌트 클래스들의 경로명 
import java.awt.*;
/**
 * Write a description of class SwingFrameEX_Chap9 here.
 *
 * @author (2018315039 이윤재)
 * @version (2019.10.11)
 */
public class SwingFrameEX_Chap9 extends JFrame
//JFrame 스윙에서 프레임의 역할을 수행하는 클래스
// Frame, Menubar, ContentPane 3공간으로 구성
{
    public SwingFrameEX_Chap9(){
        setTitle("300 x 300 Frame");//타이틀
        setSize(300,300);//프레임의 크기 설정
        setVisible(true);//프레임이 출력되도록 지시, false의 경우 프레임이 숨겨
        
        Container contentPane = getContentPane(); //프레임의 컨텐트팬을 알아낸다.
        contentPane.setBackground(Color.BLUE);//프레임의 배경색을 파란색으로 설정
        
        contentPane.setLayout(new FlowLayout());//컨텐트팬에 FlowLayout 배치관리자 달기
        //FlowLayout : 컴포넌트를 왼쪽에서 오른쪽으로 배치하고, 더 이상 오른쪽 공간이 없으면 다시 아래로 내려와서 왼쪽에서 오른쪽으로 배치 
        contentPane.add(new JButton("S"));
        contentPane.add(new JButton("U"));
        contentPane.add(new JButton("N"));
        contentPane.add(new JButton("M"));
        contentPane.add(new JButton("O"));
        contentPane.add(new JButton("O"));
        contentPane.add(new JButton("N"));
      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //프레임 윈도우를 닫으면 프로그램을 종료        
    }
    
    public static void main(String[] args){
       SwingFrameEX_Chap9 frame = new SwingFrameEX_Chap9();       
    }
}


