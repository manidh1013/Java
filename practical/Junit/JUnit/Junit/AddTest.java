package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	public void addtest()
	{
		MyJunitClass junit = new MyJunitClass ();//creating an object of class
		int result = junit.add(10,40);
		assertEquals(50,result);
		
	}
	
}
