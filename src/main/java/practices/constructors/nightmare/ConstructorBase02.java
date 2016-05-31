package practices.constructors.nightmare;

/*
 
 A constructor have to follow the next rules:
 
   - It has to be named equal as the class.
   - Can't include any kind of return (included void).
   - We can use access modifiers (default, public, protected, private) 

   - If we include a constructor the compiler won't include the implicit constructor.
    
*/

public class ConstructorBase02 extends ConstructorBase01 {
	int x = 10;
	
	
	ConstructorBase02(int x){
		this.x = x;
	}
}