package com.skilllogic.collectionsproj.hashset;

import java.util.LinkedHashSet;

public class TestHashSet {
	public void save() {
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(10);
		hs.add("Raja");
		hs.add("Hyderabad");
		hs.add(10);
		hs.add(60000.00);
		hs.add("Vijaywada");
		System.out.println(hs);
		System.out.println(hs.size());
	}
	public static void main(String[] args) {
		TestHashSet ths = new TestHashSet();
		ths.save();
	}
}
