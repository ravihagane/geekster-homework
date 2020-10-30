package classaman;

import java.util.Scanner;

public class Factrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(factorial(n));

	}
	public static int factorial(int num)
	{
		if (num==1)
		{
			return 1;
		}
		
		int fnum=factorial(num-1);
		int fn=num*fnum;
		return fn;
	}

}
