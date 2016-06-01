package practices.methods.overloading;

public class Overload05 {
	
	public static void method(Integer num) {
		System.out.println("hello from method(Integer num)");

	}
	
	public static void method(Object str) {
		System.out.println("hello from method(Object str)");
	}
	
	public static void main(String[] args) {
		Integer num = new Integer(10);
		Object num2 = new Integer(12);
		
		method(num);
		method(num2);
		
	}
}