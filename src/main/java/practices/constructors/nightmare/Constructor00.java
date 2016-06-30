package practices.constructors.nightmare;

public class Constructor00 {
	
	Constructor00(int x){
		//this(String.valueOf(x)); // Recursive. It won't compile!!!! 
		System.out.println(x);
	}
	
	Constructor00(String x){
		this(Integer.valueOf(x));
		System.out.println(x);
	}
}
