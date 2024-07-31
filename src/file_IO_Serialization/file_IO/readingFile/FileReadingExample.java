package file_IO_Serialization.file_IO.readingFile;

import java.io.*;

public class FileReadingExample {
    public static void main(String[] args) {
        InputStream istream;
        OutputStream ostream = System.out;
        int c;
        final int EOF = -1;

        try {
            File textFile = new File("test.txt");
            istream = new FileInputStream(textFile);
            try {
                while ((c = istream.read()) != EOF) {
                    ostream.write(c);
                }
            } catch(IOException e) {
                System.out.println(e.getMessage());
            }
            finally {
                try {
                    istream.close();
                    ostream.close();
                } catch (IOException e) {
                    System.out.println("File didn't close.");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
