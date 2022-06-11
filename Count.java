import java.util.*;

public class Count

{

  public static void main(String[] args) {

      Scanner sc= new Scanner(System.in);

       System.out.println("Enter the number of array element");

        int n = sc.nextInt();

          System.out.println("Enter the sum of array element");

        int k = sc.nextInt();

        int[] a = new int[n];

         System.out.println("Enter the array element");

        for(int i=0;i<n;i++){

            a[i] = sc.nextInt();

        }

        int ans=0;

        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){

                if(a[i]+a[j]==k){

                    ans++;

                }

            }

        }

    System.out.println("Number of pairs with the given sum are: "+ans);

  }

}
