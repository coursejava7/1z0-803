package practices.arraylist;

import java.util.ArrayList;

public class DeepCopy {

	public static void deepCopy() {

		ArrayList<MyCloneableObject> sourceArrayList = new ArrayList<MyCloneableObject>();

		MyCloneableObject obj1 = new MyCloneableObject("Java7");
		MyCloneableObject obj2 = new MyCloneableObject("C#");
		MyCloneableObject obj3 = new MyCloneableObject("AngularJS");

		sourceArrayList.add(obj1);
		sourceArrayList.add(obj2);
		sourceArrayList.add(obj3);

		ArrayList<MyCloneableObject> clonedArrayList = new ArrayList<MyCloneableObject>();
		
		for(MyCloneableObject miObject : sourceArrayList){
			clonedArrayList.add((MyCloneableObject)miObject.clone());
		}
		
		sourceArrayList.get(0).setName("Java8");

		System.out.println("Deep cloned: " + clonedArrayList.get(0));

	}
	
	public static void main(String[] args) {
		deepCopy();
	}

}

class MyCloneableObject {
	
	private String name;
	
	MyCloneableObject(String name) {
		this.name = name;
	}
	
	public void setName(String name) {	this.name = name; }

	public String getName() { return this.name;	}

	public String toString() { return name;	}

	@Override
	protected Object clone() {
		return new MyCloneableObject(this.getName());
	}

}