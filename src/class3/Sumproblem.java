package class3;

import java.util.Scanner;

public class Sumproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1;int n2;int n;
        do
        {
        	n1=sc.nextInt();
        	n2=sc.nextInt();
        	System.out.println("Enter 0-To stop || 1 - to contine");
        	n=sc.nextInt();
        	System.out.println(n1+n2);
        }
        while(n==1);
        
	}

}
