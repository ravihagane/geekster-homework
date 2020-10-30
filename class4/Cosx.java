package class4;

import java.util.Scanner;

public class Cosx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, n, fact, sign =  - 1;
	    float x, p, sum = 0;
	    Scanner sc=new Scanner(System.in);
	    x=sc.nextFloat();
	    n=sc.nextInt();

	    for (i = 2; i <= n; i += 2)
	    {
	        p = 1;
	        fact = 1;

	        for (j = 1; j <= i; j++)
	        {
	            p = p * x;
	            fact = fact * j;
	        }

	        sum += sign * p / fact;
	        sign =  - 1 * sign;
	    }

	    System.out.println(sum+1);
	}

}
