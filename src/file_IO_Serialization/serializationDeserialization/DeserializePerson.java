package file_IO_Serialization.serializationDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializePerson {
    public static void main(String[] args) {
        Person person = null;
        try(FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream ois = new ObjectInputStream(fileIn)) {
            person = (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Deserialized person...");
        System.out.println(person);
    }
}
