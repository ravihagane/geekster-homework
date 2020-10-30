package class4;

import java.util.Scanner;

public class Sinx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, n, fact, sign =  - 1;
		  float x, p, sum = 0;
		  Scanner sc=new Scanner(System.in);
		  x=sc.nextFloat();
		  n=sc.nextInt();

		  for (i = 1; i <= n; i += 2)
		  {
		    p = 1;
		    fact = 1;
		    for (j = 1; j <= i; j++)
		    {
		      p = p * x;
		      fact = fact * j;
		    }
		    sign =  - 1 * sign;
		    sum += sign * p / fact;
		  }

		  System.out.println(x+"= "+sum);
	}

}
