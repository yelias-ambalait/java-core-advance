package file_IO_Serialization.file_IO.taskManagerApplication;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private static final String FILE_PATH = "tasks.txt";

    public void addTask(Task task) {
        List<Task> tasks = loadTasks();
        tasks.add(task);
        saveTasks(tasks);
        System.out.println("Task added successfully.");
    }

    public List<Task> viewTasks() {
        return loadTasks();
    }

    public void updateTask(int index, String newDescription) {
        List<Task> tasks = loadTasks();
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setDescription(newDescription);
            saveTasks(tasks);
            System.out.println("Task updated successfully.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public void deleteTask(int index) {
        List<Task> tasks = loadTasks();
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            saveTasks(tasks);
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private List<Task> loadTasks() {
        List<Task> tasks = new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            tasks = (List<Task>) ois.readObject();
        } catch (FileNotFoundException e) {

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tasks;
    }
    private void saveTasks(List<Task> tasks) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(tasks);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
