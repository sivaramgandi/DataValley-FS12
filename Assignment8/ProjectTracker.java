import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Project {
    String studentName;
    int completionTime;
    public Project(String studentName, int completionTime) {
        this.studentName = studentName;
        this.completionTime = completionTime;
    }
}
public class ProjectTracker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Project> projects = new ArrayList<>();
        System.out.println("Enter no of Students");       
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter name of the Students");    
            String studentName=sc.next();
            System.out.println("Enter no of days");    
            int completioTime=sc.nextInt();
            projects.add(new Project(studentName, completioTime));
        }  
        Map<String, Integer> onTimeCount = new HashMap<>();
        Map<String, Integer> lateCount = new HashMap<>();
        Map<String, Integer> earlyCount = new HashMap<>();
        Map<String, Integer> totalProjects = new HashMap<>();
        Map<String, Integer> totalCompletionTime = new HashMap<>();
        for (Project project : projects) {
            if (!onTimeCount.containsKey(project.studentName))
                onTimeCount.put(project.studentName, 0);
            if (!lateCount.containsKey(project.studentName))
                lateCount.put(project.studentName, 0);
            if (!earlyCount.containsKey(project.studentName))
                earlyCount.put(project.studentName, 0);
            if (!totalProjects.containsKey(project.studentName))
                totalProjects.put(project.studentName, 0);
            if (!totalCompletionTime.containsKey(project.studentName))
                totalCompletionTime.put(project.studentName, 0);
            //let the dead line to complete project be one month
            if (project.completionTime == 30) {
                onTimeCount.put(project.studentName, onTimeCount.get(project.studentName) + 1);
            } else if (project.completionTime > 10) {
                lateCount.put(project.studentName, lateCount.get(project.studentName) + 1);
            } else {
                earlyCount.put(project.studentName, earlyCount.get(project.studentName) + 1);
            }
            totalProjects.put(project.studentName, totalProjects.get(project.studentName) + 1);
            totalCompletionTime.put(project.studentName, totalCompletionTime.get(project.studentName) + project.completionTime);
        }
        for (String student : totalProjects.keySet()) {
            int onTime = onTimeCount.get(student);
            int late = lateCount.get(student);
            int early = earlyCount.get(student);
            int total = totalProjects.get(student);
            int totalDays = totalCompletionTime.get(student);
            double averageCompletionTime = (double) totalDays / total;
            System.out.println("Student: " + student);
            System.out.println("Projects completed on time: " + onTime);
            System.out.println("Projects completed late: " + late);
            System.out.println("Projects completed early: " + early);
            System.out.println("Average completion time: " + averageCompletionTime + " days");
        }
    }
}
