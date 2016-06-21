package practices.strings;


public class StringMethodsTour {
	
	static String str = "java ninja";
	
	static void charAt(){
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length()));		
	}
	
	static void indexOf(){
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf(97));
		System.out.println(str.indexOf("ninja"));
	}
	
	static void substring(){
		System.out.println(str.substring(5));
		System.out.println(str.substring(2,3));
	}
	
	static void replace(){
		System.out.println(str.replace('a', 'A'));
		System.out.println(str.replace("ninja","hero"));
		System.out.println(str);
	}
	
	static void lenghtAndOthers() {
		System.out.println(str.length());
		System.out.println(str.startsWith("ninja"));
		System.out.println(str.endsWith("A"));
	}
	
	static void chainedExecution() {
		System.out.println(str.substring(5).replace('n', 'N'));
		System.out.println(str.substring(5).replace("ninja", "super-hero"));
	}
	
	static void addingStrings() {
		
		str += " and a hero!";
		System.out.println(str);
		System.out.println(1 + 3 + "Java");
		
		System.out.println((1 + 3 + "Java").equals("" + 1 + 3 + "Java"));
		
	}
	
	public static void main(String[] args) {
		
		//charAt();
		//indexOf();
		//substring();
		//replace();
		//lenghtAndOthers();
		//chainedExecution();
		addingStrings();
	}
}