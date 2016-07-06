package practices.initblocks;

public class InitBlockStackOverFlow {
	
	{
		doSomething(10);// no problem we can invoke instance methods from init blocks
		doSomething(); // no problem yet. Static methods can be invoked due that the static context was loaded before.
		
		/* Runtime exception.... Before the constructor the init block is executed... 
		   And the init block invokes the constructor again... So this call loop will exhaust the call stack memory.
		*/ 
		new InitBlockStackOverFlow(); 
	}
	
	InitBlockStackOverFlow(){
		System.out.println("constructing with non-parameters constructor...");
	}
	
	public void doSomething(){
		System.out.println("doing something...");
	}
	
	public static void doSomething(int x){
		System.out.println("doing something statically...");
	}
	
	public static void main(String[] args){
		
		InitBlockStackOverFlow ib = new InitBlockStackOverFlow();
		
	}

}
