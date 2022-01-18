public class Main {

import java.util.*;

class matrace

{

	public static void main(String[] arg)	{

    mat e = new mat();

    e.matt();

    }

}

class mat

{

void matt()

    {

Scanner sc = new Scanner(System.in);

System.out.println("Enter the number");

		int n = sc.nextInt();

		int[][] a = new int[n][n];

		int i,j;

		System.out.println("Enter the elements : ");

		for(i=0; i<n; i++)

		{

			for( j=0; j<n ; j++)

			{

				a[i][j] = sc.nextInt();

			}

		}

		int sum = 0;

		for(i=0; i<n; i++)

		{

			for( j=0; j<n ; j++)

			{

				if(i==j)

				{

					sum = sum + a[i][j];

				}

			}

		}

		System.out.println("The trace is : "+ sum);

	}
