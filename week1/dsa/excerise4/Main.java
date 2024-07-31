package excerise4;


// Main.java
public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        // Adding tasks
        taskList.addTask(new Task(1, "Task 1", "Pending"));
        taskList.addTask(new Task(2, "Task 2", "In Progress"));
        taskList.addTask(new Task(3, "Task 3", "Completed"));

        // Traversing tasks
        System.out.println("All tasks:");
        taskList.traverseTasks();

        // Searching for a task
        System.out.println("\nSearching for task with ID 2:");
        Task task = taskList.searchTask(2);
        if (task != null) {
            System.out.println(task);
        } else {
            System.out.println("Task not found.");
        }

        // Deleting a task
        System.out.println("\nDeleting task with ID 2:");
        taskList.deleteTask(2);

        // Traversing tasks after deletion
        System.out.println("\nAll tasks after deletion:");
        taskList.traverseTasks();
    }
}
