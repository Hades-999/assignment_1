import java.util.*;
class reverse
{
	public static void main(String args[])
	{
		int n,x,r,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		n=sc.nextInt();
		x=n;
		while(x>=1)
		{
			r=x%10;
			rev=rev*10+r;
			x=x/10;
		}
		System.out.println("Reverse="+rev);
	}
}