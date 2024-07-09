package oops.polymorphism.methodOverloading;

public class Room extends Teacher{

    private int classNo;
    private int roomNo;
    public Room(String name, int id, int classNo, int roomNo) {
        super(name, id);
        this.classNo = classNo;
        this.roomNo = roomNo;
    }

    @Override
    public String toString(){
        return "Room{name: " + super.getName() + ", roomCode: " + super.getId() + ", classNo: " + classNo + ", roomNo: " + roomNo+"}";
    }
}
