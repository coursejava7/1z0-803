package practices.strings;

public class StringConcatExample {
	
	
	public static void main(String[] args) {
		
		String a = "Java7";
		String b = "Java";
		
		b = b + "7";
		String d = "Java" + "7";
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		System.out.println(a == d);
		System.out.println(a.equals(d));
	}

}
