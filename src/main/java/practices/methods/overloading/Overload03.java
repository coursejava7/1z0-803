package practices.methods.overloading;

public class Overload03 {
	
	public static void method(String str) {
		System.out.println("hello from method(String str)");

	}
	
	public static void method(Object str) {
		System.out.println("hello from method(Object str)");
	}
	
	public static void main(String[] args) {
		method("hello");
		method(new Integer(10));
		
		
	}

}
