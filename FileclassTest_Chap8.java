import java.io.*;
/**
 * Write a description of class FileclassTest_Chap8 here.
 *
 * @author (2018315039 이윤재)
 * @version (2019.09.29)
 */
public class FileclassTest_Chap8
{
    public static void main(String[] args){
        File f = new File("c:\\a.txt"); 
        long size = f.length(); //파일의 크기
        String filename = f.getName(); //파일의 파일명
        String path = f.getPath(); //파일의 완전경로명
        String Parent = f.getParent();//부모디렉터리 알아내기        
        if(f.isFile())//파일 타입 판별 
            System.out.println("파일입니다, 파일정보를 출력합니다.");
        System.out.println("이 파일의 크기는" + size +"입니다.");
        System.out.println("이 파일의 파일명은 " + filename +"입니다.");
        System.out.println("이 파일의 완전경로명는" + path +"입니다.");
        System.out.println("이 파일의 부모 디렉터리는 " + Parent +"입니다.");

    }
}

