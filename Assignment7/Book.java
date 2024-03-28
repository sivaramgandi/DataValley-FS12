import java.util.*;
class Book{
    public static void main(String args[]){
        Scanner sc=new Scenner(System.in);
        System.out.println("Nuber of Days");
        int days=sc.nextInt();
        if(days<7){
        System.out.println("FINE is Rs 0.5");
        }
        else if(days<14){
        System.out.println("FINE is Rs 5");
        }
        else
        System.out.println("MEMBERSHIP CANCELED");
    }
}