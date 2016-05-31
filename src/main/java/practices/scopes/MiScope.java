package practices.scopes;
/*
  This class demonstrates how works the different scopes, 
  shadowing.
  
  Scopes from longest to shortest:
    - static
    - instance
    - local
    - block
    
     Pay attention to the different rules regarding scopes and shadowing...
     
     - We can do shadowing between class scope and its nested method scopes.
     - we can do shadowing between class scope and its nested initialization code blocks scopes.
     - But, we cannot do shadowing between nested code blocks.
  
 */

public class MiScope {

	static int var2; //static variable
	int var = 10;  //instance variable
	
	{int var = 10; // initialization block code, here var is shadowing the instance variable named var. 
		while(var > 0) {
			var2 *= var--;
			//MiScope.var2 *= var--;  //Other valid way to use static variable (recommended)
		}
	}
	
	static { // static initializer block.
		var2 += 10;
	}
	
	
	void method(int var){ //var is local scope to the method. Another shadowing example.
		
		var = var; // This is useless... We are copying over the same variable. So, see the next code line...
		 //We need to referencing the instance variable from this scope so, due to the shadowing effect of the local variable; we use the keyword this.
		this.var = var;
		
		//for(int var; var < 10; var++); // ERROR!!! we are using the same name (var) within the same scope (regarding to local variable var).. 
		while (true){
			//String var = "hello"; // Again, it can't be possible. we are using the same variable name whitin the same scope. 
			break;
		}
	}
	
	void method2(int var) {
		
		{int x = 10; var2 +=x;}
		{int x = 20; var2 +=x;} //No problem, the variable x is in a sibling scope regarding the previous scope.
	}
}
