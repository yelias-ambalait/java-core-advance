package controlFlow.loops.forLoop.dataProcessing;

public class SystemDataProcessing {
    public static void main(String[] args) {

        User[] users = {
                new User("Adam", 60),
                new User("Hawa", 50),
                new User("Shish", 60)
        };

        for (int i = 0; i<users.length; i++) {
            User user = users[i];
            System.out.println("Processing user: "+user.name+ "\tAge: "+user.age);
        }
    }
}
