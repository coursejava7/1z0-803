package practices.initblocks;

import java.io.IOException;


/**
 * This class demonstrate the risk of executinf an init block calling a child implementation of an abstract method.
 * Due that the init block is executed before the constructor could occur that some variable still remain uninitialized
 * when the method is execute as this code shows. 
 */
abstract class Base {
	
	{
		try{
			doSomething(10); // calling the child implemented method!!! 
		} finally {
			System.out.println("Error");
		}
	}
	
	public Base() throws IOException {
		super();
	}
	
	abstract void doSomething(int x) throws IOException;
	
	public static void main(String[] args) throws Exception {
		InitBlock ib = new InitBlock();
	}
}

public class InitBlock extends Base {
	
	private final int x; // This variable is initialized BEFORE the init block is executed.
	
	
	InitBlock() throws IOException {
		super();
		System.out.println("constructing an InitBlock ");
		x = 10;
		doSomething(10);
	}
	
	protected void doSomething(int x) throws IOException{
		System.out.println("doing something overloaded..." + x + " " + this.x); // THis method is called from the init block but the instance member variable this.x is not initialized yet.
		throw new IOException("ERROR FROM doSomething(int x) ...");
	}
}