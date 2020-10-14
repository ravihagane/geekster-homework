package class3;

import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int i=2;
		int k=(int) Math.sqrt(n);
		while(i<k)
		{
			if (i%n!=0)
			{
				System.out.println(n + " is prime");
			}
			else {
				System.out.println(n + "not a prime");
			}
			
			i++;
			
		}

	}

}
