package practices.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTour {
	
	private static ArrayList<StringBuilder> names = new ArrayList<StringBuilder>();
	
	static{
		names.add(new StringBuilder("Java"));
		names.add(new StringBuilder("C++"));
		names.add(new StringBuilder(".net"));
	}
	
	static void manipulatingArrayListElements(){
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(5);
		
		numbers.add(new Integer(10));
		numbers.add(7);
		numbers.add(3, new Integer(10));
		
		for (int num : numbers){
			System.out.println(num);
		}
	}
	
	static void traversingElements(){
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(5);
		
		numbers.add(new Integer(10));
		numbers.add(7);
		numbers.add(8);
		numbers.add(3, new Integer(10));
		
		for (int num : numbers){
			System.out.println(num);
		}
		
		ListIterator<Integer> itera = numbers.listIterator();
		while(itera.hasNext()){
			System.out.println(itera.next());
		}
		
		
	}
	
	
	static void removingByEquality(){
		
		ArrayList<Object> objects = new ArrayList<Object>(2);
		
		StringBuilder strb0 = new StringBuilder("Java");
		StringBuilder strb1 = new StringBuilder("C++");
		StringBuilder strb2 = new StringBuilder(".net");
		
		objects.add(strb0);
		objects.add(strb1);
		objects.add(strb2);
		
		objects.remove(0);
		objects.remove(strb1);
		
		objects.remove(new StringBuilder(".net"));
		
		for(Object obj : objects){
			System.out.println(obj.toString());
		}
		
	}
	
	static void removingElements(){
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(5);
		
		numbers.add(new Integer(10));
		numbers.add(7);
		numbers.add(4);
		numbers.add(3, new Integer(10));
		
		ListIterator<Integer> itera = numbers.listIterator();
		while(itera.hasNext()){
			int num = itera.next();
			if(num < 5) itera.remove();
			if(num == 10) itera.set(num *= 10);
		}
		
		for (int num : numbers){
			System.out.println(num);
		}		
	}	
	
	
	static ArrayList<StringBuilder> getClonedArraList(){
		return (ArrayList<StringBuilder>)names.clone();
	}
	
	public static void main(String[] args) {
		/*
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList numbersX = new ArrayList();
		ArrayList<Integer> numbersUpSized = new ArrayList<Integer>(20);
		System.out.println(numbers.size());
		System.out.println(numbersUpSized.size());
		*/
		
		//manipulatingArrayListElements();
		//traversingElements();;
		//removingElements();
		//removingByEquality();
		
		ArrayList<StringBuilder> names = getClonedArraList();
		
		for(StringBuilder name : names) {
			System.out.println(name);
		}
		
		names.get(0).append("Other content...");
		names = getClonedArraList();
		
		for(StringBuilder name : names) {
			System.out.println(name);
		}
		
		
		
	}

}
