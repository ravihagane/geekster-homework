import java.io.*;
import java.util.*;
public class gradecalculator
{
public static void main(String []args)
{
int n1;int n2;int n3;
Scanner sc=new Scanner(System.in);
n1=sc.nextInt();
n2=sc.nextInt();
n3=sc.nextInt();
int n=(n1+n2+n3)/3;
if (n>=90 && n<=100)
{
System.out.println("A");
}
else if(n>=80 && n<=89)
{
System.out.println("B");
}
else if(n>=70 && n<=79)
{
System.out.println("C");
}
else if(n>=60 && n<=69)
{
System.out.println("D");
}
else if(n>=0 && n<=59)
{
System.out.println("F");
}
}
}