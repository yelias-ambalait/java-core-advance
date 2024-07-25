package exceptions.checkedExceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DocumentManager {

    public static void main(String[] args) {
        try {
            readFile("src/exceptions/checkedExceptions/test.txt");
            System.out.println("Test File is read.");
        } catch (IOException e) {
            System.out.println("Error reading file: "+e.getMessage());
        }
    }

    public static void readFile(String filePath) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch(FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
            throw e;
        }finally {
            if (reader != null) {
                try {
                    reader.close();
                }catch (IOException e) {
                    System.err.println("Failed to close the reader: " + e.getMessage());
                }
            }
        }
    }
}
