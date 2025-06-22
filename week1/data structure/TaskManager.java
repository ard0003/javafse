public class TaskManager {

    
    static class Task {
        int taskId;
        String taskName;
        String status;
        Task next;

        public Task(int taskId, String taskName, String status) {
            this.taskId = taskId;
            this.taskName = taskName;
            this.status = status;
            this.next = null;
        }

        @Override
        public String toString() {
            return taskId + " - " + taskName + " [" + status + "]";
        }
    }

    
    private Task head;

    
    public void addTask(int id, String name, String status) {
        Task newTask = new Task(id, name, status);
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
    }

    
    public Task searchTask(int id) {
        Task current = head;
        while (current != null) {
            if (current.taskId == id) return current;
            current = current.next;
        }
        return null;
    }

    
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    
    public void deleteTask(int id) {
        if (head == null) return;

        if (head.taskId == id) {
            head = head.next;
            return;
        }

        Task prev = null;
        Task current = head;

        while (current != null && current.taskId != id) {
            prev = current;
            current = current.next;
        }

        if (current != null) {
            prev.next = current.next;
        }
    }

    
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        
        manager.addTask(1, "Complete Assignment", "Pending");
        manager.addTask(2, "Attend Meeting", "In Progress");
        manager.addTask(3, "Review Code", "Completed");

        
        System.out.println("All Tasks:");
        manager.displayTasks();

        
        System.out.println("\nSearching for Task ID 2:");
        Task task = manager.searchTask(2);
        System.out.println(task != null ? task : "Task not found");

        
        System.out.println("\nDeleting Task ID 1");
        manager.deleteTask(1);

        
        System.out.println("\nAll Tasks After Deletion:");
        manager.displayTasks();
    }
}

