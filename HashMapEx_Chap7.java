import java.util.*;
/**
 * Write a description of class HashMap_Chap7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HashMapEx_Chap7
{
    public static void main(String[] args){
        HashMap<String, String> dic = new HashMap<String, String>();
        //key 와 value를 모두 String 타입으로 가지는 Hash맵을 생성
        //key 와 value의 타입이 같을 필요는 없다
        dic.put("Baby" , "아기");
        //Baby를 key로 가지고 아기를 value로 가진다
        dic.put("Love" , "사랑");
        dic.put("Apple" , "사과");
        
        System.out.println(dic.get("Love"));
        //Love 를 키값으로 가지는 요소의 value 알아내기
        String kor1 = dic.get("Sunmoon");
        System.out.println(kor1);
        //Sunmoon을 키값으로 가지는 요소가 없으므로 kor1은 null 값을 가진다
        dic.remove("Apple");
        //Apple을 키값으로 가지는 요소 삭제
        System.out.println(dic.size());
        //HashMap dic의 요소 개수 알아내기
    }
}
