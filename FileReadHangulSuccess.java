import java.io.*;
public class FileReadHangulSuccess {
    public static void main(String[] args) {
        InputStreamReader in = null;
        //바이트 스트림을 전달바다 문자정보로 변환하는 스트림객체
        FileInputStream fin = null;
        //텍스트파일을 읽기위한 바이트파일 입력 스트림
        try {
            fin = new FileInputStream("c:\\a.txt");
            in = new InputStreamReader(fin, "MS949"); // 올바른 문자 집합 지정
            int c;

            System.out.println("인코딩 문자 집합은 " + in.getEncoding());
            while ((c = in.read()) != -1) {
                System.out.print((char)c);
            }
            in.close();
            fin.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}