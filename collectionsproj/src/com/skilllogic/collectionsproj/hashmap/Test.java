package com.skilllogic.collectionsproj.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class Test {
	public void insert() {
		HashMap<Integer,String>  hm = new HashMap<>();
		hm.put(1,"Hyderabad");
		hm.put(2,"Vizag");
		hm.put(3,"Vijaywada");
		hm.put(4,"Vizag");
		hm.put(4,"Warngal");
		hm.put(5,"Kakinada");
		System.out.println(hm);	
		System.out.println("----------------------------------------------------------------------");
		for(Map.Entry<Integer,String>  entry:hm.entrySet()) {
			 System.out.println(entry.getKey()+"          "+entry.getValue());
		}
		System.out.println("-----------------------------------------------------------------------");
		Iterator it = hm.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = (Entry<Integer, String>)it.next();
			System.out.println(entry.getKey()+"     "+entry.getValue());
		}
		System.out.println("---------------------------------------------------------------------------");
		hm.forEach((k,v) -> System.out.println(k+"     "+v));
		System.out.println("------------------------------------------------------------------------------");
		for(Object keys: hm.keySet()) {
			System.out.println(hm.get(keys));
		}
	}
	public static void main(String[] args) {
		  Test t = new Test();
		  t.insert();
	}
}
