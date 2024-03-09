package forLoop;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scanner.nextInt();
		
		boolean isprime=true;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				isprime=false;
				break;
			}
		}
		if(isprime)
			System.out.println(num + "prime");
		else
			System.out.println(num + "not prime");
	}

}
