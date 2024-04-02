import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Movie {
    String title;
    String category;
    double rating;
    public Movie(String title, String category, double rating) {
        this.title = title;
        this.category = category;
        this.rating = rating;
    }
}
public class MovieRating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(system.in);
        System.out.println("Enter number movies");
        int n=sc.nextInt();
        List<Movie> movies = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("Enter movie title");
            String title=sc.next();
            System.out.println("Enter movie category");
            String category=sc.next();
            System.out.println("Enter movie rating");
            double rating=sc.nextDouble();
            movies.add(new Movie(title,category,rating));
        }
       Map<String, Integer> movieCounts = new HashMap<>();
        Map<String, Double> categoryTotalRatings = new HashMap<>();
        for (Movie movie : movies) {
            if (!movieCounts.containsKey(movie.category))
                movieCounts.put(movie.category, 0);
            if (!categoryTotalRatings.containsKey(movie.category))
                categoryTotalRatings.put(movie.category, 0.0);
            movieCounts.put(movie.category, movieCounts.get(movie.category) + 1);
            categoryTotalRatings.put(movie.category, categoryTotalRatings.get(movie.category) + movie.rating);
        }
        System.out.println("Movie Ratings");
        for (String category : movieCounts.keySet()) {
            int count = movieCounts.get(category);
            double totalRating = categoryTotalRatings.get(category);
            double averageRating = totalRating / count;
            System.out.println("Category: " + category);
            System.out.println("Number of movies: " + count);
            System.out.println("Average rating: " + averageRating + "\n");
        }
    }
}
