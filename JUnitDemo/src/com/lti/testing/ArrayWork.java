package com.lti.testing;
import java.util.*;

public class ArrayWork {
	int[] work(int[] input) {
		SortedSet<Integer> s= new TreeSet<Integer>();
		for(int i:input) {
			s.add(i);
		}
		int[] a=new int[s.size()];
		int[] array = new int[s.size()];
		Arrays.toString(array);
		return array;
	}
}