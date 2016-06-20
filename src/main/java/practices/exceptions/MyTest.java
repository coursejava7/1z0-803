package practices.exceptions;

class MyException extends Exception {
	
	public MyException(String s) {
		super(s);
	}
}

public class MyTest {
	
	public int method(int x, int y) throws Exception {
		int result = 0;
		try {
			result = x / y;
			
		}catch(Exception e){
			throw new Exception("error doing division", new MyException("Error dividing numbers by zero!!!"));
		} finally {
			System.out.println("RuntimeException managed!!");
		}
		
		return result;
		
	}
	public static void main(String[] args) throws Exception {
		MyTest mt = new MyTest();
		mt.method(10, 0);
	}
}