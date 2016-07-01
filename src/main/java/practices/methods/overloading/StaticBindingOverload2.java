package practices.methods.overloading;

public class StaticBindingOverload2 {
	
	public static void method(int... num) {
		System.out.println("hello from method(int... num)");
	}
	
	public static void method(int num1, int num2, int... num3) {
		System.out.println("hello from method(int num1, int num2, int... num3)");
	}		
	
	public static void method(int num1, int num2) {
		System.out.println("hello from method(int num1, int num2)");
	}	

	public static void method(int num) {
		System.out.println("hello from method(int num)");
	}
	
	public static void method(Integer num) {
		System.out.println("hello from method(Integer num)");
	}
	
	public static void method(float f) {
		System.out.println("hello from method(float f)");
	}
	
	public static void method(Float f) {
		System.out.println("hello from method(Float f)");
	}	
	
	public static void method(Object str) {
		System.out.println("hello from method(Object str)");
	}
	
	public static void main(String[] args) {
		method();
		method(10);
		method(10,10);
		method(10,10,10);
		method(10.20);
	}
}