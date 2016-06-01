package practices.methods.overloading;

public class StaticOverloader {
	
	private void method(String str)  {
		System.out.println("Hello from method(String str)");
	}
	
	public void method(String str, int x){
		System.out.println("Hello from method(String str)");
	}
	
	public void method(Integer number)  {
		System.out.println("Hello from method(Integer number)");
	}	
	
	public void method(Long number)  {
		System.out.println("Hello from method(Object number)");
	}		
	
	public static void main(String[] args) {
		
		Object obj = new Integer(10);
		
		StaticOverloader sbo = new StaticOverloader();

		sbo.method("hola");
		sbo.method(10);
		sbo.method(10l);
		// sbo.method(obj); //Won't compile!!! 
		
	}
}