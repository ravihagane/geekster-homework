package class4;

import java.util.Scanner;

public class Sumseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double i;double s=0.0;int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for (i = 1; i <= n; i++) 
		{
			s = s + 1/i;
		}
		    System.out.println(s);
	}

}
