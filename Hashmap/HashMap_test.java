import java.util.*;
import java.io.*;
/**
 * Write a description of class HashMap_test here.
 *
 * @author (2018315039 이윤재, 2018315034 정철우)
 * @version (2019.10.07)
 */
public class HashMap_test
{
    public static void main(String[] args){
        HashMap <String, Integer> hm = new HashMap <String, Integer>();
        //key를 String, value를 Integer로 가지는 HashMap생성
        try{
            FileReader fin = new FileReader("c:\\Temp\\inputData20191007.txt");
            //FileReader를 통해 파일 읽어오기             
            Scanner scanner = new Scanner(fin); // 파일에서 한 라인 읽기
            int sum = 0;           
            while(scanner.hasNext()){
                String string = scanner.nextLine();
                StringTokenizer st = new StringTokenizer(string," "); //StringTokenizer를 이용해 띄어쓰기(" ")단위로 String 잘라내기
                String name = st.nextToken();
                String score = st.nextToken();
                int score_int = Integer.parseInt(score); // String => int
                hm.put(name, score_int); 
            }                        
            Set<String> keys = hm.keySet();  // 모든 key를 가진 Set 컬렉션 리턴
            Iterator<String> it = keys.iterator();  // Set에 있는 모든 key를 순서대로 검색하는 Iterator 리턴
            while(it.hasNext()){
                String key = it.next();  // 다음 키
                Integer value = hm.get(key);  // value 알아내기
                sum = sum + value;
            }
            System.out.println("------ 계산 결과 ------");
            System.out.println("총점 : " + sum);
            System.out.println("평균 : " + (double)(sum / hm.size()));
        }
        catch(IOException e){
            System.out.println("File Error");
        }
    }
}
