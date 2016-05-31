package practices.constructors.nightmare;


/*
 * Basic class.
 * 
 * If we don't include a constructor, the compiler includes it of us.
 * So, this class has a default constructor.
 * 
 * The compiler will include the following code:
 * 
 *      Constructor01(){
 *        super();
 *      }
 * 
 */
public class Constructor01 extends ConstructorBase01 {

	public static void main(String[] args) {
		Constructor01 c = new Constructor01();
	}
}
