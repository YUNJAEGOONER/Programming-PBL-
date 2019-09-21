import java.util.Vector;
/**
 * Write a description of class VectorEx here.
 *
 * @author (2018315039 이윤재)
 * @version (2019.09.21)
 */
public class VectorEx_Chap7
{
    public static void main (String[] args){
        Vector<Integer> v = new Vector<Integer>();
        // 정수 값만을 다루는 벡터
        // 타입매개변수로 int와 같은 기본타입 불가
        //Vector<Integer> v = new Vector<Integer>(5); 초기용량이 5인 벡터
        //벡터에 요소 삽입
        v.add(Integer.valueOf(5));//자동박싱기능 적용 v.add(5)
        v.add(4);
        v.add(-1);
        //Integer타입외에 다른 타입의 객체는 삽입불가
        v.add(null);
        //벡터에는 null 값도 삽입 가
        v.add(2,100);//Index 2번째 위치에 100을 삽입
        v.remove(0);//인덱스 0번째 요소 삭제
        System.out.println("벡터의 크기: " + v.size());
        System.out.println("벡터의 용량: " + v.capacity());
        for(int i=0; i < v.size() ; i++ ){
            System.out.println(v.get(i));
            //v.get(i) 벡터v의 i번째 요소 알아내기
        }
        
        int sum = 0;
        
        for(int i=0; i < v.size() ; i++ ){
            //sum = sum + v.get(i);
            if (v.elementAt(i) != null){
                sum = sum + v.elementAt(i);
            }
        }
        System.out.println(sum);
    }
}