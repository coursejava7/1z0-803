package practices.constructors.nightmare;

/*
 
 A constructor have to follow the next rules:
 
   - It has to be named equal as the class.
   - Can't include any kind of return (included void).
   - We can use access modifiers (default, public, protected, private) 

*/

public class ConstructorBase01 {
	
	int x = 10;

	protected ConstructorBase01() {
		System.out.println("Executing constructorBase");
		ConstructorBase(); // We are calling a regular method. We NEVER can invoke a real constructor this way!!!
	}
	
	void ConstructorBase(){
		System.out.println("This is a regular method, not a real constructor!!!!");
	}
	
	private ConstructorBase01(int x){ // We can use access modifiers. This constructor can't be used from outside this class.
		this.x = x;
	}
	
}