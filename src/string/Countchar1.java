package string;

public class Countchar1 {

public static void main(String[] artgs)
{
	String str="Hey";
	int count=str.replaceAll("\\s+", "").length();
	System.out.println(count);
}
}


	
/*
 * \\s represents a whitespace character
 * The + sign after \\s means one or more occurrences of whitespace characters. 
 * Therefore, "\\s+" matches one or more whitespace characters.
 * "": This is the replacement string. In this case, it's an empty string "". 
 * It means that all matches found by the pattern "\\s+" will be replaced with an empty string, effectively removing all whitespace characters from the original string.
 */