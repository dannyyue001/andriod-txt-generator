public class SavingsGoal {
    private double goalAmount;
    private double currentSavings;

    public SavingsGoal(double goalAmount) {
        this.goalAmount = goalAmount;
        this.currentSavings = 0.0;
    }

    public void addToSavings(double amount) {
        this.currentSavings += amount;
    }

    public boolean isGoalMet() {
        return currentSavings >= goalAmount;
    }

    @Override
    public String toString() {
        return "Savings Goal: $" + goalAmount + ", Current Savings: $" + currentSavings +
               (isGoalMet() ? " (Goal reached!)" : " (Keep saving!)");
    }
}
