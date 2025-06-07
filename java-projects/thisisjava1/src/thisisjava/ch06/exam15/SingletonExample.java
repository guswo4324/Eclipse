package thisisjava.ch06.exam15;

public class SingletonExample {

	public static void main(String[] args) {
		/*
		 singleton obj1 = new Singleton(); //컴파일에러
		 singleton obj2 = new Singleton();
		 */
		
        //정적 메소드를 호출해서 싱글톤 객체 얻
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        
        //동일한 객체를 참조하는지 확인
        if(obj1 == obj2) {
            System.out.println("\n같은 Singleton 객체 입니다.");
        } else {
            System.out.println("\n다른 Singleton 객체 입니다.");
        }

        //obj1.setCount();
        //obj2.setCount();
        System.out.println(obj1.getCount()+":"+obj2.getCount());
        
        obj1.setCount();
        System.out.println(obj1.getCount()+":"+obj2.getCount());
        obj2.setCount();
        System.out.println(obj1.getCount()+":"+obj2.getCount());
		
	}

}

