import java.io.*;
import java.util.*;
public class validtriangle
{
public static void main(String []args)
{
int x;int y;int z;
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
y=sc.nextInt();
z=sc.nextInt();
if ((x+y+z)==180)
{
System.out.println("Valid");
}
else
{
System.out.println("Not Valid");
}
}
}


