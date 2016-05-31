package practices.encapsulation;

public class Encapsulation04 {
	
	private final int[] numbers;
	private int size;
	
	Encapsulation04(int... numbers){
		this.size = numbers.length;
		this.numbers = numbers;
	}
	
	public int[] getNumbers(){ return numbers.clone(); }
}