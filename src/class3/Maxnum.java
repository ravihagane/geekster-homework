package class3;
import java.util.*;

public class Maxnum {
	public static void main(String[] args) {
		 int count;
		 Scanner sc=new Scanner(System.in);
		 count= sc.nextInt();
		 int i=0;
		 int max=Integer.MIN_VALUE;
		 while(i<count) 
		 {
			 int num=sc.nextInt();
			 if(num>max) 
			 {
				 max=num;
			  }
			 i++;
		 }
		 System.out.println(max +"is largest");
		 
	   

	}

}
