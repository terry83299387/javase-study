package study.javase.langbasic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import study.javase.assist.SkippedRunner;

@RunWith(SkippedRunner.class)
public class TestExpressions {

	protected Expressions expr;

	@Before
	public void init() {
		expr = new Expressions();
	}

	@Test
	public void testAddIntegers1() {
		int result = expr.addIntegers1();
		assertEquals(35, result);
	}

	@Test
	public void testAddIntegers2() {
		int result = expr.addIntegers2(3, 5);
		assertEquals(8, result);

		result = expr.addIntegers2(-10, 10);
		assertEquals(0, result);

		result = expr.addIntegers2(Integer.MAX_VALUE, Integer.MAX_VALUE);
		assertEquals(Integer.MAX_VALUE + Integer.MAX_VALUE, result);

		result = expr.addIntegers2(Integer.MIN_VALUE, Integer.MIN_VALUE);
		assertEquals(Integer.MIN_VALUE + Integer.MIN_VALUE, result);
	}

	@Test
	public void testAddIntegers3() {
		int result = expr.addIntegers3(3, 5);
		assertEquals(8, result);

		result = expr.addIntegers3(-10, 10);
		assertEquals(0, result);

		result = expr.addIntegers3(Integer.MAX_VALUE, Integer.MAX_VALUE);
		assertEquals(Integer.MAX_VALUE + Integer.MAX_VALUE, result);

		result = expr.addIntegers3(Integer.MIN_VALUE, Integer.MIN_VALUE);
		assertEquals(Integer.MIN_VALUE + Integer.MIN_VALUE, result);
	}

	@Test
	public void testFixedValue1() {
		Object result = expr.fixedValue1();
		assertNotNull(result);
		assertEquals(Byte.class, result.getClass());
		assertEquals((byte) -123, result);
	}

	@Test
	public void testFixedValue2() {
		Object result = expr.fixedValue2();
		assertNotNull(result);
		if (!Character.class.equals(result.getClass())
				&& !Short.class.equals(result.getClass())) {
			throw new AssertionError("expected Character or Short, but got " + result.getClass().getName());
		}
		if (Character.class.equals(result.getClass())) {
			assertEquals((char) 32767, result);
		}
		else {
			assertEquals((short) 32767, result);
		}
	}

}
