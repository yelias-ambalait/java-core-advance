package file_IO_Serialization.file_IO;

import java.io.*;
import java.util.Scanner;

public class TaskManagerApplication {
    private static final String FILE_PATH = "tasks.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Task Manager Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View All Task");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = Integer.parseInt(scanner.nextLine());


            switch (option) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    updateTask(scanner);
                    break;
                case 4:
                    deleteTask(scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");

            }
        }
    }

    private static void addTask(Scanner scanner) {
        System.out.println("Enter task description: ");
        String description = scanner.nextLine();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(description);
            writer.newLine();
            System.out.println("Task added successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        private static void viewTasks() {
        File file = new File(FILE_PATH);
        if (!file.exists() || file.length() == 0) {
            System.out.println("No tasks are available. Please add tasks, and check then.");
            return;
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            int taskCount = 1;
            System.out.println("Tasks:");
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void updateTask(Scanner scanner) {

    }
    public static void deleteTask(Scanner scanner) {

    }
}
