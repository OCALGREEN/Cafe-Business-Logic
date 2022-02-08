import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal(int numWeeks) {
        int sum = 0; 
        for(int i = 1; i <= numWeeks; i ++) {
            sum = sum + i; 
        }
        return sum; 
    }

    public double getOrderTotal(double[] prices) {
        double sum = 0.0; 
        for(int i = 0; i < prices.length; i++) {
            sum = sum + prices[i]; 
        }
        return sum; 
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for(int i = 0; i < menuItems.size(); i++) {
            String item = menuItems.get(i); 
            System.out.println(item); 
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter you name: "); // asks the user for his name
        String userName = System.console().readLine(); // logs the user's input
        customers.add(userName);  // adds the user's name to the array
        System.out.println("Hello " + userName); // greets the user
        System.out.println("There are " + (customers.size() - 1) + " people infront of you."); // calculates the # of people infront of them

        System.out.println("\n----- Customer List-----");
        for(int i = 0; i < customers.size(); i++) { // ouputs all the users
            String people = customers.get(i);
            System.out.println(people); 
        }
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        int count = 1; 
        double priceSum = price; 

        for(int i = 0; i < maxQuantity; i++) {
            System.out.println(count+ " - " + priceSum);
            count = count + 1; 
            priceSum = priceSum + price; 
        }
    }

    boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false; 
        }
        for(int i = 0; i < menuItems.size(); i++) {
            String item = menuItems.get(i); 
            Double price = prices.get(i); 
            System.out.println(i + " " + item + " -- " + price); 
        }
        return true; 
    }


}