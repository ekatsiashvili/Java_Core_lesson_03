package ua.lviv.lgs;

public class Circle {
	private double radius;
	private double diametr;

	Circle(double radius, double diametr) {
		this.radius = radius;
		this.diametr = diametr;
	}

	public double getDiametr() {
		return Math.PI * (diametr * diametr);
	}

	public double getRadius() {
		return Math.PI * 2 * radius;
	}

}
