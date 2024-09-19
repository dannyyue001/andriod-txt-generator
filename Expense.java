import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Expense {
    private double amount;
    private String category;
    private LocalDate date;

    // Constructor
    public Expense(double amount, String category, LocalDate date) {
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    // Getters and Setters
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    // toString method to print the expense details
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return "Expense [Amount: $" + amount + ", Category: " + category + ", Date: " + date.format(formatter) + "]";
    }
}