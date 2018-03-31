package sn.ept.CI;

import org.junit.Assert;
import org.junit.Test;

public class OperationTest{

	@Test
	public void testAdd() {
		int a =1;
		int b = 2;
		Operation instance = new Operation();
		int expectedResult = 3;
		int result = instance.add(a, b);
		Assert.assertEquals("Add operation fails", expectedResult , result);
	}

	@Test
	public void testMultiply() {
		int a =1;
		int b = 2;
		Operation instance = new Operation();
		int expectedResult = 2;
		int result = instance.multiply(a, b);
		Assert.assertEquals("Multiply operation fails", expectedResult , result);
		}
}
