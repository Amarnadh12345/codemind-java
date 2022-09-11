import java.io.*;
import java.util.*;
import java.util.regex.*;
/// check pattern and matcher in geeks for geeks and java
///point refernce
class a{
	public static boolean isValid(String s)
	{
		Pattern p = Pattern.compile("^\d{10}$");
		Matcher m = p.matcher(s);
		return (m.matches());
	}

	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if (isValid(s))
			System.out.println("Valid");
		else
			System.out.println("Invalid");

	}
}
