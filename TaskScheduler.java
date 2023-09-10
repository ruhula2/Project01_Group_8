
    import java.util.PriorityQueue;
import java.util.Scanner;

    public class TaskScheduler {
        public static void main(String[] args) {
            PriorityQueue<Task> taskQueue = new PriorityQueue<>((t1, t2) -> {
                // Compare tasks based on priority and then due date
                if (t1.priority == t2.priority) {
                    return t1.dueDate.compareTo(t2.dueDate);
                }
                return Integer.compare(t1.priority, t2.priority);
            });

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Task Scheduler Menu:");
                System.out.println("1. Add Task");
                System.out.println("2. View Upcoming Tasks");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline character

                switch (choice) {
                    case 1:
                        System.out.print("Enter task name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter priority (1-5): ");
                        int priority = scanner.nextInt();
                        scanner.nextLine();  // Consume newline character
                        System.out.print("Enter due date (YYYY-MM-DD): ");
                        String dueDate = scanner.nextLine();

                        Task task = new Task(name, priority, dueDate);
                        taskQueue.offer(task);
                        System.out.println("Task added successfully!");
                        break;
                    case 2:
                        System.out.println("Upcoming Tasks:");
                        for (Task upcomingTask : taskQueue) {
                            System.out.println(upcomingTask);
                        }
                        break;
                    case 3:
                        System.out.println("Exiting Task Scheduler.");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }

