import java.util.Date;
import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }
    public int getStreakGoal(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public void printPriceChart (String product, double price, int maxQuantity) {
        System.out.printf("%s \n", product);
        for (int i = 1; i <= maxQuantity; i++) {
            double sum = price * i;
            System.out.printf("%d - %.2f", i, sum);
        }
    }

    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for (double i : prices) {
            sum += i;
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d %s \n", i, menuItems.get(i));
        }
    }

    public addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.printf("Hello, %s!" username);
        System.out.printf("There are %d people in front of you", customers.size());
        customers.add(username);
        for (String customer : customers) {
            System.out.println(customer)
        }
    }
}
