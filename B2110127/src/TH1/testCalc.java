package TH1;
import org.junit.*;

import static org.junit.Assert.*;
import TH1.MyCalc;

public class testCalc {
	private MyCalc Calc;
	
	@Before
	public void setUp(){
		Calc = new MyCalc();
	}
	
	@After
	public void tearDown(){
		Calc = null;
	}
	@Test
	public void testAdd(){
		assertEquals(5,Calc.add(2, 3));
		assertEquals(15,Calc.add(10,5));
		assertEquals(0,Calc.add(-4,4));
	}
	@Test
	public void testSub(){
		assertEquals(-1,Calc.sub(2, 3));
		assertEquals(5,Calc.sub(10,5));
		assertEquals(8,Calc.sub(4,-4));
	}
	@Test
	public void testMul(){
		assertEquals(6,Calc.mul(2, 3));
		assertEquals(-50,Calc.mul(-10,5));
		assertEquals(16,Calc.mul(4,4));
	}
	@Test(expected = ArithmeticException.class)
	public void testDiv(){
		assertEquals(0,Calc.div(2, 3));
		assertEquals(-2,Calc.div(-10,5));
		assertEquals(1,Calc.div(4,4));
		assertEquals(3,Calc.div(4,0));
	}
	@Test
	public void testMux(){
		assertEquals(8,Calc.mux(2, 3));
		assertEquals(-32,Calc.mux(-2,5));

	}
	@Test
	public void testMin(){
		assertEquals(2,Calc.min(2, 3));
		assertEquals(-5,Calc.min(2,-5));
		assertEquals(4,Calc.min(4,4));


	}
	@Test
	public void testQrt(){
		assertEquals(4,Calc.qrt(2));
		assertEquals(0,Calc.qrt(0));
		assertEquals(4,Calc.qrt(-2));
	}
	@Test
	public void testMax(){
		assertEquals(3,Calc.max(2, 3));
		assertEquals(2,Calc.max(2,-5));
		assertEquals(4,Calc.max(4,4));
	}
	@Test
	public void testEqual(){
		assertTrue(Calc.equal(3,3));
		assertFalse(Calc.equal(-2,4));
		assertSame(true,Calc.equal(-2,-2));
	}
	@Test(expected = ArithmeticException.class)
	public void testProcession(){
		assertEquals(41,Calc.procession(3,2,20));
		assertEquals(35,Calc.procession(3,-2,20));
		assertEquals(35,Calc.procession(3,0,20));
	}
	@Test
	public void testSumprocession(){
		assertEquals(440,Calc.sumProcession(3,2,20));

	}
}
