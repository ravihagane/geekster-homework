package class3;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int k=1;
        while (i<=n) {
        	k=i*k;
        	i++;
        }
        System.out.println(k);
	}

}
