package practices.strings;

public class StringExample {
	
	
	public static void main(String[] args){
		
		String str1 = "Java";
		String str2 = "Java";
		
		System.out.println(str1 == str2);
		System.out.println(str1 == new String("Java"));
		System.out.println(new String("Java") == new String("Java"));
		
	}
	

}
