package javaprograms;
import java.util.Scanner;
public class StringProgram
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		int str_len = sb.length();
		int i;
		for (i = 0; i < str_len; i++)
		{
			char ch = sb.charAt(i);
			if (ch >= 'a' && ch <= 'z')
			{
				int offset = ch - 'a';
				ch = (char) ('A' + offset);
			}
			else if (ch >= 'A' && ch <= 'Z')
			{
				int offset = ch - 'A';
				ch = (char) ('a'+offset);
			}
			sb.setCharAt(i, ch);
		}
		System.out.println(sb);	
	}
}