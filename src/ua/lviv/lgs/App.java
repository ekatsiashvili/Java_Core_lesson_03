package ua.lviv.lgs;

public class App {

	public static void main(String[] args) {

		Rectangle a1 = new Rectangle();
		a1.setLength(40);
		a1.setWidth(70);

		Rectangle a2 = new Rectangle(12,10); 

		Circle a3 = new Circle(10.9,40.57);

		System.out.println("����� ������������ = "+a1.getArea());
		System.out.println("����� ������������ = " + a2.getArea());
		System.out.println("\n"+"�������� ������������ = " + a1.getPerimetr());
		System.out.println("�������� ������������ = " + a2.getPerimetr());
		System.out.println("\n"+"\n"+"����� ���� = " + a3.getDiametr());
		System.out.println("������� ���� = " + a3.getRadius());
	
	}

}
