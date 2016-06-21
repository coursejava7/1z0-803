package practices.inheritance;

class RectangleApp {
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(10);
		rectangle.setWidth(5);
		
		Square square = new Square();
		square.setHeight(10);
		//square.setWidth(5);
		
		System.out.println(rectangle.getArea());
		System.out.println(square.getArea());
	}
}