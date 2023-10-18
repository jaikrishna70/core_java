package collections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1=new ArrayList();
		System.out.println("Check the list :"+list1.isEmpty());
		// list 1 is object of type integer it can only store integer values
        // add is an method which appends elements
		list1.add(2);
		list1.add('q');
		System.out.println("the size of the list:"+list1.size());
		System.out.println("the element is present or not :"+list1.contains(50));
		System.out.println("Remove an element :"+list1.remove(1));
		System.out.println("the element at the position:"+list1.get(0));
		list1.add(4);
		list1.add(6);
		// traverse elements
		System.out.println("the list elements are:"+list1);
		
		Iterator<Integer> i=list1.iterator();
		while(i.hasNext()) {
			Integer p=i.next();
			System.out.println(p);
		}
		

	}

}
