package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Lab1Test2 {

	@Test
	public void test() {
		Lab1 tester = new Lab1();
		int output = tester.multiply(2,5);
		assertEquals(10, output);
		
	}
	@Test
	public void test2() {
		Lab1 tester2 = new Lab1();
		int output2 = tester2.multiply(2,6);
		assertEquals(10, output2);
	}
	
	@Test
	public void test3() {
		Lab1 tester3 = new Lab1();
		String output3 = tester3.addStrings("hello","world");
		assertEquals("hello world", output3);
	}
	
	@Test
	public void test4() {
		Lab1 tester4 = new Lab1();
		String output4 = tester4.addStrings("hello","world");
		assertEquals("helloworld", output4);
	}
}

		
		
		
		
		
		
		
		
		


