public class Circle implements Shape{
	double r;
	public Circle()
	{
		r=1;
	}
	public Circle(double r)
	{
		this.r = r;
	}
	public double getArea()
	{
		return 3.14*r*r;
	}
	public void draw()
	{
		System.out.println("In Draw Circle");
	} 
}
