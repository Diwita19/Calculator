package com.lti.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MypTest {

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before");
	}
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After");
	}
	@Test
	void test1() {
		MyProgram mp=new MyProgram();
		assertEquals(5,mp.getLength("abcde"));
	}
	void test2() {
		MyProgram mp=new MyProgram();
		assertEquals(57,mp.getLength("a b c d"));
	}

}
