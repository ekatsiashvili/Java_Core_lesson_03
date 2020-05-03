package ua.lviv.lgs;

public class Rectangle {

	private int length;
	private int width;

	Rectangle() {
		this.length = length;
		this.width = width;

	}

	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;

	}

	public int getArea() {
		return width * length;
	}

	public int getPerimetr() {
		return (width + length) * 2;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
