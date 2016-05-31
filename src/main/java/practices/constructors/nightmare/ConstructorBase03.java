package practices.constructors.nightmare;

/*
 
 A constructor have to follow the next rules:
 
   - It has to be named equal as the class.
   - Can't include any kind of return (included void).
   - We can use access modifiers (default, public, protected, private) 

   - If we include a constructor the compiler won't include the implicit constructor.
   - Every object extends from java.lang.Object, so at the end of the class hierarchy, a call to super() (implicit or not) will be done.
    
*/

public class ConstructorBase03 {
	int x = 10;
	
	
	protected ConstructorBase03(int x){ // The compiler will add, in the first line, the call to super() of java.lang.Object.
		this.x = x;
		System.out.println("Hello from ConstructorBase03(int x)");
	}
}