package string;

public class ReversingString {

	public static void main(String[] args)
	{
		String str="Revers the String";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
}
