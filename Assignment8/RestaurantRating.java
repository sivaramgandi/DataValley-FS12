import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class RestaurantRating {
    String name;
    double rating;

    public RestaurantRating(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }
}
public class RestaurantRating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(system.in);
        System.out.println("Enter number books");
        int n=sc.nextInt();
        List<RestaurantRating> ratings = new ArrayList<>();
        for (int i=0;i<n;i++){
            System.out.println("Enter Restaurant name");
            String name=sc.next();
            System.out.println("Enter your rating");
            double rating=sc.nextDouble();
        }
        int[] ratingRanges = {1, 5, 6, 10};
        String[] ratingCategories = {"1-5", "6-10"};
        Map<String, Integer> restaurantsInRatingRanges = new HashMap<>();
        Map<String, Double> categoryTotalRatings = new HashMap<>();
        for (int i = 0; i < ratingRanges.length - 1; i++) {
            restaurantsInRatingRanges.put(ratingCategories[i], 0);
            categoryTotalRatings.put(ratingCategories[i], 0.0);
        }
        for (RestaurantRating rating : ratings) {
            double restaurantRating = rating.rating;
            for (int i = 0; i < ratingRanges.length - 1; i++) {
                if (restaurantRating >= ratingRanges[i] && restaurantRating <= ratingRanges[i + 1]) {
                    String category = ratingCategories[i];
                    restaurantsInRatingRanges.put(category, restaurantsInRatingRanges.get(category) + 1);
                    categoryTotalRatings.put(category, categoryTotalRatings.get(category) + restaurantRating);
                    break;
                }
            }
        }
        for (String category : restaurantsInRatingRanges.keySet()) {
            int count = restaurantsInRatingRanges.get(category);
            double totalRating = categoryTotalRatings.get(category);
            double averageRating = count == 0 ? 0 : totalRating / count;
            System.out.println("Number of restaurants rated " + category + ": " + count);
            System.out.println("Average rating for restaurants rated " + category + ": " + averageRating);
        }
    }
}
