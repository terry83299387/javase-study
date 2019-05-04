package study.javase.io;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import study.javase.assist.SkippedRunner;

@RunWith(SkippedRunner.class)
public class TestByteStream {

	protected ByteStreams byteStream;

//	@BeforeClass
//	public static void beforeClass() {
//		System.out.println("before class");
//	}

	@Before
	public void init() {
		byteStream = new ByteStreams();
	}

	@Test
	public void testByteArrayStream() {
		System.out.println("test byteArrayStream()");
	}

//	@After
//	public void after() {
//		System.out.println("after test case");
//	}
//
//	@AfterClass
//	public static void afterClass() {
//		System.out.println("after class");
//	}
}
