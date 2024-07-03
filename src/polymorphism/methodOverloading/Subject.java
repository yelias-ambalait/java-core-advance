package polymorphism.methodOverloading;

public class Subject extends Teacher{

    private String subject;
    public Subject(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    public String toString(){
        return "Subject{name: " + super.getName() +", subjectCode: "+ super.getId() +", subject: " + subject+"}";
    }

}
