package practices.methods.overloading;

public class StaticBindingOverload {
	
	public static void method(Integer num) {
		System.out.println("hello from method(Integer num)");
	}
	
	public static void method(Object str) {
		System.out.println("hello from method(Object str)");
	}
	
	public static void main(String[] args) {
		Object num = new Integer(10);
		method(num);
	}
}