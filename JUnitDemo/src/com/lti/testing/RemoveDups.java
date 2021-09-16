package com.lti.testing;
import java.util.*;

public class RemoveDups {
	int[] remDups(int[] input) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int val:input) {
			if(!l.contains(val)) {
				l.add(val);
			}
		}
		int x=0;
		int arr[]=new int[l.size()];
		for(int val:l) {
			arr[x++]=val;
		}
		return arr;
	}
}
