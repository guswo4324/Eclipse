package thisisjava.ch06.exam09;

public class Television {
	//static
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
	}
}
