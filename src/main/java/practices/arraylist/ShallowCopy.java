package practices.arraylist;

import java.util.ArrayList;

public class ShallowCopy {

	public static void shallowCopy() {

		ArrayList<MiObject> sourceArrayList = new ArrayList<MiObject>();

		MiObject obj1 = new MiObject("Java7");
		MiObject obj2 = new MiObject("C#");
		MiObject obj3 = new MiObject("AngularJS");

		sourceArrayList.add(obj1);
		sourceArrayList.add(obj2);
		sourceArrayList.add(obj3);

		ArrayList clonedArrayList = (ArrayList) sourceArrayList.clone();

		sourceArrayList.get(0).setName("Java8");

		System.out.println("Shallow cloned: " + clonedArrayList.get(0));

	}
	
	public static void main(String[] args) {
		
		shallowCopy();
	}

}

class MiObject {

	private String name;

	MiObject(String name) {
		this.name = name;
	}

	public void setName(String name) { this.name = name; }

	public String getName() { return this.name;	}

	public String toString() { return name;	}
}

