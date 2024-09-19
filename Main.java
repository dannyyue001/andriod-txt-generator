public static void main(String[]args)
{
    import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    // Placeholder for your Expense List
    private static ArrayList<String> expenses = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        // Welcome message
        System.out.println("Welcome to the Personal Finance Tracker!");

        // Main program loop
        while (running) {
            // Display the main menu
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            // Handle menu choice
            switch (choice) {
                case 1:
                    addExpense(scanner);
                    break;
                case 2:
                    viewExpenses();
                    break;
                case 3:
                    setBudget(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the Finance Tracker. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    // Method to display the menu
    public static void printMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("1. Add an expense");
        System.out.println("2. View expenses");
        System.out.println("3. Set budget");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    // Method to add an expense
    public static void addExpense(Scanner scanner) {
        System.out.print("Enter expense description: ");
        String description = scanner.nextLine();
        System.out.print("Enter expense amount: ");
        String amount = scanner.nextLine();
        
        // Add to expenses list (could be expanded to a more complex object)
        expenses.add(description + " - $" + amount);
        System.out.println("Expense added successfully!");
    }

    // Method to view expenses
    public static void viewExpenses() {
        System.out.println("\nYour Expenses:");
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
        } else {
            for (String expense : expenses) {
                System.out.println(expense);
            }
        }
    }

    // Placeholder method to set a budget
    public static void setBudget(Scanner scanner) {
        System.out.print("Enter your budget for the month: ");
        String budget = scanner.nextLine();
        System.out.println("Your budget of $" + budget + " has been set.");
    }
}
}