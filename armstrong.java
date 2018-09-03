import java.util.*;
class armstrong
{
	public static void main(String args[])
	{
		int n,x,r,sum=0;
		Scanner sc=new Scanner(System.in);;
		System.out.print("Enter a number:");
		n=sc.nextInt();
		x=n;
		while(x>=1)
		{
			r=x%10;
			sum=sum+(r*r*r);
			x=x/10;
		}
		if(n==sum)
			System.out.println(n+" is an armstrong number");
		else
			System.out.println(n+" is not not an armstrong number");
	}
}