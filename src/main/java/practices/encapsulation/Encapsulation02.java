package practices.encapsulation;

public class Encapsulation02 {
	
	private int[] numbers;
	private int size;
	
	Encapsulation02(int... numbers){
		this.size = numbers.length;
		this.numbers = numbers;
	}
	
	public int[] getNumbers(){ return numbers; }
}