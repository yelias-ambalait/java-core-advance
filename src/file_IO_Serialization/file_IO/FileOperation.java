package file_IO_Serialization.file_IO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;


public class FileOperation {
    public static void main(String[] args) throws InterruptedException {

        String example = "example.txt";
        File file = new File(example);
//        checking file is created or not.
        try {
            if (file.createNewFile()) {
                System.out.println("Created file: "+file);

            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("No such file.");
            e.printStackTrace();
        }

//        checking file is exists or not.
        if (file.exists()) {
            System.out.println("File exists. ");
        } else {
            System.out.println("File does not exist");
        }

//        writing in the file
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("This is an example file.\n");
            writer.write("This is write operation.\n");
            writer.write("successfully written in the file.\n");
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        reading the file.
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read from file: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        modifying/updating the file
        try(FileWriter writer = new FileWriter(file, true)) {
            System.out.println();
            writer.write("Appending new content in the file.\n");
            writer.write("Appended new content successfully.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
//        again reading the file.
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read from file: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        retrieve data
        System.out.println("\nFile name: "+file);
        System.out.println("File path: "+file.getAbsolutePath());
        System.out.println("File size: "+file.length());
        System.out.println("File is readable: "+file.canRead());
        System.out.println("File is writable: "+file.canWrite());
        System.out.println("File is executable: "+file.canExecute());
        System.out.println();

        try {
            BasicFileAttributes attr = Files.readAttributes(Paths.get(example), BasicFileAttributes.class);
            FileTime time = attr.lastModifiedTime();
            System.out.println("Last modification time: "+time);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();


//        File deletion
        if (file.delete()) {
            System.out.println("File is deleted successfully.");
        } else {
            System.out.println("Failed to delete file.");
        }

        System.out.println();
//        checking file is exists or not.
        if (file.exists()) {
            System.out.println("File exists. ");
        } else {
            System.out.println("File does not exist");
        }

    }
}
