package practices.casting;

public class PrimitiveCasting {
	
	public static void main(String[] args){
		
		byte s = 10; // the literal is an integer type but the value (10) is into the limits of a byte type allowed values so, no problem.
		byte s2 = (byte)129; // The literal is out of limits a byte type allowed values so we need to do an explicit casting.
		
		System.out.println(s2); // 128 value expected? But it prints -127... Forcing a cast could bring out some problems...
		
		int i = s; // Implicit casting when trying to force a variable to be a bigger type.
		int i2 = (int)s; // Explicit casting and redundant.
		
		byte b = (byte)(s + s2); //We need to cast because an expression with the addiction operators (+ - * /)  and literals with minor types than integer ever the result is an integer type value.
		int i3 = s + s2; // No problem, the expression assign the result to an integer variable.
		
		float f = 10.50f; // We need to add the f letter at the end to tell to the compiler that this literal is not a double but a float value.
		float f2 = 10.50f;
		f = (f + f2); //when an expression is using float literals the result is a float value.
		
		System.out.println(f);		
		
		double d =  10.50; 
		double d2 = 10.50;
		
		double d3 = (d + d2); // The same than explained above about float variables.
	}
}


