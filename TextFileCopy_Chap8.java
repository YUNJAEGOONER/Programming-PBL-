import java.io.*;
/**
 * Write a description of class TextFileCopy_Chap8 here.
 *
 * @author (2018315039 이윤재)
 * @version (2019.09.29)
 */
public class TextFileCopy_Chap8
{
    public static void main(String[] args){
        File src = new File("c:\\a.txt");//원본 파일 경로명
        File dest = new File("C:\\Users\\entity\\Desktop\\a.txt");//복사 파일 경로명
        int c;
        try{
            FileReader ctrlC = new FileReader(src);//텍스트 파일 읽기, 파일 입력문자 스트림 생성
            FileWriter ctrlV = new FileWriter(dest);//텍스트 파일 복사, 파일 출력 문자 스트림 생성
            while ((c=ctrlC.read()) != -1){//문자하나 읽고
                ctrlV.write((char)c);//읽은 문자 하나 쓰고
            }
            ctrlC.close();
            ctrlV.close();
            System.out.println(src.getPath() + "를" + dest.getPath() + "로 복사 완료");
        }catch(IOException e){
            System.out.println("System Error");
        }
    }
}


