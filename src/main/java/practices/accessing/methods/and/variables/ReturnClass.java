package practices.accessing.methods.and.variables;


public class ReturnClass {

	
	public void method() {
		
		int x = 5;
        if(x >10){
         System.out.println(x);
         return;
     }else {
             x +=5;
             //return; //It won't compile. If we include this return here... The return won't be the last statement executed!!!   
     }
     System.out.println(x); 

	}
	
}
