import java.io.*;
/**
 * Write a description of class CharacterStream here.
 *
 * @author (2018315039 이윤재)
 * @version (2019.09.27)
 */
public class CharacterStream
{
    public static void main(String[] args){
        try{
            FileReader fin = new FileReader("c:\\a.txt");
            //파일 입력 스트림 생성
            int c;
            while((c = fin.read()) != -1){
                //문자 하나를 c에 읽어 들인다.
                //파일의 끝을 만나면 -1을 리턴한다. => 파일을 끝까지 반복한다.                        
                System.out.print((char)c);
                //문자 c를 화면에 출력한다.
            }
            fin.close();
            //스트림 닫기
            //파일 읽기가 더 이상 필요 없을 때 사용
        }
        catch(IOException e){//FileNotFoundException은 IOException을 상속받으므로 IOException만 catch블록에 사용)
            System.out.println("Error");
        }
        //경로명이 틀렸을 경우 FileNotFoundException 발생
        //파일 읽기,쓰기,닫기를 하는 동안 입출력 오류 IOException 발생
    }
}