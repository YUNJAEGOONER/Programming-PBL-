
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String[] args){
        MyStack<Integer> ms= new MyStack<Integer>();
        //Wrapper 클래스, Integer타입을 다루는 스택
        
        ms.Push(4);
        ms.Push(7);
        ms.Push(8);
        ms.Push(2);
        
        System.out.println(ms.size());
        System.out.println(ms.Pop());
        System.out.println(ms.Pop());
        System.out.println(ms.Pop());
        System.out.println(ms.Pop());
        
        
        MyStack<Cylinder> cs = new MyStack<Cylinder>();
        //MyStack 의 요소로 클래스도 들어갈수 있다.
        
        Cylinder c_1 = new Cylinder("원기둥1",2.4, 4);
        Cylinder c_2 = new Cylinder("원기둥2",4.8, 8);
        
        cs.Push(c_1);
        cs.Push(c_2);
        
        System.out.println(cs.size());
        
        System.out.println(cs.Pop());
        System.out.println(cs.Pop());                               
    }
}
