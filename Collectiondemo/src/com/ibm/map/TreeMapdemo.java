package com.ibm.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapdemo {
public static void main(String[] args) {
	Map<String,String>accounts=new TreeMap<String,String>();
	
	accounts.put("-2","accounts2");
	accounts.put("-1","accounts1");
	System.out.println(accounts);
}
}
