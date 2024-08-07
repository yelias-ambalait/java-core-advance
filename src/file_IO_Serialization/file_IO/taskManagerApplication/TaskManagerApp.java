package file_IO_Serialization.file_IO.taskManagerApplication;

import java.util.List;
import java.util.Scanner;

public class TaskManagerApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final TaskManager taskManager = new TaskManager();
    public static void main(String[] args) {
        while (true) {
            System.out.println("Task Manager Menu: ");
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
    static void addTask() {
        System.out.println("Enter task description: ");
        String description = scanner.nextLine();
        taskManager.addTask(new Task(description));
    }
    private static void viewTasks() {
        List<Task> tasks = taskManager.viewTasks();
        if (tasks.isEmpty()) {
            System.out.println("No tasks are available. Please add tasks and then view them.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1)+". "+tasks.get(i));
            }
        }
    }
    private static void updateTask() {
        try {
            viewTasks();
            System.out.println("Enter task number to update: ");
            int taskNumber = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter new task description: ");
            String newDescription = scanner.nextLine();
            taskManager.updateTask(taskNumber - 1, newDescription);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
    private static void deleteTask() {
        System.out.println("Enter task number to delete: ");
        int taskNumber = Integer.parseInt(scanner.nextLine());
        taskManager.deleteTask(taskNumber - 1);
    }
}
