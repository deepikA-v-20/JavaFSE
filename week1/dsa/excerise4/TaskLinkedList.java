package excerise4;

public class TaskLinkedList {
    private Node head;

    public TaskLinkedList() {
        this.head = null;
    }

    // Add a new task
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    // Search for a task by ID
    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.getTask().getTaskId() == taskId) {
                return current.getTask();
            }
            current = current.getNext();
        }
        return null;
    }

    // Traverse and print all tasks
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getTask());
            current = current.getNext();
        }
    }

    // Delete a task by ID
    public void deleteTask(int taskId) {
        if (head == null) {
            return;
        }

        if (head.getTask().getTaskId() == taskId) {
            head = head.getNext();
            return;
        }

        Node current = head;
        while (current.getNext() != null && current.getNext().getTask().getTaskId() != taskId) {
            current = current.getNext();
        }

        if (current.getNext() != null) {
            current.setNext(current.getNext().getNext());
        }
    }
}
