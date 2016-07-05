package practices.arrays;

import java.util.Arrays;

public class MiArray {

	public static final void sortingMyObjects() {

		final MyObject[] objects = { 
				new MyObject("Java"), 
				new MyObject("C#"), 
				new MyObject("Angular"),
				new MyObject("Play"), 
				new MyObject("Grails"), 
				new MyObject("Scala"), 
				new MyObject("Akka") };
		
		Arrays.sort(objects);

		for (MyObject object : objects) {
			System.out.println(object.getName());
		}

	}

	public static void main(String[] args) {

		int[] array = { 1, 5, 0, 3, 10, 3, 4, 8 };
		int[] result = Arrays.copyOfRange(array, 0, 10);

		for (int number : result) {
			System.out.println(number);
		}

		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.binarySearch(array, 10));
		System.out.println(Arrays.equals(array, result));

		sortingMyObjects();
	}
}





class MyObject implements Comparable<MyObject> {

	private final String name;

	MyObject(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public int compareTo(MyObject o) {
		return this.name.compareTo(o.name);
	}

}