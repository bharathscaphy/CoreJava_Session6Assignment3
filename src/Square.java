public class Square implements Shape{
	double l;
	public Square()
	{
		l=1;
	}
	public Square(double l)
	{
		this.l = l;
	}
	public double getArea()
	{
		return l*l;
	}
	public void draw()
	{
		System.out.println("In Draw Square");
	}
}
