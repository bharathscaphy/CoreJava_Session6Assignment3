import java.util.Scanner;
public class ShapeInterface {

	public static void main(String[] args) {
		double x,y,res;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Rectangle");
		System.out.println("Enter Length:");
		x=sc.nextDouble();
		System.out.println("Enter Breadth:");
		y=sc.nextDouble();
		Shape s1=new Rectangle(x,y);
		res = s1.getArea();
		System.out.println("Area of Rectangle : "+res);
		System.out.println("Shape of Rectangle");
		s1.draw();
		System.out.println();
		
		System.out.println("Circle");
		System.out.println("Enter Radius");
		x=sc.nextDouble();
		Shape s2=new Circle(x);
		res = s2.getArea();
		System.out.println("Area of Circle : "+res);
		System.out.println("Shape of Circle");
		s2.draw();
		System.out.println();

	}

}
