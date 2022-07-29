import java.util.Scanner;
class Fact
{
	public static void main(String args[])
	{
	int n,a=1;
	Scanner sc=new Scanner(System.in);	
	System.out.println("Ener number=");
	n = sc.nextInt();
		
	
	for (int i=1; i<=n; i++)
	{
	a=a*i;
	}	
	System.out.println("FACTORIAL IS:" +a);
	}
}