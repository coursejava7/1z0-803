package practices.inheritance;

import java.io.IOException;
import java.io.FileNotFoundException;

class User02 {
	
	public void sendEmail(String body) throws IOException {
		System.out.println("sending an email from User02.sendEmail(String)");
	}
}

class SuperUser02 extends User02 {
	
	public void sendEmail(Object body) throws FileNotFoundException {
		System.out.println("sending an email from SuperUser02.sendEmail()");
	}
	
	public void sendEmail(String body) {
		System.out.println("sending an email from SuperUser02.sendEmail(String)");
	}
}	
	
public class InheritanceClass02 {
	
	/**
	 * We need to throw an Exception otherwise it won't compile although 
	 * at Runtime the method from SuperUser02 will be invoked and
	 * this method don't declares any Exception. 
	 */
	public static void main(String[] args) throws Exception {
		
		User02 user = new User02(), boss = new SuperUser02();
		
		user.sendEmail("Hi!");
		boss.sendEmail("Hi!");
	}	
}