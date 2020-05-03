package ua.lviv.lgs;

public class App {

	public static void main(String[] args) {

		Rectangle a1 = new Rectangle();
		a1.setLength(40);
		a1.setWidth(70);

		Rectangle a2 = new Rectangle(12, 10);

		Circle a3 = new Circle(10.9, 40.57);

		System.out.println("Rectangle area = " + a1.getArea());
		System.out.println("Rectangle area = " + a2.getArea());
		System.out.println("\n" + "Rectangle perimeter = " + a1.getPerimetr());
		System.out.println("Rectangle perimeter = " + a2.getPerimetr());
		System.out.println("\n" + "\n" + "Area of a circle = " + a3.getDiametr());
		System.out.println("Circle diameter = " + a3.getRadius());

	}

}
