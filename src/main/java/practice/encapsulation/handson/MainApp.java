package practice.encapsulation.handson;



public class MainApp {

	public static void main(String[] args) {

		Isbn isbn = new Isbn13(new byte[] { 9, 7, 8, 8, 4, 9, 2, 4, 9, 3, 7, 0 });
		isbn.calculateControl();

		System.out.println(isbn);

		isbn.getControl();
		byte[] number = isbn.getIsbnCode();

		number[3] = 7; // trying to modify the array inside isbn object.

		System.out.println(isbn); // seems that the array is well encapsulated!!!
	}
}