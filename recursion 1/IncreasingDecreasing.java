package classaman;

import java.util.Scanner;

public class IncreasingDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		increasedecrease(n);
		
	

	}
	public static void increasedecrease(int num)
	{
		if(num==0)
		{
			return;
		}
		if(num==5)
		{
			System.out.println(num);
			increasedecrease(num-1);
		}
			
		increasedecrease(num-1);
		System.out.println(num);
			
		
		
			
			
	}

}
