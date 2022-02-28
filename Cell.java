import java.util.*;

import java.io.*;

class Cell 

{

	public static void main(String args[])    { 

	Matrix m = new Matrix();

	m.start();

    }

}

class Matrix extends Thread{

    public void run(){

	Scanner obj = new Scanner(System.in);

	System.out.println("Enter the row:");

	int n = obj.nextInt();

	System.out.println("Enter the column:");

	int m = obj.nextInt();

	int a[][]=new int[n][m];

	System.out.println("Enter the element");

	for(int i=0;i<n;i++)

	{

	  for(int j=0;j<m;j++)

	  {

	  	a[i][j]=obj.nextInt();

	  }

	}

	System.out.println("The Matrix A is");

	for(int i=0;i<n;i++)

	{

	  for(int j=0;j<m;j++)

	  {

	  	System.out.print(a[i][j]+"   ");

	  	

	  }

	  System.out.println();

	}

	System.out.println("Enter the row:");

	int s = obj.nextInt();

	System.out.println("Enter the column:");

	int q = obj.nextInt();

	int b[][]=new int[s][q];

	System.out.println("Enter the element");

	for(int i=0;i<s;i++)

	{

	  for(int j=0;j<q;j++)

	  {

	  	a[i][j]=obj.nextInt();

	  }

	}

	System.out.println("The Matrix B is ");

	for(int i=0;i<s;i++)

	{

	  for(int j=0;j<q;j++)

	  {

	  	System.out.print(a[i][j]+"  ");

	  }

	  System.out.println();

	}

	int large=a[0][0];

	for(int i=0;i<n;i++)

	{

	  for(int j=0;j<m;j++)

	  {

	      if(a[i][j]>large)

	      {

	         large=a[i][j];

	         break;

	      }

	         

	  }

	}

	int larges=a[0][0];

	for(int i=0;i<s;i++)

	{

	  for(int j=0;j<q;j++)

	  {

	      if(a[i][j]>larges)

	      {

	         larges=a[i][j];

	         break;

	      }

	         

	  }

	}

	if(large>larges)

	   System.out.println("The cell of two matrix is "+large);

	else

	   System.out.println("The cell of two matrix is "+larges);

}

}
