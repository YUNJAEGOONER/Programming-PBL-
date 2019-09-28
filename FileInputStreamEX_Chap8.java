import java.io.*;
import java.util.*;
//ArrayList를 사용하기위하여 import
/**
 * Write a description of class FileInputStream here.
 *
 * @author (2018315039 이윤재)
 * @version (2019.09.28)
 */
public class FileInputStreamEX_Chap8
{
    public static void main(String[] args){
        ArrayList<Byte> a = new ArrayList<Byte>();
        //Byte를 타입매개변수로갖는 ArrayList a 생성
        try{
            FileInputStream fin = new FileInputStream("C:\\Users\\entity\\Desktop\\test.out");
            int n = 0;
            int c;
            while ((c = fin.read()) != -1){
                a.add((byte)c);                              
            }
            System.out.println("C:\\Users\\entity\\Desktop\\test.out 을 읽습니다");
            for (int i =0 ; i < a.size() ; i++){
                System.out.print(a.get(i) + " ");
            }
            System.out.println("");
            fin.close();
        }catch(IOException e){
            System.out.println("경로명을 확인해주세요");
        }
    }
}