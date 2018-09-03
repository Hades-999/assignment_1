import java.util.*;
class primeno
{
	public static void main(String args[])
	{
		int n,i,j,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		System.out.println("Prime numbers b/w 1 and "+n+" are:");
		for(i=1;i<=n;i++)
		{
			c=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==2)
				System.out.println(i);
		}
	}
}