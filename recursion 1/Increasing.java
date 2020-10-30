package classaman;

import java.util.Scanner;

public class Increasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		printIncreasing(n);

	}
	public static void printIncreasing(int num)
	{
		if(num>0)
		{
			printIncreasing(num-1);
			System.out.println(num);
		}
	}

}
