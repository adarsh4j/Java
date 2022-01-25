public class Testsleepmethod2 extends Thread{

	public void run()	{

		

		for(int i=1;i<5;i++)

		{

			try{

				Thread.sleep(800);

			}

			catch(Exception e){ System.out.println(e);}

			System.out.println(i);

			

		}

	}

public static void main(String[] args) {

		Testsleepmethod2 t1 = new Testsleepmethod2();

			Testsleepmethod2 t2 = new Testsleepmethod2();

			t1.start();

			t2.start();

		

	}

}
