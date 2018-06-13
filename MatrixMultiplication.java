class MatrixMultiplication
{
	public static void main(String args[])
	{
		int arr1[][]={{2,5},{3,4}};
		int arr2[][]={{9,6},{4,1}};
		int arr[][]=new int[2][2];
		int x=arr1.length;
		System.out.println("Matrix 1: ");
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print(" "+arr1[i][j]);
			}
			System.out.println();
		}
		System.out.println("Matrix 1: ");
		int y=arr2.length;
		for(int i=0;i<y;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				System.out.print(" "+arr2[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				for(int k=0;k<y;k++)
				{
					arr[i][j] += arr1[i][k]*arr2[k][j];
				}
			}
		}
		System.out.println("Product of the matrices: ");
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	}
}
		
		
