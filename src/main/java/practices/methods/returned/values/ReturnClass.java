package practices.methods.returned.values;

class BaseClass {
	
	public void doSomething() {
		System.out.println("Hello from BaseClass.doSomething method");
	}
}

class ChildClass extends BaseClass{
	
	public void doSomething() {
		System.out.println("Hello from ChildClass.doSomething method");
	}
}

public class ReturnClass extends BaseClass{
	
	public BaseClass miMethod(BaseClass clazz){
		clazz.doSomething();
		return this;
	}
	
	public static void main(String[] args){
		
		ReturnClass rc = new ReturnClass();
		BaseClass bc = new BaseClass();
		rc.miMethod(rc);
		rc.miMethod(bc);
	}
}