import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TestScore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(system.in);
        System.out.println("Enter number Students");
        int n=sc.nextInt();
        List<Double> scores = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("Enter Student Score");
            double score=sc.nextDouble();
            scores.add(score);
        }
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        double average = sum / scores.size();
        Collections.sort(scores);
        double median;
        if (scores.size() % 2 == 0)
            median = (scores.get(scores.size() / 2) + scores.get(scores.size() / 2 - 1)) / 2;
        else 
            median = scores.get(scores.size() / 2);
        int aboveAverageCount = 0;
        int atAverageCount = 0;
        int belowAverageCount = 0;
        for (double score : scores) {
            if (score > average) {
                aboveAverageCount++;
            } else if (score == average) {
                atAverageCount++;
            } else {
                belowAverageCount++;
            }
        }
        System.out.println("Number of students who scored above the average: " + aboveAverageCount);
        System.out.println("Median score for students who scored above the average: " + median);
        System.out.println("Number of students who scored at the average: " + atAverageCount);
        System.out.println("Median score for students who scored at the average: " + median);
        System.out.println("Number of students who scored below the average: " + belowAverageCount);
        System.out.println("Median score for students who scored below the average: " + median);
    }
}
