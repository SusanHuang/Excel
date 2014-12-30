package excel;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void testNegativeOne() {
		assertEquals("", solution.convertToTitle(-1));
	}
	
	@Test
	public void testZero(){
		assertEquals("", solution.convertToTitle(0));
	}
	
	@Test
	public void testOne(){
		assertEquals("A", solution.convertToTitle(1));
	}
	
	@Test
	public void testTwentySix(){
		assertEquals("Z", solution.convertToTitle(26));
	}
	
	@Test
	public void testTwentySeven(){
		assertEquals("AA", solution.convertToTitle(27));
	}
	
	@Test
	public void testFiftyTwo(){
		assertEquals("ZZ", solution.convertToTitle(52));
	}

}
