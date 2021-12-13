class Rectangledemo

{

	public static void main(String args[])	{

		Rectangle r1 = new Rectangle(10,20);

		Rectangle r3 = r1.areamethod(r1);

		System.out.println("area= "+r3.area);

	}

}

class Rectangle

{

	int length;

	int width;

	int area;

	Rectangle(int m,int n)

	{

		length=m;

		width=n;

	}

	Rectangle areamethod(Rectangle r2)

	{

		area=r2.length*r2.width;

		return(r2);

	}

}
