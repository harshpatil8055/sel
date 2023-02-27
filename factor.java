import java.util.Scanner;
class factor 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int no=s.nextInt();

		for (int i=1;i<=no ;i++ )
		{
			if (no%i==0)
			{
				System.out.println("the factor are"+i);
			}
		}
	}
}
