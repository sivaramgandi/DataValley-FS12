import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BookReview {
    String title;
    int rating; // Assuming rating ranges from 1 to 10

    public BookReview(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }
}

public class BookReview {

    public static void main(String[] args) {
        Scanner sc=new Scanner(system.in);
        System.out.println("Enter number books");
        int n=sc.nextInt();
        List<BookReview> reviews = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("Enter name of the book");
            String title=sc.next();
            System.out.println("Enter your ratingbooks");
            int rating=sc.nextInt();
            reviews.add(new BookReview(title,rating));
        }
        int[] ratingRanges = {1, 5, 6, 10};
        String[] ratingCategories = {"1-5 stars", "6-10 stars"};
        Map<String, Integer> booksInRatingRanges = new HashMap<>();
        Map<String, Integer> reviewSentiments = new HashMap<>();
        reviewSentiments.put("positive", 0);
        reviewSentiments.put("neutral", 0);
        reviewSentiments.put("negative", 0);
        for (int i = 0; i < ratingRanges.length - 1; i++) {
            booksInRatingRanges.put(ratingCategories[i], 0);
        }
        for (BookReview review : reviews) {
            int rating = review.rating;
            for (int i = 0; i < ratingRanges.length - 1; i++) {
                if (rating >= ratingRanges[i] && rating <= ratingRanges[i + 1]) {
                    String category = ratingCategories[i];
                    booksInRatingRanges.put(category, booksInRatingRanges.get(category) + 1);
                    break;
                }
            }
            if (rating >= 8)
                reviewSentiments.put("positive", reviewSentiments.get("positive") + 1);
            else if (rating >= 4 && rating <= 7)
                reviewSentiments.put("neutral", reviewSentiments.get("neutral") + 1);
            else
                reviewSentiments.put("negative", reviewSentiments.get("negative") + 1);
        }
        System.out.println("Book Review Analysis:");
        System.out.println("Books reviewed within specified rating ranges:");
        for (String category : booksInRatingRanges.keySet()) {
            System.out.println(category + ": " + booksInRatingRanges.get(category) + " books");
        }
        System.out.println("\nCount of books with positive, neutral, and negative reviews:");
        for (String sentiment : reviewSentiments.keySet()) {
            System.out.println(sentiment + " reviews: " + reviewSentiments.get(sentiment) + " books");
        }
    }
}
