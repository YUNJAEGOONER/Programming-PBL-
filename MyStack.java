import java.util.*;
/**
 * Write a description of class MyStack here.
 *
 * @author (2018315039 이윤재)
 * @version (2019.09.27)
 */
public class MyStack<T> //타입 매개변수가 T인 제네릭 클래스 MyStack
{
    int top;
    ArrayList<T> array = null ; 
    //비어있는 ArrayList 타입의 array를 선언
    public MyStack(){
        top = -1;
        array = new ArrayList<T>();
    }
    
    public void Push(T data){
        array.add(top + 1 , data);
        top = top + 1;
    }
    
    public T Pop(){
        return array.remove(top--);
    }
    
    public int size(){
        return array.size();
    }
}
