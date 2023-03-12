package rash3;
import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        int marks;
        Scanner sc=new Scanner(System.in);
        marks=sc.nextInt();
        if(marks>90)
        {
            System.out.println("awesome");
        }
        else if(marks>80)
        {
            System.out.println("very good");
        }
        else if(marks>70)
        {
            System.out.println("good");
        }
        else
        {
            System.out.println("work hard");
        }
    }
}
output:88
  very good
