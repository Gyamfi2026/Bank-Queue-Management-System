import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Bank Queue Management System
 * Demonstrates the FIFO (First In, First Out) queue data structure.
 */
public class Main {
    private static final Queue<String> customerQueue = new LinkedList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        System.out.println("==================================");
        System.out.println("   BANK QUEUE MANAGEMENT SYSTEM");
        System.out.println("==================================");

        while (running) {
            displayMenu();
            System.out.print("Choose an option (1-5): ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    addCustomer();
                    break;
                case "2":
                    serveNextCustomer();
                    break;
                case "3":
                    displayQueue();
                    break;
                case "4":
                    displayQueueSize();
                    break;
                case "5":
                    running = false;
                    System.out.println("Thank you for using the Bank Queue Management System!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
            System.out.println();
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n---------- MAIN MENU ----------");
        System.out.println("1. Add customer to queue");
        System.out.println("2. Serve next customer");
        System.out.println("3. Display waiting customers");
        System.out.println("4. Count waiting customers");
        System.out.println("5. Exit");
    }

    // Enqueue: add a customer to the end of the queue.
    private static void addCustomer() {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Customer name cannot be empty.");
            return;
        }

        customerQueue.offer(name);
        System.out.println(name + " has been added to the queue.");
        System.out.println("Position in queue: " + customerQueue.size());
    }

    // Dequeue: remove the customer at the front of the queue.
    private static void serveNextCustomer() {
        String customer = customerQueue.poll();

        if (customer == null) {
            System.out.println("The queue is empty. There are no customers to serve.");
        } else {
            System.out.println("Now serving: " + customer);
            System.out.println("Customers remaining: " + customerQueue.size());
        }
    }

    private static void displayQueue() {
        if (customerQueue.isEmpty()) {
            System.out.println("The queue is currently empty.");
            return;
        }

        System.out.println("Waiting customers (front to back):");
        int position = 1;
        for (String customer : customerQueue) {
            System.out.println(position + ". " + customer);
            position++;
        }
    }

    private static void displayQueueSize() {
        System.out.println("Number of waiting customers: " + customerQueue.size());
    }
}
