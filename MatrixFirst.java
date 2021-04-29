import java.util.Scanner;

class MatricFirst
{
	static int[][] getResult(int arr[][], int n)
	{
		boolean rowmat[] = new boolean[n];
		boolean colmat[] = new boolean[n];
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(arr[i][j] == 0)
				{
					rowmat[i] = true;
					colmat[j] = true;
				}
			}
		}

		for(int i = 0; i < n; i++)
		{
			if(rowmat[i])
			for(int j = 0; j < n; j++)
			{
				arr[i][j] = 0;
			}
		}

		for(int i = 0; i < n; i++)
		{
			if(colmat[i])
			for(int j = 0; j < n; j++)
			{
				arr[j][i] = 0;
			}
		}
		return arr;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the dimensions of matrix:");
		int n = sc.nextInt();
		int mat[][] = new int[n][n];
		System.out.println("Enter the element in matrix:");
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		int res[][] = getResult(mat, n);

		System.out.println("The result of the matric is:");
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(mat[i][j] + "  ");
			}
			System.out.println();
		}
	}
}