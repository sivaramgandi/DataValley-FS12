import java.util.Scanner;

public class ExpensesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter quantity purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter price per item: ");
        double pricePerItem = scanner.nextDouble();

        double totalExpenses = calculateTotalExpenses(quantity, pricePerItem);

        System.out.println("Total expenses: $" + totalExpenses);

        scanner.close();
    }

    public static double calculateTotalExpenses(int quantity, double pricePerItem) {
        double totalExpenses = quantity * pricePerItem;

        if (quantity > 50) {
            totalExpenses *= 0.90; 
        } else if (quantity >= 25 && quantity <= 50) {
            totalExpenses *= 0.95; 
        }

        return totalExpenses;
    }
}