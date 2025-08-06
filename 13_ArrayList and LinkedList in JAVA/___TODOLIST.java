import java.util.*;

public class ___TODOLIST {
    public static void showMenu(){
        System.out.println("1. Add a task");
        System.out.println("2. Remove a task");
        System.out.println("3. Mark task done");
        System.out.println("4. Display Tasks");
        System.out.println("5. Show Tasks done");
        System.out.println("6. Show Tasks not done");
        System.out.println("7. Reverse TodoList");
        System.out.println("8. Clear TodoList");
        System.out.println("9. Exit");
    }
    // public static void displayTasks(List<Task> buffer){
    //     System.out.println("TASKs LIST:");
    //     buffer.forEach((task) -> task.onScreen());
    //     return;
    // }
    public static void main(String[] args){
        List<Task> buffer = new ArrayList<>();
        while (true){
            showMenu();
            try (Scanner sc = new Scanner(System.in)){
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 9 -> {
                        return;
                    }
                    case 1 -> {
                        System.out.print("Enter task's name: ");
                        String taskName = sc.nextLine();
                        Task task = new Task(taskName, false, "Not Done");
                        buffer.add(task);
                    }
                    case 2 -> {
                        System.out.print("Enter task's name: ");
                        String taskName = sc.nextLine();
                        for (Task t : buffer){
                            if (t.name.equals(taskName)){
                                buffer.remove(t);
                                break;
                            }
                        }
                    }
                    default -> {

                    }
                }
            }
        }
    }
}

class Task{
    public String name;
    public Boolean isDone;
    public String status;
    Task (String name, Boolean isDone, String status){
        this.name = name;
        this.isDone = isDone;
        this.status = status;
    }
    public void onScreen(){
        System.out.println("Hello");
    }
}

