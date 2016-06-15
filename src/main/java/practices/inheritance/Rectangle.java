package practices.inheritance;

public class Rectangle {
	
	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeigth() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getArea(){
		return width * height;
	}
	
}

class Square extends Rectangle {
	
	
	//Continue here....

	
}