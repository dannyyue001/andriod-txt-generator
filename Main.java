import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

public class Main {
    private static ArrayList<Expense> expenses = new ArrayList<>();
    private static SavingsGoal savingsGoal; // Single savings goal for now

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Personal Finance Tracker!");

        while (running) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

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
                    manageSavingsGoal(scanner);
                    break;
                case 5:
                    System.out.println("Thank you for using the Finance Tracker. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    public static void printMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("1. Add an expense");
        System.out.println("2. View expenses");
        System.out.println("3. Set budget");
        System.out.println("4. Manage savings goal");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    // Method to add an expense
    public static void addExpense(Scanner scanner) {
        System.out.print("Enter expense amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter expense category: ");
        String category = scanner.nextLine();

        System.out.print("Enter expense date (yyyy-mm-dd): ");
        String dateInput = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateInput);

        // Create a new Expense object
        Expense expense = new Expense(amount, category, date);
        expenses.add(expense);
        System.out.println("Expense added successfully!");
    }

    // Method to view expenses
    public static void viewExpenses() {
        System.out.println("\nYour Expenses:");
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
        } else {
            for (Expense expense : expenses) {
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

    // Method to manage the savings goal
    public static void manageSavingsGoal(Scanner scanner) {
        if (savingsGoal == null) {
            System.out.print("Enter savings goal amount: ");
            double goalAmount = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            savingsGoal = new SavingsGoal(goalAmount);
            System.out.println("Savings goal of $" + goalAmount + " created.");
        } else {
            System.out.println(savingsGoal); // Display current goal status
            System.out.print("Would you like to add to your savings? (yes/no): ");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("yes")) {
                System.out.print("Enter amount to add to savings: ");
                double amount = scanner.nextDouble();
                savingsGoal.addToSavings(amount);
                System.out.println(savingsGoal); // Display updated status
            }
        }
    }
}