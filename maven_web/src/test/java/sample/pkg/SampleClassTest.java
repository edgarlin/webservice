package sample.pkg;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleClassTest extends SampleClass {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetI() {
		SampleClass sc = new SampleClass();
		sc.setI(10);
		sc.getI();
	}

	@Test
	public void testSetI() {
		SampleClass sc = new SampleClass();
		sc.setI(10);
		sc.getI();
	}

}
