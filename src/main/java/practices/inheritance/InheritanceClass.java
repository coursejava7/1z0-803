package practices.inheritance;

class User {
	
	public void sendEmail(String body) {
		System.out.println("sending an email from User.sendEmail(String)");
	}

}

class SuperUser extends User {
	
	public void sendEmail(Object body){
		System.out.println("sending an email from SuperUser.sendEmail()");
	}
	
	public void sendEmail(String body) {
		System.out.println("sending an email from SuperUser.sendEmail(String)");
	}
}	
	
public class InheritanceClass {
	
	public static void main(String[] args) {
		
		User user = new User();
		User boss = new SuperUser();
		
		user.sendEmail("Hi!");
		boss.sendEmail("Hi!");
		//boss.sendEmail(new Integer(3)); // WON'T COMPILE, User hasn't either sendMail(Integer), sendMail(Object) nor sendMail(int) 
	}	
}