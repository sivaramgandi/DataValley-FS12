import java.util.*;
public class Vowel {
   public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int c=0;
    String s=sc.next();
    int l=s.length();
    for(int i=0;i<l;i++){
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
        c+=1;
    }
    if(c==0)
    System.out.println("NO VOWELS ARE PRESENT IN THE STRING");
    else
    System.out.println(" VOWELS ARE PRESENT IN THE STRING AND COUNT IS "+c);
   }
}
