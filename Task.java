import java.util.PriorityQueue;
import java.util.Scanner;

    class Task {
        String name;
        int priority;
        String dueDate;

        public Task(String name, int priority, String dueDate) {
            this.name = name;
            this.priority = priority;
            this.dueDate = dueDate;
        }

        @Override
        public String toString() {
            return "Task: " + name + "\nPriority: " + priority + "\nDue Date: " + dueDate;
        }
    }

