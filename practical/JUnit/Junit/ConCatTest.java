package Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConCatTest {
	@Test
	public void stringtest() 
	{
		MyJunitClass junit  = new MyJunitClass();
		String result = junit.ConCat("manish", "patil");
		assertEquals("manishpatil",result);		
	}
}
