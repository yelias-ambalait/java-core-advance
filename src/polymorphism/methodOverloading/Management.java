package polymorphism.methodOverloading;

import java.util.ArrayList;
import java.util.List;

public class Management {

    private List<Teacher> list;

    public Management(){
        this.list = new ArrayList<Teacher>();
    }

    public void addTeacher(String name, int id){
        list.add(new Teacher(name, id));
    }

    public void addTeacher(String name, int id, String subject){
        list.add(new Subject(name, id, subject));
    }

    public void addTeacher(String name, int id, int classNo, int roomNo ){
        list.add(new Room(name, id, classNo, roomNo));
    }

    public void displayInfo(){

        for( Teacher l : list){
            System.out.println(l.toString());
        }
    }
}
