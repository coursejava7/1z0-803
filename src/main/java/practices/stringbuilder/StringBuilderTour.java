package practices.stringbuilder;

public class StringBuilderTour {
	
	static void creatingStringBuilders(){
		
		StringBuilder str01 = new StringBuilder();
		StringBuilder str02 = new StringBuilder(15);
		StringBuilder str03 = new StringBuilder("java hero!");
		StringBuilder str04 = new StringBuilder(str03);
		
		System.out.println(str01 + ":" + str01.length() + ":" + str01.capacity());
		System.out.println(str02 + ":" + str02.length() + ":" + str02.capacity());
		System.out.println(str03 + ":" + str03.length() + ":" + str03.capacity());
		System.out.println(str04 + ":" + str04.length() + ":" + str04.capacity());
	}
	
	
	static void appendingThings(){
		
		StringBuilder str = new StringBuilder("Java ninja");
		str.append(" and")
			.append(" a ")
			.append("java")
			.append(7)
			.append(" hero!");
		System.out.println(str);
	}
	
	static void appendingObjects(){
		
		StringBuilder str = new StringBuilder("Java ninja");
		str.append(new MyObject(" and"))
		.append(new MyObject(" a "))
		.append(new MyObject("java"))
		.append(new MyObject("7"))
		.append(new MyObject(" hero!"));
		System.out.println(str);
	}

	static void insertingThings(){
		
		StringBuilder str = new StringBuilder("Java hero!")
		.insert(5, "ninja and a Java ")
		.insert(21, 7);
		System.out.println(str);
	}
	
	static void insertingThings2(){
		
		StringBuilder str = new StringBuilder("Java hero!")
		.insert(5, "ninja and a Java ", 0, 12);
		System.out.println(str);
	}	
	
	static void deletingAndReverse(){
		
		StringBuilder str = new StringBuilder("Java hero!")
		.insert(5, "ninja and a Java ", 0, 12)
		.delete(5, 17).reverse();
		System.out.println(str);
	}	
	
	static void replacing(int x, int y){
		
		StringBuilder str = new StringBuilder("Java hero!");
		str.replace(x, y, "ninja");
		System.out.println(str);
	}		
	
	static void subsequence(int x, int y){
		
		StringBuilder str = new StringBuilder("Java hero!");
		System.out.println("+" + str.subSequence(x, y)+ "+");
	}		

	
	
	public static void main(String[] args) {
		
		//creatingStringBuilders();
		//appendingThings();
		//appendingObjects();
		//insertingThings2();
		//deletingAndReverse();
		//replacing(5, 9);
		subsequence(5, 9);
	}
	
}

class MyObject {
	
	private final String myString;

	MyObject(String myString){ this.myString = myString; }
	
	public String toStringX(){
		String returned = new String(myString);
		return returned;
	}
	
	@Override
	public int hashCode() {
		return 16;
	}
	
}