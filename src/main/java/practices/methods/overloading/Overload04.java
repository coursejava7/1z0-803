package practices.methods.overloading;

public class Overload04 {
	
	public static void method(Integer num) {
		System.out.println("hello from method(Integer num)");

	}
	
	public static void method(Object str) {
		System.out.println("hello from method(Object str)");
	}
	
	public static void main(String[] args) {
		method("hello");
		method(new Integer(10));
	}
}