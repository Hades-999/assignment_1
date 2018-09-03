import java.util.*;
class arrsearch
{
	public static void main(String args[])
	{
		int a[]={1,4,6,7,8,9,10};
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number you want to search:");
		n=sc.nextInt();
		if(n<a[a.length/2])
		{
			for(i=0;i<a.length/2;i++)
			{
				if(n==a[i])
					System.out.println("The index of "+n+"="+i);
			}
		}
		else if(n>=a[a.length/2]&&n<=a[a.length-1])
		{
			for(i=a.length/2;i<a.length;i++)
			{
				if(n==a[i])
					System.out.println("The index of "+n+"="+i);
			}
		}
		else 
			System.out.println("Number does not exist in the array");
	}
}