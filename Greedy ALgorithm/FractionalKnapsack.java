import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        double ans = 0.0;
        int values[] = {60, 100, 120};
        int weights[] = {10, 20, 30};
        int kweight = 50;
        
        // Array to store items with their value, weight, and value-to-weight ratio
        double[][] items = new double[values.length][3];
        for (int i = 0; i < values.length; i++) {
            items[i][0] = values[i]; // Value
            items[i][1] = weights[i]; // Weight
            items[i][2] = (double) values[i] / weights[i]; // Value-to-weight ratio
        }
        
        // Sort items by value-to-weight ratio in descending order
        Arrays.sort(items, Comparator.comparingDouble(o -> -o[2])); //  -sign for Descending order sorting
        
        // Pick items for the knapsack
        for (int i = 0; i < items.length; i++) {
            if (kweight >= items[i][1]) {
                // Take the whole item
                ans += items[i][0];
                kweight -= items[i][1];
            } else {
                // Take a fraction of the item
                ans += items[i][2] * kweight; //ratio * remaining knapsack weight
                break; // Knapsack is full
            }
        }
        
        System.out.println("Maximum value in knapsack = " + ans);
    }
}
