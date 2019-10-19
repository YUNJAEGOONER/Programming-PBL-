import java.awt.event.*;
import javax.swing.*;
/**
 * Write a description of class MyKeyListener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class MyKeyListener extends KeyAdapter{
    private JLabel[] KeyMessage;    
    public MyKeyListener(JLabel[] KeyMessage){
        this.KeyMessage = KeyMessage; 
    }    
    public void keyPressed(KeyEvent e){
        int keyCode = e.getKeyCode();
        char keyChar = e.getKeyChar();
        KeyMessage[0].setText(Integer.toString(keyCode));// 키 코드 알아내기
        KeyMessage[1].setText(Character.toString(keyChar));// 키 문자값 알아내기 (키의 유니코드 문자)
        KeyMessage[2].setText(KeyEvent.getKeyText(keyCode)); // 키의 이름 문자열 알아내기
        System.out.println("keyPressed");
    }
    public void keyReleased(KeyEvent e){
        System.out.println("KeyReleased");
    }
    public void keyTyped(KeyEvent e){
        System.out.println("KeyTyped");
    }
}

