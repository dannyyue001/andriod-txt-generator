public class Budget {
    private double totalBudget;
    private double currentSpending;
    
    public Budget(double totalBudget) {
        this.totalBudget = totalBudget;
        this.currentSpending = 0.0;
    }

    public void addSpending(double amount) {
        this.currentSpending += amount;
    }

    public boolean isOverBudget() {
        return currentSpending > totalBudget;
    }

    @Override
    public String toString() {
        return "Budget: $" + totalBudget + ", Current Spending: $" + currentSpending + 
               (isOverBudget() ? " (Over budget!)" : " (Within budget)");
    }
}