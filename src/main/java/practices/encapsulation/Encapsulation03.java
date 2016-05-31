package practices.encapsulation;

public class Encapsulation03 {
	
	private final int[] numbers;
	private int size;
	
	Encapsulation03(int... numbers){
		this.size = numbers.length;
		this.numbers = numbers;
	}
	
	public int[] getNumbers(){ return numbers; }
}