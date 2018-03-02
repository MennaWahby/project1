package test;

import org.apache.http.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test11 {
	
	@Test
	public void test_to_pass()
	{
		
		Assert.assertEquals(1, 1);
	}
	@Test
public void test_to_fail()
{
	Assert.assertEquals(1, 2);
}
}
