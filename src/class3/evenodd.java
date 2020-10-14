package class3;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int even=0;
		int odd=0;
		while(i<n)
		{
			int input=sc.nextInt();
			if(input%2==0)
			{
				even=even+input;
			}
			else {
				odd=odd+input;
			}
			i++;
			
			
		}
		System.out.print(even+" "+odd);
		
		

	}

}
