package practices.constructors.nightmare;


/*
 * ConstructorBase02 don't include an implicit constructor (default)
 * so, we need to include a constructor that matches one of the constructors
 * of the base class.And we need to include the super call matching 
 * the same parameters.
 * 
 * The first line of every constructor has to be:
 * 
 *    this() or super(). Choose one of them!!! 
 *    If not included, the compiler will do it for us.
 * 
 */
public class Constructor02 extends ConstructorBase02 {
	
	// We cannot do it because implicit constructor doesn't exist in ConstructorBase02 class
	/*
	Constructor02(){
		super();
	}
	*/
	
	Constructor02(int x){
		super(x);
	}
	
	public static void main(String[] args) {
		Constructor02 c = new Constructor02(10);
	}
}
