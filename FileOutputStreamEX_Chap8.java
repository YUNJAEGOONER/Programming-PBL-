import java.io.*;
/**
 * Write a description of class FileOutputStreamEX_Chap8 here.
 *
 * @author (2018315039 이윤재)
 * @version (2019.09.28)
 */
public class FileOutputStreamEX_Chap8
{
    public static void main(String[] args){
        byte b [] = {7,51,3,4,-1,24};
        try{
            FileOutputStream fout = new FileOutputStream("C:\\Users\\entity\\Desktop\\test.txt");
            for (int i = 0; i < b.length ;i++)
                fout.write(b[i]);
                // b의 요소들을 하나씩 쓰기
            fout.close();            
        }catch(IOException e){
            System.out.println("경로명을 확인해 주세요");
            return;
        }
        System.out.println("저장완료");   
    }
}
