package practices.casting;

public class VarArgsCasting {

	public static void method(int... numbers) {
		System.out.println("hello from method(int... numbers)");
	}

	public static void method(Integer... numbers) {
		System.out.println("hello from method(Integer... numbers)");
	}
	
	public static void method(Object... objects) {
		
		for(Object obj : objects){
			if (obj instanceof String) {
				String string = (String) obj;
				System.out.println(string);
			} else {
				System.out.println("hello from method(Object... objects)");				
			}
		}
	}	

	public static void main(String[] args) {
		
		Object[] numbers = new Object[2];
		String[] strings = {"Java6", "Java7"};
		
		numbers[0] = new Integer(10);
		numbers[1] = new Integer(15);

		method(new Integer[] { 10, 12, 13, 14 });
		
		//method((Integer[])numbers); //Problem ClassCastException at Runtime !!! Trying to do a down casting from Object o Integer (the cast type).
		
		method(strings); // we need to cast to Object[] because String[] doesn't match exactly object[], this code compiles without any problem. 
		
		method((Object[]) strings); //To avoid the above inexact matching.
		method(strings[0], strings[1]); //To avoid the above inexact matching.
	}
}
