package practices.casting;

/*
 In this class we are going to demonstrate when to use the REFERENCE TYPE CASTING
 and the concept of target object type
 
 We have the following hierarchy of classes  
 
 Programmer IS-A Employee IS-A Human ->  Programmer IS-A Human too!!!
  
 */
public class MyCastingExample {
	
	public static void downCastingEmployeeToBeProgrammer(){
		
		/*
		 *    First of all some concepts:
		 *    
		 *    The reference type in this example is Employee and
		 *    the object type is Programmer.
		 *    
		 *    We are going to cast the reference type from Employee to a more specialized class to allow coding the
		 *    behavior of the specialized class.
		 *    
		 *    In REFERENCE CASTING  'target type'  means the current reference variable TYPE. 
		 */
		
		Employee employee = new Programmer(); //Reference variable type is Employee.
		((Programmer)employee).doSomethingAsProgrammer(); //Doing a reference type casting to downcast the reference type from Employee to Programmer. Now we can call doSomethingAsProgrammer method owned by Programmer class.
	
		/*
		 * Summarizing.
		 * The target type = the reference type.
		 * The target type must be the object type or a valid super type regarding the cast type.
	     */
	}
	
		/*
		 *	Up casting occurs when we are forcing a reference type to be a parent class.
		 *	
		 *	In this example we are going to force the programmer reference variable to be an Employee type (upwards the hierarchy tree).
		 *	It can seems a bit weird... Programmer IS-A Employee and for this reason it might have the behavior of an Employee but... 
		 *	
		 *	Take a look at the Employee class, it has a private method. 
		 *	So, the purpose of this action is to be able to execute a method that it hasn't inherited so we have to up-casting the reference variable.
		 */
		public static void upCastingEmployeeToBeProgrammer(){
		
		Programmer programmer  = new Programmer(); //Reference variable type is Programmer.
		((Employee)programmer).doSomethingPrivateAsEmployee(); //Doing a reference type casting to up cast the reference type from Programmer to Employee.

	}	
	
	public static void main(String[] args){
		downCastingEmployeeToBeProgrammer();
		upCastingEmployeeToBeProgrammer();
	}
}

abstract interface Human {}  // Only to create a Human Type... 

class Employee implements Human{ //Employee class IS-A Human
	
	public void doSomethingAsEmployee(){
		System.out.println("I'm an employee too! So, let's do some employee task");
	}
	
	public void doSomethingPrivateAsEmployee(){
		System.out.println("I'm an Employee and I need to do private things!!!");
	}
}

class Programmer extends Employee{ //Programmer class IS-A Employee
	
	public void doSomethingAsProgrammer() {
		System.out.println("I'm a ninja programmer! So, let's to do clean code!!!");
	}
}