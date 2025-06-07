package thisisjava.ch06.exam03;

public class PhoneExample {

	public static void main(String[] args) {
		Phone phone1 = new Phone("아이폰");
		System.out.println("phone1 brand : "+phone1.brand);
		System.out.println("phone1 series : "+phone1.series);
		System.out.println("phone1 color : "+phone1.color);
		System.out.println("");
		
		Phone phone2 = new Phone("아이폰", 11);
		System.out.println("phone2 brand : "+phone2.brand);
		System.out.println("phone2 series : "+phone2.series);
		System.out.println("phone2 color : "+phone2.color);
		System.out.println("");
		
		Phone phone4 = new Phone("아이폰 프로", 13, "파랑");
		System.out.println("phone4 brand : "+phone4.brand);
		System.out.println("phone4 series : "+phone4.series);
		System.out.println("phone4 color : "+phone4.color);

	}

}
