package class4;

import java.util.Scanner;

public class Largesmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int i=0;
        while(i<n)
        {
        	int n1=sc.nextInt();
        	if (n1>max)
        	{
        		max=n1;
        	}
        	if (n1<min)
        	{
        		min=n1;
        	}
        	i++;
        }
        System.out.println("maximum value: "+max);
        System.out.println("minimum value: "+min);
	}

}
