package classaman;
import java.util.*;
public class Decreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Decreasingorder(n);

	}
	public static void Decreasingorder(int num)
	{
		if(num>0)
		{
			System.out.println(num);
			
			Decreasingorder(num-1);
			
		}
			
		
	}
	

}
