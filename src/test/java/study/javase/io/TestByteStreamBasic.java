package study.javase.io;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestByteStreamBasic {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}

	@Before
	public void before() {
		System.out.println("before test case");
	}

	@Test
	public void testByteArrayStream() {
		System.out.println("test byteArrayStream()");
	}

	@After
	public void after() {
		System.out.println("after test case");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}
}
