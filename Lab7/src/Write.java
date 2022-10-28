import java.io.FileWriter;
import java.io.IOException;

public class Write {
    void writeToFile(String text, String fileName){
        FileWriter file= null;
        Read read = new Read();
        try {
            file = new FileWriter(fileName);
            file.write(text);
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
