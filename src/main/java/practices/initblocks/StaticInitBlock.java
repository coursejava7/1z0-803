package practices.initblocks;

import java.util.Calendar;

/**
 * This class demonstrates when to use an static init block.
 * In the case we need to initialize a static final variable (constant).
 * THis kind of variables cannot be initialized from a constructor. So we need
 * to implement a static init block to do this task.
 *
 */
public class StaticInitBlock {
	
	private static final int x; //This is a constant only can be initialized either in line or in a constructor.

	static {
		
		if(Calendar.getInstance().get(Calendar.DAY_OF_MONTH) > 15){
			x = 1;
		} else {
			x = 0;
		}
	}

	StaticInitBlock() {
		super();
		
		System.out.println("constructing an InitBlock ");
		doSomething(10);
	}
	
	protected void doSomething(int x) {
		System.out.println("doing something overloaded..." + x + " " + this.x);
	}
}