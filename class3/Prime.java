package class3;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        if (n>0) 
        {
        	if(n==0 ||n==1)
        	{
        		System.out.println("No");
        	}
        	else
        	{
        		for(int i=2;i*i<=n;i++)
                {
                	if (n%i==0) {
                		count++;
                	}
                }
                if(count==0)
                {
                	System.out.println("yes");
                }
                else {
                	System.out.println("no");
                }
        	}
        }
        else
        {
        	System.out.println("please Enter a postive number!");
        }
        
        
	}

}
