public class Mythread {
    public static void main(String[] args) {
       Sum r2 = new Sum();
       Thread t2 = new Thread(r2); 
        Factorial r1 = new Factorial();
        Thread t1 = new Thread(r1);    
        t2.start();
        t1.start();
       
    }
}
class Sum implements Runnable{
    public void run(){
        int sum=0;
        for(int i=0;i<=5;i++) {
            sum=sum+i;
        }
         System.out.println("The sum of first 5 number is "+sum);
    }
}
class Factorial implements Runnable{
    public void run(){
        int fact=1;
        for(int i=1;i<=5;i++) {
           fact=fact*i;
        }
           System.out.println("The factorial of 5 number is "+fact);
    }
}
