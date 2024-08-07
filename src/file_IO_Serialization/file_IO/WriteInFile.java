package file_IO_Serialization.file_IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {
    public static void main(String[] args) throws IOException {
        String file = "notebook.txt";
        String desc = "This is a description that I am writing on notebook file.";
        System.out.println("I am writing on the notebook file: " + desc);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(desc);
    }
}
