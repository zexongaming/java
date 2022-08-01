import java.util.Scanner;
class Sort
{
	public static void main(String args[])
	{
		int []a=new int[5];
		int t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Element : ");
		for(int i=0; i<5; i++)
		{
			a[i] = sc.nextInt();	
		}
		for(int i=0; i<5; i++)
		{
			for(int j=i; j<5; j++)
			{
				if(a[i] > a[j])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		System.out.println("Sorted Element : ");
		for(int k=0; k<5; k++)
		{
			System.out.println(" "+a[k]);
		}
	}
}	