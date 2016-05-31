package practices.encapsulation;

import java.util.Arrays;

public class MiApp {
	
	public static void main(String[] args){
		
		Encapsulation02 enc02 = new Encapsulation02(1,2,3,4);
		int[] numbers = enc02.getNumbers();
		System.out.println(Arrays.toString(numbers));
		
		numbers[3] = 5;
		numbers = enc02.getNumbers();
		System.out.println(Arrays.toString(numbers));

	}
}