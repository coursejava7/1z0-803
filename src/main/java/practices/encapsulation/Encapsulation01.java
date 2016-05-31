package practices.encapsulation;

public class Encapsulation01 {
	
	private int var;
	private int oneThirdVar; //This variable is one third of var.
	
	Encapsulation01(){
		var = 10;
		oneThirdVar = var / 3;
	}
	
	public void setVar(int var){
		this.var = var;
		this.oneThirdVar = var / 3;
	}
	
	public static void main(String[] args){
		Encapsulation01 enc01 = new Encapsulation01();
        enc01.setVar(10);
	}
	
}