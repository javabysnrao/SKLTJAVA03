package com.skilllogic.collectionsproj.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class TestArrayList {
	public void saveData() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Vizag");
		list.add("Hyderabad");
		list.add("Kumar");
		list.add("Suresh");
		list.add("Hyderabad");
		System.out.println("--------------------using for loop-------------------");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("--------------------using for-each-------------------");
		for(Object obj:list) {
			String s = (String)obj;
			System.out.println(s);
		}
		System.out.println("----------------------using iterator()------------------------------");
		Iterator  it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----------------------using listIterator()------------------------");
		ListIterator listit = list.listIterator();
		while(listit.hasNext()) {
			System.out.println(listit.next());
		}
		System.out.println("-------------------------------------------------------------");
		ListIterator lit = list.listIterator();
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}
     public static void main(String[] args) {
		 TestArrayList tl = new TestArrayList();
		 tl.saveData();
	}
}
