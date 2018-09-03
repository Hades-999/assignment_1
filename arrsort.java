class arrsort
{
	public static void main(String args[])
	{
		int a[]={1,1,1,1,0,0,1,0};
		int i,j,s;
		System.out.print("Array before sorting: ");
		for(i=0;i<8;i++)
			System.out.print(a[i]+" ");
		for(i=0;i<8;i++)
		{
			for(j=i;j>0;j--)
			{
				if(a[j]<a[j-1])
				{
					s=a[j];
					a[j]=a[j-1];
					a[j-1]=s;
				}
			}
		}
		System.out.print("Array after sorting: ");
		for(i=0;i<8;i++)
			System.out.print(a[i]+" ");
	}
}