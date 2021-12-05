import java .util.*;

public class Main {

	public static void main(String[] args) {	   Scanner obj = new Scanner(System.in);

	    System.out.println("Enter the Number:");

	    int n = obj.nextInt(); 

	    int a[ ][ ] = new int[n][n];

	    System.out.println("Enter the Elements:"); 

	    int i,j;

	   for( i=0;i<n;i++)

	   {

	       for(j=0;j<n;j++)

	    {

	    	a[i][j]= obj.nextInt();

	    }

	   }

	    int max=a[0][0];

	    System.out.println("The Matrix is :");

	    for( i=0;i<n;i++)

	   {

	       for(j=0;j<n;j++)

	    {

	    	 System.out.print(a[i][j]);

	    	  System.out.print("  ");	 

	    }

	     System.out.print("\n");

	   }

	   int s=0;

	   for(i=0;i<n;i++)

	   {   

	       for(j=0;j<n;j++)	          

	    	if(i==j)

	   	{

	   		s=s+a[i][j];

	   	}

	    }

	   System.out.print("The trace is: "+s);	

	}

}
