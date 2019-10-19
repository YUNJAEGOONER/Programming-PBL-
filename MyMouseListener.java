import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Write a description of class MyMouseListener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyMouseListener implements MouseListener
{
    JLabel la;
    public MyMouseListener(JLabel la){
       this.la = la;
    }
    
    public void mousePressed(MouseEvent e){
        int X = e.getX();//마우스 클릭 좌표
        int Y = e.getY();//
        la.setLocation(X,Y);
    }

    public void mouseReleased(MouseEvent e){}

    public void mouseClicked(MouseEvent e){}

    public void mouseEntered(MouseEvent e){}

    public void mouseExited(MouseEvent e){}        

}
