package practices.constructors.nightmare;

/*
 Constructors can be overloaded
*/ 
public class Constructor03 extends ConstructorBase03 {
	
	//public Constructor03() {} // we need an implicit constructor or implemented in the class or accessible through class hierarchy tree.

	private Constructor03() {
		super(10);
		System.out.println("Hello from Constructor03()");
	}
	
	Constructor03(int x){
		this();
		System.out.println("Hello from Constructor03(int x)");
	}
	
	Constructor03(long x){
		this((int)x);
		System.out.println("Hello from Constructor03(long x)");
	}

	public static void main(String[] args) {
		Constructor03 c = new Constructor03(15L);
	}
}