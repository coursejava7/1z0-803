package practice.encapsulation.handson;


/**
 * This class demonstrates how we can encapsulate field members.
 * 
 * @author blesa
 *
 */

public abstract class Isbn {
	
	private final byte[] isbnNumber; //field encapsulated : isbn number  
	private byte control; //field encapsulated : Control digit.
	
	/**
	 * It initializes the instance with a final valor for ISBN number.  
	 * 
	 * @param isbnNumber
	 */
	public Isbn(byte... isbnNumber) {
		this.isbnNumber = isbnNumber;
	}
	
	public byte[] getIsbnCode(){
		return isbnNumber.clone();
	}
	
	public byte getControl(){
		return control;
	}
	
	/**
	 * This method is declared abstract to be implemented by the extended classes
	 * because the digit control calculation could be different.
	 * 
	 * @return
	 */
	public abstract byte calculateControl();
	
	/**
	 * Overriding method toString allows return the isbn number with de digit control.
	 */
	public String toString() {
		
		StringBuilder strb = new StringBuilder();
		
		for(int number : isbnNumber) {
			strb.append(number);
		}
		
		strb.append('-');
		strb.append(control == 0 ? calculateControl(): control);
		
		return strb.toString();
	}
	
	protected void setControlCode(byte control){
		this.control = control;
	}
}