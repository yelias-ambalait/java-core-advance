package file_IO_Serialization.file_IO.readingFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileBufferReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("test.txt");
        BufferedReader reader = new BufferedReader(fileReader);
        String s;
        while ((s = reader.readLine()) != null) {
            System.out.println(s);
        }
        reader.close();

    }
}
