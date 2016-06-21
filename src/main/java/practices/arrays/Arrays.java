package practices.arrays;

public class Arrays {
	
	
	static private final int[] myArray = new int[]{10,5};
	
	static void tastingArrays(){
		int i = 0;
		int[] array = new int[i+=2];
		System.out.println(array.length);
		
	}
	
	static void showMeMyArray() {
		
		for(int number : myArray){
			System.out.println(number);
		}
	}
	
	static int[] cloningArray(){
		int[] cloned = myArray.clone();
		return cloned;
	}
	
	static void objectArray(){
		
		Object objects[] = new Object[]{
						new java.util.Date(),
						new Integer(10),
						new StringBuilder("Hello Java")
		};
		
	}
	
	static void asymetricArray(){
		
		int numbers[][] = new int[3][];
		
		numbers[0] = new int[3];
		numbers[1] = null;
		numbers[2] = new int[]{10,5};
	}
	
	static void initArrays() {
		
		String[] names;
		String cities[];
		String[][] citiesByCountry;
		String[] studentsByClass[];
		
		String[][] multiArray = new String[2][];
		String[] multiArray2[] = new String[2][];
		String[] otherArray[][] = new String[2][][];
		//String[] multiArray2[] = new String[2]; //ERROR
		//String[2] a = new String[]; //ERROR
		
		String[] xmen = {"John", "David"};
		String[][] names3 = { {"John" ,  "David"} , {"Mike" , "Peter"} };
		String name[][] = new String[][]{ {"John" ,  "David"} , {"Mike" , "Peter"} };
			
	}
	
	public static void main(String[] args) {
		
		//tastingArrays();
		
		int[] myLocalArray = cloningArray();
		myLocalArray[1] = 100;
		
		showMeMyArray();
		
	}
	
	
	
}