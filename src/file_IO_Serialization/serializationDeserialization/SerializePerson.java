package file_IO_Serialization.serializationDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30, "fsdfg5rg5g65");
        try(FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(person);
            System.out.println("Serialized data saved in the person.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
