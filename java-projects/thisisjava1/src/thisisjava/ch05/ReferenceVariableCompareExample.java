package thisisjava.ch05;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		
		int[] arr1 = new int[] {1,2,3};
		int[] arr2 = new int[] {1,2,3};
		int[] arr3 = arr2;
		
		System.out.println(arr1 == arr2); 
		System.out.println(arr1.equals(arr2));
		
		//arr1이 가지는 주소와 arr2가 가진 주소는 다르다
		//arr1[1] 이렇게 세분화 해줘야한다
		
		System.out.println(arr1[1] == arr2[1]);
		System.out.println(arr2 == arr3);
		

	}

}
