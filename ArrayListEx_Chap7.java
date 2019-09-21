import java.util.*;
/**
 * Write a description of class ArrayListEx_Chap7 here.
 *
 * @author (2018315039 이윤재)
 * @version (2019.09.21)
 */
public class ArrayListEx_Chap7
{
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<String>();
        //String 삽입 가능한 ArrayList 생성
        a.add("글");
        a.add("선문대");
        a.add("로");
        a.add("소");
        a.add("프");
        a.add("트");
        a.add("웨어");
        //ArrayList 컬렉션에 삽입
        //String 형태외의 것은 사입불가
        a.add(3,"벌");
        //ArrayList의 3번째 요소에 "벌" 이라는 String 객체 삽입
        a.remove(1);
        //ArrayList의 1번째 요소 삭제
        for (int i=0 ; i < a.size() ; i++){
            //a.size() ArrayList a의 사이즈 알아내기
            System.out.print(a.get(i));
            //a.get(i) ArrayList a의 i번째 객체 알아내기
        
        }
        System.out.println(" ");
        // ArrayList에서 가장 긴 요소 출력
        int LongestIndex = 0;
        for (int i=1; i < a.size() ; i++){
            if (a.get(LongestIndex).length() < a.get(i).length())
            //a.get(i).length() ArrayList a의 i번째 요소의 길이 알아내기
            LongestIndex = i;
        }
        System.out.println(a.get(LongestIndex) + LongestIndex );  
        a.clear();
        //ArrayList a의 모든요소 삭제
        System.out.print(a);
    }
}
