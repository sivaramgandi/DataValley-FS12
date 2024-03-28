import java.util.*;
class Employee{
    public static void main(String args[]){
        Scanner sc=new Scenner(System.in);
        System.out.println("Enter Current  year");
        int curr=sc.nextInt();
        System.out.println("Enter Joined year");
        int start=sc.nextInt();
        int res=curr-start;
        if(res>5){
        System.out.println("BONUS is Rs 5000");
        }
        else if(res>3){
        System.out.println("BONUS is Rs 3000");
        }
        else
        System.out.println("NO BONUS");
    }
}