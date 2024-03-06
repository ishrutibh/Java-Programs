package Pattern;

public class Trangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int row=5;
for(int i=1;i<=row;i++)
{
	for(int j=1;j<=row-i;j++)
	{
		System.out.println(""); //print spaces to align 
	}
	for(int k=1;k<=i;k++)
	{
		System.out.println("* "); //print asterisks for each row
	}
	System.out.println(); // move to the next line after printing each row
}
	}

}
