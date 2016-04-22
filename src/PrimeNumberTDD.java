import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumberTDD {

	@Test
	public void test1() 
	{
		assertEquals(false, PrimeNumberClass.findPrime(1));
	}
	@Test
	public void test2() 
	{
		assertEquals(true, PrimeNumberClass.findPrime(2));
	}
	@Test
	public void test3() 
	{
		assertEquals(true, PrimeNumberClass.findPrime(3));
	}
	@Test
	public void test4() 
	{
		assertEquals(false, PrimeNumberClass.findPrime(4));
	}
	@Test
	public void test5() 
	{
		assertEquals(true, PrimeNumberClass.findPrime(5));
	}
	@Test
	public void test6() 
	{
		assertEquals(false, PrimeNumberClass.findPrime(6));
	}
	@Test
	public void test7() 
	{
		assertEquals(true, PrimeNumberClass.findPrime(7));
	}
	@Test
	public void test8() 
	{
		assertEquals(false, PrimeNumberClass.findPrime(8));
	}
	@Test
	public void test9() 
	{
		assertEquals(false, PrimeNumberClass.findPrime(9));
	}
	@Test
	public void test10() 
	{
		assertEquals(false, PrimeNumberClass.findPrime(9));
	}
	@Test
	public void test11() 
	{
		assertEquals(true, PrimeNumberClass.findPrime(11));
	}
}
