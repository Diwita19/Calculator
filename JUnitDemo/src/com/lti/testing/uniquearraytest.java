package com.lti.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class uniquearraytest {

	@Test
	void uniquearray() {
		RemoveDups r=new RemoveDups();
		int[] x= {10,20,20,30};
		int[] y= {10,20,30};
		int[] z=r.remDups(x);
		assertArrayEquals(z, y);
	}

}
