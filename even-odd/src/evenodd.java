import java.util.Scanner;
public class evenodd {
public static void main(String[] args)
{
	int num = readnum();
	
	if (isOddEven(num))
		System.out.println(num+" is even");
	else
		System.out.println(num+" is odd");
}
public static int readnum()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	return sc.nextInt();
}
public static boolean isOddEven(int num)
{
		/*if(num % 2 == 0)
			return true;
		else
			return false;*/
		/* return num % 2 == 0 ? true : false;*/
	return (num & 1) == 0;
}
}
