import java.io.*;
import java.util.*;
/**
 * Write a description of class StreamBufferEX_Chap8 here.
 * @author (2018315039 이윤재)
 * @version (2019.09.28)
 */
public class StreamBufferEX_Chap8
{
    public static void main(String[] args){
        FileReader fin = null;
        int c;
        try{
            fin = new FileReader("c:\\a.txt");
            BufferedOutputStream out = new BufferedOutputStream(System.out,5);
            //버퍼의 크기가 5이므로 5바이트만 출력된다.
            while ((c = fin.read()) != -1) {//파일 끝을 만날 때까지 문자들을 하나씩 읽는다
                out.write(c); //읽은 문자를 버퍼 출력 스트림에 쓴다.
            }
            new Scanner(System.in).nextLine();
            out.flush();//버퍼에 남아 있던 문자 모두 출력
            fin.close();
            out.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
