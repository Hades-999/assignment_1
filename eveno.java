import java.util.*;
class eveno
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		System.out.println("Even numbers b/w 1 and "+n+" are:");
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}
}