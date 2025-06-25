import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class Main {
    public static void writeFile(String filename, String content) {
        Path filePath = Paths.get(filename);

        try (FileChannel writeChannel = FileChannel.open(filePath, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            buffer.put(content.getBytes());
            System.out.println("Byte Content: " + Arrays.toString(content.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writeFile("dinner-menu.txt", "오늘의 저녁 메뉴는 뭘까요?");
    }
}