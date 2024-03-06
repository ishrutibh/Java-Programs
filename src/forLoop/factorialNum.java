package forLoop;

import java.util.Scanner;

public class factorialNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("Enter a number");
int n=scanner.nextInt();
int fact=1;
for(int i=1;i<=n;i++)
{
	fact*=i;
}
System.out.println("Factorial of number" +n+ "is" +fact);
scanner.close();
	}

}
