package core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//collection framework
public class P023_List {
	public static void main(String[] args) {
//		<generics>
		List list = new ArrayList();
		list.add(1);
		list.add("java");
		list.add(false);
		list.add('g');
		list.add(2354764576l);
		list.add(345.345);
		list.add("python");
		list.add(1);
		System.out.println(list);
		list.add(235);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
