package com.vivek.www.Sample;

import java.util.HashMap;

public class TestHashMap {

	static HashMap<String, String> hm = new HashMap<String, String>();
	static HashMap<String, String> org = new HashMap<String, String>();
	public static void main(String[] args) {
		hm.put("a", "ABC");
		System.out.println(hm.get("a"));
		hm.put("b", "BCA");
		System.out.println(hm.get("b"));
		hm.put("c", "CAB");
		System.out.println(hm.get("c"));
		hm.put("a", "abc");
		System.out.println(hm.get("a"));
		hm.put("a", "bca");
		System.out.println(hm.get("a"));
		name();
		
		org = hm;
		
		System.out.println(org.size());
		System.out.println(org.get("a").equals(hm.get("a")));
		System.out.println(org.get("b").isEmpty());
		System.out.println(org.get("c"));
		
	}
	
	public static void name() {
		System.out.println(hm.get("a"));
		System.out.println(hm.size());
		
	}

}
