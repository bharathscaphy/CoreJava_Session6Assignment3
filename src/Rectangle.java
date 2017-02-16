public class Rectangle implements Shape {
	double l,b;
	public Rectangle()
	{
		l=1;
		b=1;
	}
	public Rectangle(double l,double b)
	{
		this.l = l;
		this.b = b;
	}
	public double getArea()
	{
		return l*b;
	}
	public void draw()
	{
		System.out.println("In Draw Rectangle");
	}
}
