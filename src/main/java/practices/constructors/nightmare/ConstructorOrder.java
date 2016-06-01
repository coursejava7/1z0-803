package practices.constructors.nightmare;

class BaseClass {
	
	static{	System.out.println("A: BaseClass static initializator block");}

	{System.out.println("B: BaseClass initializator block");}	
	
	BaseClass(){ System.out.println("C: BaseClass default constructor");}
	
	BaseClass(int x){ System.out.println("D: BaseClass overloaded constructor BaseClass(int x)");}
	
	static{	System.out.println("E: BaseClass 2nd static initializator block");}
	
	{System.out.println("F: BaseClass 2nd initializator block");}
}

public class ConstructorOrder extends BaseClass{
	
	static{ System.out.println("G: ConstructorOrder static initializator block");}
	
	{System.out.println("H: Constructor initializator block");}	
	
	ConstructorOrder() {
		{System.out.println("I: ConstructorOrder defaultConstructor");}
	}
	
	public static void main(String[] args){
		ConstructorOrder co = new ConstructorOrder();
	}
}