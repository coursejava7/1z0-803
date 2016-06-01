package practices.methods.overloading;

/*
  Overloading through class hierarchy 
 */
public class Overload02 extends Overload01 {

	public void method(String str, long myLong){
		System.out.println("Hello from overload02.method(String str, long myLong)");
	}
	
	public void method(String str){ //This is an overriding... Not an overloading
		System.out.println("Hello from overload02.method(String str)");
	}
	
	public static void main(String[] args){
		
		Overload02 o2 = new Overload02();
		o2.method("hello");
		o2.method("Hola", 10l);
		
		Overload01 overload1 = new Overload01();
		Overload01 otherOverload1 = new Overload02();
		
		overload1.method("Hello");
		otherOverload1.method("Hello");
	}
}