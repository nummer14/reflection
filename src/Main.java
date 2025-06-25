import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void writeFile(String filename,String content) {
        FileWriter writer = null;

        try {
            writer = new FileWriter(filename);
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        writeFile("lunch-menu.txt","오늘의 점심 메뉴는 무엇인가요?");
        System.out.println("파일 생성 완료");
    }
}