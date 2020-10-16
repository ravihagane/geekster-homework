package class4;

import java.util.Scanner;

public class Sumseries2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,n,sign=-1;
		float sum=0;
		n=sc.nextInt();

		for(i=1;i<=n;i++)
		{
			sign *= -1;
			sum += sign*1.0/i;
		}
		System.out.println(sum);
	}

}
