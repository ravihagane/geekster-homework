import java.io.*;
import java.util.*;
public class gradeMeaning
{
public static void main(String []args)
{
char grade;
Scanner sc=new Scanner(System.in);
grade=sc.next().charAt(0);

if ((grade=='A') || (grade=='a'))
{
    System.out.println("Excellent");
}
else if ((grade=='B') || (grade=='b'))
{
    System.out.println("Good");
}
else if ((grade=='C') || (grade=='c'))
{
    System.out.println("Average");
}
else if ((grade=='D') || (grade=='d'))
{
   System.out.println("Deficient");
}
else if ((grade=='F') || (grade=='f'))
{
   System.out.println("Failing");
}
}
}

