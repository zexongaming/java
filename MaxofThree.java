import java.util.Scanner;
class MacofThree
{
	public static void main(String[] args)
	{
		int a, b, c, max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		max = (a > c)? ((a > c)?a:c) : ((b > c)?b:c);
		System.out.println("Maximum of the three number is " +max);
		 
	}
}