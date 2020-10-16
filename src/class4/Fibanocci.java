package class4;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int f1 = 0, f2 = 1, i,n; 
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	if (n < 1) 
	{
	    return;
	}   
	for (i = 1; i <= n; i++) 
    { 
	    System.out.print(f2+" "); 
	    int next = f1 + f2; 
	    f1 = f2; 
	    f2 = next; 
	 } 
	        System.out.println(n);
	}

}
