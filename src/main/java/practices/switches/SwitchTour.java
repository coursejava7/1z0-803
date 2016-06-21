package practices.switches;

class SwitchTour {
	
	final int otherValue;
	
	SwitchTour(){
		otherValue = 10;
	}
	
	static void sample01(int value){
		
		switch(value){
			case 20:
				System.out.println("A");
				break;
			case 30:
				System.out.println("B");
				break;
			case 40:
				System.out.println("C");
				break;
			default:
				System.out.println("X");
				break;
		}
		
		
		if(value == 20) 
			System.out.println("A");
		else if(value == 30)
			System.out.println("B");
		else if(value == 40)
			System.out.println("C");
		else
			System.out.println("X");
		
	}
	
	static void sample02(String day){
		switch(day){
			case "MON":
			case "TUE":
			case "WED":
			case "THU":	System.out.println("Working hard!!!");
				break;
			case "FRI":	System.out.println("The weekend is near!!!");
				break;
			case "SAT":
			case "SUN":	System.out.println("Relaxing time!!!");
				break;				
			default:
				System.out.println("error");
				break;
		}
	}
	
	enum Day {MON,TUE,WED,THU,FRI,SAT,SUN}   
	static void sample03(Day dayOfWeek){
		
		switch(dayOfWeek){
		case MON:
		case TUE:
		case WED:
		case THU:	System.out.println("Working hard!!!");
			break;
		case FRI:	System.out.println("The weekend is near!!!");
			break;
		case SAT:
		case SUN:	System.out.println("Relaxing time!!!");
			break;				
		}
	}
	
	static void sample03(int value){
		
		switch(value * 10){
			case 20:
				System.out.println("A");
				break;
			case 30:
				System.out.println("B");
				break;
			case 40:
				System.out.println("C");
				break;
			default:
				System.out.println("X");
				break;
		}
	}
	
	static final int a = 0;
	static void sample04(int value){
		
		final int b = 10;
		switch(value){
			case b:
				System.out.println("B");
				break;
			case 40 * a:
				System.out.println("C");
				break;
			/*	
			case otherValue: // don't compile
				System.out.println("B");
				break;
			*/				
		}	
	}
	
	public static void main(String[] args){
		sample01(20);
	}
}