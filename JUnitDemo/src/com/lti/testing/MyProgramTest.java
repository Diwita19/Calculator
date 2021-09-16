package com.lti.testing;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class MyProgramTest {
	@Test
//	void makeUpperTest() {
//		MyProgram mp=new MyProgram();
//		String res=mp.makeUpper("stars");
//		assertEquals("STARS",res);
//	}
//	@Test
//	void makeUpperTest2() {
//		MyProgram mp=new MyProgram();
//		String res=mp.makeUpper("Ant");
//		assertEquals("ANT",res);
//	}
//	@Test
//	void makeUpperTest3() {
//		MyProgram mp=new MyProgram();
//		String res=mp.makeUpper("KAIT");
//		assertEquals("KAIT",res);
//	}
	void makeUpperTest1() {
		MyProgram mp=new MyProgram();
		int res=0;
		try {
			res=mp.divide(10,-1);
			assertEquals(res, -1);
		}catch(Exception e) {
			fail("Exception Occured");
//			System.out.println("Exception Occured");
		}
	}
}