package class4;

import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for (int i=0;i<n;i++)
		{
			System.out.println("**********");
		}
		
		for(int i=0; i<n; i++) 
        {
        for(int j=2*(n-i); j>=0; j--)
            {           
                System.out.print(" "); 
            } 
            for(int j=0; j<=i; j++) 
            {       
                System.out.print("* "); 
            }           
            System.out.println(); 
        } 

		
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		for(int i=0; i<n; i++) 
        {
        for(int j=2*(n-i); j>=0; j--)
            {           
                System.out.print(" "); 
            } 
            for(int j=0; j<=i; j++) 
            {       
                System.out.print("*"); 
            }           
            System.out.println(); 
        } 
		for(int i=1; i<=n; i++) 
        {
        for(int j=2*(n-i); j>=0; j--)
            {           
                System.out.print(" "); 
            } 
            for(int j=0; j<=i; j++) 
            {       
                System.out.print(i+" "); 
            }           
            System.out.println(); 
        } 
	}

}
