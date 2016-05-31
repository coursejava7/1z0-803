package practices.encapsulation;

import java.util.Arrays;

public class MiApp04 {
	
	public static void main(String[] args){
		
		Encapsulation04 enc04 = new Encapsulation04(1,2,3,4);
		int[] numbers = enc04.getNumbers();
		System.out.println(Arrays.toString(numbers));
		
		numbers[3] = 5;
		numbers = enc04.getNumbers();
		System.out.println(Arrays.toString(numbers));

	}
}