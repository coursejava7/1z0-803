package practices.constructors.nightmare;

class BaseClass {
	
	static{	System.out.println("A: BaseClass static initializator block");}
	{System.out.println("B: BaseClass initializator block");}	
	BaseClass(){this(10);System.out.println("C: BaseClass default constructor");}
	BaseClass(int x){ System.out.println("D: BaseClass overloaded constructor BaseClass(int x)");}
	static{	System.out.println("E: BaseClass 2nd static initializator block");}
	{System.out.println("F: BaseClass 2nd initializator block");}
}

public class SubClass extends BaseClass{
	
	static{ System.out.println("G: SubClass static initializator block");}
	{System.out.println("H: SubClass initializator block");}	
	SubClass() { this(10);	System.out.println("I: SubClass defaultConstructor");}
	SubClass(int x) { System.out.println("J: SubClass overloaded constructor SubClass(int x)");}
	
	public static void main(String[] args){
		SubClass co = new SubClass();
		System.out.println("---------------");
		SubClass co2 = new SubClass();
	}
}