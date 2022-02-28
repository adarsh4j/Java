public class Prime{

	public static void main(String[] args) {		int i,a=23,f=0;

		for(i=2;i<(a/2);i++)

		{

		if(a%i==0)

		{

			f=1;

			break;

		}

		}

		if(f==0)	

		System.out.println("The number is prime");

		else

		{

			System.out.println("The number is not prime");

		}

		

	}

}
