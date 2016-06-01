package practices.methods.overloading;

/*
  An overloaded is a when a class has two or more methods with the same name and... 
  
     - Different parameters (number and / or type and / or sequence)
     - A method which only changes the return type and / or the modifiers is not doing an overloading. It won't compile!!! 

*/
public class Overload01 {
	
	String str;
	
	public void method(String str){
		this.str = str;
		System.out.println("Hello from overload01.method(String str)" + str);
	}
	
	public void method(String str, String str2){
		method(str);
		System.out.println(str2);
	}
	
	protected void method(String str, int x){
		method(str, str);
		System.out.println(x);
	}
	
	public int method(int x, String str){
		
		method(str, str);
		System.out.println(++x);
		
		return x;
	}	
	
	/*
	protected void method(String str){ // It won't compile. It's just a duplicate method.
		System.out.println(str += str);
	}

	
	public int method(String str){ // It won't compile. It's just a duplicate method.
		System.out.println(str += str);
	}
	
	
	protected int method(String str){ // It won't compile. It's just a duplicate method.
		System.out.println(str += str);
	}
	*/
}