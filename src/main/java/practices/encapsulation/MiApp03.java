package practices.encapsulation;

import java.util.Arrays;

public class MiApp03 {
	
	public static void main(String[] args){
		
		Encapsulation03 enc03 = new Encapsulation03(1,2,3,4);
		int[] numbers = enc03.getNumbers();
		System.out.println(Arrays.toString(numbers));
		
		numbers[3] = 5;
		numbers = enc03.getNumbers();
		System.out.println(Arrays.toString(numbers));

	}
}