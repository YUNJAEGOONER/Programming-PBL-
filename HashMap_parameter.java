import java.util.*;
/**
 * Write a description of class HashMap_parameter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HashMap_parameter
{
    public static void main(String[] arge){
        HashMap<String, Student_HashMap> map = new HashMap<String, Student_HashMap>();
        //String 을 key , Student_HashMap클래스의 객체를 value로하는 HashMap 생성
        map.put("황기태" , new Student_HashMap(1, "010-111-1111"));
        map.put("이재문" , new Student_HashMap(2, "010-222-2222"));
        map.put("김남윤" , new Student_HashMap(1, "010-333-3333"));
        //3명의 학생 저장

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("검색할 이름?");
            String name = scanner.nextLine();
            if (name.equals("exit"))
                break;
            Student_HashMap student = map.get(name);
            //name을 가진 value를 가져온다 => value는 Student_HashMap 클래스의 객체
            if(student == null)
                System.out.println(name + "은 없는 사람입니다");
            else
                System.out.println("id:" + student.getid() + "전화" + student.gettel());
        }
    }
}
