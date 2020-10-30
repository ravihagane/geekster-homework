package class4;
import java.util.*;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;int p=0; int ng=0;int count=0;
        while(i<n)
        {
        	int n1=sc.nextInt();
        	if (n1>0)
        	{
        		p=p+n1;
        	}
        	else if(n1<0)
        	{
        		ng=ng+n1;
        	}
        	else
        	{
        		count++;
        	}
        	i++;
        }
        System.out.println("positive number: "+p);
        System.out.println("negative number: "+ng);
        System.out.println("Zero: "+count);
	}

}
