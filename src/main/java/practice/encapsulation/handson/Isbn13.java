package practice.encapsulation.handson;

/*
	http://www.grupoalquerque.es/mate_cerca/paneles_2012/168_ISBN2.pdf
*/
public class Isbn13 extends Isbn {
	
	Isbn13(byte[] isbnCode){
		super(isbnCode);
	}
	
	public byte calculateControl(){
		byte[] pattern = {1,3,1,3,1,3,1,3,1,3,1,3};
		byte[] isbnCode = getIsbnCode();
		short total = 0;
		byte controlCode = 0;
		
		for(int x = 0; x < 12; x++){
			total = (short) (total +  (pattern[x] * isbnCode[x]));
		}
		
		controlCode = (byte)(10 - (total % 10));
		setControlCode(controlCode);
		
		return controlCode;
		
	}
}