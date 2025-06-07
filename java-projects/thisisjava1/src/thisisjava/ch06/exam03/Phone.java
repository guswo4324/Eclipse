package thisisjava.ch06.exam03;

public class Phone {
	String brand;
	int series;
	String color = "검은색";
	
	Phone(String brand){
		//Phone(String brand, int series, String color) -> 밑에서 끌어다 올려쓴거
		this("아이폰", 10, "검은색"); 
	}
	Phone(String brand, int series){
		this.brand = "아이폰";
		this.series = 11;
	}

	Phone(String brand, int series, String color){
		this.brand = "아이폰";
		this.series = 13;
		this.color = color;
	}
}
