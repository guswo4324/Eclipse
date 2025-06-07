package thisisjava.ch06.exam06;

public class Calculator {
	
	int width;
	int height;
	
	String areaRectangle(int width) {
		this.width = width;
		return "정사각형의 넓이는 " + (this.width * this.width) + "입니다";
	}
	
	String areaRectangle(int width, int height) {
		this.width = width;
		this.height = height;
		return "직사각형의 넓이는 " + (width * height) + "입니다";
	}

}
