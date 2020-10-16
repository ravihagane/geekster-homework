package class4;

public class Angstrom {


	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int k=0;
		int num;int temp;int rem=0;int sum=0;
	    float cube;

	    num = 1;
	    temp = 1;
	    for(int i=1;i<=500;i++)
	    {
	        while(num!=0)
	        {
	            rem = num%10;
	            cube = rem*rem*rem;
	            sum = (int) (sum + cube);
	            num = num/10;
	        }   
	        if(sum == temp) {
	        	System.out.println(temp);
	        }
	        rem = 0;
	        sum = 0;
	        cube = 0;
	        temp = i+1;
	        num = i+1;
	    }

	}
}
