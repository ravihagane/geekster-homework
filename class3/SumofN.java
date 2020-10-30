package class3;

import java.util.Scanner;

public class SumofN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int k=0;
		for (int i=0;i<=n;i++)
		{
			k=k+i;
		}
		System.out.println(k);
	}

}
