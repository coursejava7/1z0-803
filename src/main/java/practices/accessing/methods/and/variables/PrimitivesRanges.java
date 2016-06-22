package practices.accessing.methods.and.variables;


/**
 * 
 * This class demonstrate how works a static execution.
 * The main method is empty but, the static initializator block 
 * will be executed when the class loader loads the class.
 * 
 * Remember the golden rule:
 *  from static context we cannot access directly to anything
 *  in the instance context.
 * 
 * @author blesa
 *
 */
public class PrimitivesRanges {
	
	int x = 0; // this is an instance variable so we cannot access it from any static member (included main method) 
	static byte b = -128;
	static int i = b;

	static {
		b = (byte) i; // no problem to access b and i variables due that both are static.
	    System.out.println(i+" "+b);
	    
		System.out.println(Byte.MAX_VALUE + "->" + Byte.MIN_VALUE);
		System.out.println(Short.MAX_VALUE + "->" + Short.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE + "->" + Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE + "->" + Long.MIN_VALUE);
		System.out.println(Float.MAX_VALUE + "->" + Float.MIN_VALUE);
		System.out.println(Double.MAX_VALUE + "->" + Double.MIN_VALUE);
	}
	
	public static void main(String[] args){}
}