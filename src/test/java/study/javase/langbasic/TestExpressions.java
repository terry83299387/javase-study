package study.javase.langbasic;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

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

	@Test
	public void testFixedValue3() {
		Object result = expr.fixedValue3();
		assertNotNull(result);
		assertEquals(Float.class, result.getClass());
		assertEquals((float) 3.14159, result);
	}

	@Test
	public void testFixedValue4() {
		Object result = expr.fixedValue4();
		assertNotNull(result);
		assertEquals(Double.class, result.getClass());
		assertEquals(3.141592654, result);
	}

	@Test
	public void testFixedValue5() {
		Object result = expr.fixedValue5();
		assertNotNull(result);
		assertEquals(Character.class, result.getClass());
		assertEquals((char) 32768, result);
	}

	@Test
	public void testFixedValue6() {
		Object result = expr.fixedValue6();
		assertNotNull(result);
		assertEquals(Character.class, result.getClass());
		assertEquals('我', result);
	}

	@Test
	public void testFixedValue7() {
		Object result = expr.fixedValue7();
		assertNotNull(result);
		assertEquals(Integer.class, result.getClass());
		assertEquals(150_000_000, result);
	}

	@Test
	public void testFixedValue8() {
		Object result = expr.fixedValue8();
		assertNotNull(result);
		assertEquals(Long.class, result.getClass());
		assertEquals(4_750_000_000_000_000L, result);
	}

	@Test
	public void testFixedValue9() {
		Object result = expr.fixedValue9();
		assertNotNull(result);
		assertEquals(Float.class, result.getClass());
		assertEquals(8.798544E24F, result);
	}

	@Test
	public void testFixedValue10() {
		Object result = expr.fixedValue10();
		assertNotNull(result);
		assertEquals(Double.class, result.getClass());
		assertEquals(1E80, result);
	}

	@Test
	public void testFixedValue11() {
		Object result = expr.fixedValue11();
		assertNotNull(result);
		assertEquals(Boolean.class, result.getClass());
		assertFalse((boolean) result);
	}

	@Test
	public void testIsEqual() {
		double a = 0.1 + 0.2;
		double b = 0.3;
		boolean result = expr.isEqual(a, b);
		assertFalse(result);
	}

	@Test
	public void testIsEqual2() {
		double[] as = {
			0.1 + 0.2,      0.3,             13531.21,          123.321,       123.31,
			-3.14,          -13589123.35558, -13589123.35558,   0,             19.0,
			-5,             5,
		};
		double[] bs = {
			0.3,            0.1 + 0.2,       13531.203,         123.31,        123.321,
			-3.04,          -13589123.36558, -13589123.45558,   0,             19.0,
			-5,             5,
		};
		boolean[] results = {
			true,           true,            true,              false,         false,
			false,          true,            false,             true,          true,
			true,           true,
		};

		double a, b;
		boolean expected, result;
		for (int i = 0; i < as.length; i++) {
			a = as[i];
			b = bs[i];
			expected = results[i];
			result = expr.isEqual2(a, b);
//			System.out.println(a + ", " + b + ", " + result + ", " + (a - b));
			assertEquals(expected, result);
		}
	}

	@Test
	public void testSquare() {
		int[] nums = {
			 0,
			 1,  1024,  (1 << 16) - 1,  1 << 16,    (1 << 16) + 1, Integer.MAX_VALUE,
			-1, -1024, -(1 << 16) - 1, -(1 << 16), -(1 << 16) + 1, Integer.MIN_VALUE,
		};

		long expected, result;
		for (int num : nums) {
			expected = (long) num * (long) num;
			result = expr.square(num);
			assertEquals(expected, result);
		}
	}

	@Test
	public void testIsWantedNumber() {
		int[] nums = {
			0,        8,       10,      100,     10_000,   10_008,   10_010,   40_000,
			         -8,      -10,     -100,    -10_000,  -10_008,  -10_010,  -40_000,
			 40_008,  99_990,  99_992,  99_999,  100_000,  100_008,
			-40_008, -99_990, -99_992, -99_999, -100_000, -100_008,
		};
		boolean[] results = {
			false,   false,   false,   false,   false,    true,     true,     false,
			         false,   false,   false,   false,    true,     true,     false,
			true,    true,    true,    false,   false,    false,
			true,    true,    true,    false,   false,    false,
		};

		int num;
		boolean expected, result;
		for (int i = 0; i < nums.length; i++) {
			num = nums[i];
			expected = results[i];
			result = expr.isWantedNumber(num);
			assertEquals(expected, result);
		}
	}

	@Test
	public void testDecrypt() {
		char[] txt = "Meet you at Century Park at 2:30 p.m. tomorrow. 手拿红玫瑰为记，혼자 오십시오!".toCharArray();
		short[] passwords = {
			0, 1, 10, 999, 32767, -1, -10, -999, -32767, -32768,
		};

		char[] cipher, decrypted;
		for (short password : passwords) {
			cipher = encrypt(txt, password);
			decrypted = expr.decrypt(cipher, password);
			assertArrayEquals(txt, decrypted);
		}
	}

	// -----------------------------------

	private char[] encrypt(char[] txt, short password) {
		char[] cipher = new char[txt.length];
		for (int i = 0; i < txt.length; i++) {
			cipher[i] = (char) (txt[i] + password);
		}
		return cipher;
	}
}
