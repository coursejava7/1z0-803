package practices.loops;

public class Loops {
	
	static void forLoop01() {
		
		String[] lang = {"C++", "Java", "C#"}; 
		
		for(int x = 0; x < lang.length; x++ ){
			System.out.println(lang[x]);
		}
	}
	
	static void forLoop02() {
		
		String[] lang = {"C++", "Java", "C#"}; 
		
		for(int x = 0; x < lang.length; printX(x), x++ ){
			System.out.println(lang[x]);
		}
	}
	
	
	private static void printX(int x){
		System.out.println(x);
	}
	
	
	static void forLoop03() {
		
		int[][] matrix = {{10, 20, 30},{100, 200, 300}};
		
		for(int x = 0; x < matrix.length; x++ ){
			for(int j = 0; j < matrix[x].length; j++)
				System.out.print(matrix[x][j] + "\t");
				System.out.println();
		}
	}
	
	static void forLoop04() {
		
		int[] matrix = {10, 20, 30};
		
		for(int number : matrix){
			System.out.println(number);
		}
	}
	
	
	static void forLoop05(){
		
		StringBuilder arr[] = { 
				new StringBuilder("Java7"),
				new StringBuilder("Java8")};
		
		for (StringBuilder strb : arr)
			System.out.println(strb);
		
		for (StringBuilder strb : arr)
			strb.append(" geek!");
		
		for (StringBuilder strb : arr)
			System.out.println(strb);
		
	}
	
	static void forLoop06(){
		
		StringBuilder arr[] = { 
				new StringBuilder("Java7"),
				new StringBuilder("Java8")};
		
		for (StringBuilder strb : arr)
			System.out.println(strb);
		
		for (StringBuilder strb : arr)
			strb = new StringBuilder(("geek!"));
		
		for (StringBuilder strb : arr)
			System.out.println(strb);
		
	}
	
	static void forLoop07(){
		
		StringBuilder arr[] = { 
				new StringBuilder("Java7"),
				new StringBuilder("Java8")};
		
		int x = 0;

		while(x < arr.length){
			System.out.println(arr[x++]);
		}
	}
	
	static void forLoop08(){
		
		StringBuilder arr[] = { 
				new StringBuilder("Java7"),
				new StringBuilder("Java8")};
		
		int x = 0;

		do{
			System.out.println(arr[x++]);
		}while(x < arr.length);
	}
	
	static void breakLoop(){
	
		String[] labels = {"label1", "label2"};
		
		fuera:
		for (String label : labels) {
				if (label.equals("label2"))
						break fuera;
				System.out.println(label);
		}
	}
		
	public static void main(String[] args) {
		breakLoop();
	}
}
