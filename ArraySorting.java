class ArraySorting
{
	public static void main(String args[])
	{
		int rank[]={7,5,9,13,2,6};
		int temp,n;
		n=rank.length;
		System.out.println("The ranks are: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(rank[i]+" ");
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(rank[i]>rank[j])
				{
					temp=rank[i];
					rank[i]=rank[j];
					rank[j]=temp;
				}
			}	
		}
		System.out.println("The ranks in ascending order: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(rank[i]+" ");
		}
	}
}