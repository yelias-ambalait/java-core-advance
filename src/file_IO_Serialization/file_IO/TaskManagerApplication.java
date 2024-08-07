package file_IO_Serialization.file_IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManagerApplication {
    private static final String FILE_PATH = "tasks.txt";
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


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
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    updateTask();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");

            }
        }
    }

    private static void addTask() {
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
            System.out.println("No tasks are available. Please add tasks and then view them.");
            return;
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            int taskCount = 1;
            System.out.println("Tasks:");
            while((line = reader.readLine()) != null) {
                System.out.println(taskCount++ +". "+line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void updateTask() {
        List<String> tasks = new ArrayList<>();
        File file = new File(FILE_PATH);

        if (!file.exists() || file.length() == 0) {
            System.out.println("No tasks are available. Please add tasks and then update them.");
            return;
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                tasks.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        viewTasks();
        System.out.println("Enter task number to update: ");
        int taskNumber = Integer.parseInt(scanner.nextLine());

        if (taskNumber <= 0 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }

        System.out.println("Enter new task description: ");
        String newDescription = scanner.nextLine();

        tasks.set(taskNumber - 1, newDescription);

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }
            System.out.println("Task updated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void deleteTask() {
        List<String> tasks = new ArrayList<>();
        File file = new File(FILE_PATH);

        if (!file.exists() || file.length() == 0) {
            System.out.println("No task is available. Add task then delete.");
            return;
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while((line = reader.readLine()) != null) {
                tasks.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        viewTasks();
        System.out.println("Enter task number to delete: ");
        int taskNumber = Integer.parseInt(scanner.nextLine());

        if (taskNumber <=0 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }
        tasks.remove(taskNumber - 1);

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }
            System.out.println("Task is deleted successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
