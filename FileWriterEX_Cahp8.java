import java.util.*;
import java.io.*;
//Scanner 를 사용하기 위하여 import
/**
 * Write a description of class FileWriter here.
 *
 * @author (2018315039 이윤재)
 * @version (2019.09.28)
 */
public class FileWriterEX_Cahp8
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        FileWriter fout = null;
        int c;
        try{
            fout = new FileWriter("C:\\Users\\entity\\Desktop\\testforFW");
            // 지정된 위치에 파일 생성
            while(true){
                String line = scanner.nextLine();
                if(line.length() ==0)//입력내용 없이 엔터 입력시 종료
                    break;                
                fout.write(line,0,line.length());
                //Scanner 클래스로 부터 입력받은 line을 fout 에 입력
                //인덱스 0번째 부터 line의 길이 까지 입력 받기
                fout.write("\r\n" , 0 ,2);
                //한 줄 띄어쓰기
            }   
            fout.close();
        }catch(IOException e){
            System.out.println("Error");
        }
        scanner.close();
    }
}
