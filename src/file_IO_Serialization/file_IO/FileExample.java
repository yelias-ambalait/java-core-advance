package file_IO_Serialization.file_IO;


import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] a) throws IOException {
        File fileName = new File("test.txt");
        if (fileName.exists()) {
            System.out.println(fileName.getName()+ " exists in the "+"'"+fileName.getPath()+"'");
            System.out.println("The file is "+fileName.length()+" bytes long.");
            if (fileName.canRead()) {
                System.out.println("File is readable.");
            } else {
                System.out.println("File is not readable.");
            }
            if (fileName.canWrite()) {
                System.out.println("File is writable.");
            } else {
                System.out.println("File is not writable.");
            }
            System.out.println("Path: "+fileName.getAbsolutePath());
            System.out.println("File name: "+fileName.getName());
            System.out.println("File length: "+fileName.length()+ " bytes.");

        } else {
            System.out.println("File doesn't exist.");
        }
    }
}
