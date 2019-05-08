package study.javase.langbasic;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

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

	@Test
	public void testIntToBytes() {
		int[] nums = {
			0x00000000,           0x00000012,           0x00001234,           0x00123456,           0x12345678,
		    0x40000000,           0x40000012,           0x40001234,           0x40123456,           0x40FFFFFF,
		    0x7F000000,           0x7F000012,           0x7F001234,           0x7F123456,           0x7FFFFFFF,
		    0x80000000,           0x80000012,           0x80001234,           0x80123456,           0x80FFFFFF,
		    0xC0000000,           0xC0000012,           0xC0001234,           0xC0123456,           0xC0FFFFFF,
		    0xF0000000,           0xF0000012,           0xF0001234,           0xF0123456,           0xF0FFFFFF,
		    0x11111111,           0x22222222,           0x78888888,           0xFF000000,           0xFFFFFFFF,
		};
		final byte b00  = 0x00, b12 = 0x12, b34 = 0x34, b56 = 0x56, b78 = 0x78,
				b40 = 0x40, b7f = 0x7F, b80 = (byte) 0x80, bc0 = (byte) 0xC0,
				bf0 = (byte) 0xF0, b11 = 0x11, b22 = 0x22, b88 = (byte) 0x88,
				bff = (byte) 0xFF;
		byte[][] results = {
			{b00, b00, b00, b00}, {b00, b00, b00, b12}, {b00, b00, b12, b34}, {b00, b12, b34, b56}, {b12, b34, b56, b78},
			{b40, b00, b00, b00}, {b40, b00, b00, b12}, {b40, b00, b12, b34}, {b40, b12, b34, b56}, {b40, bff, bff, bff},
			{b7f, b00, b00, b00}, {b7f, b00, b00, b12}, {b7f, b00, b12, b34}, {b7f, b12, b34, b56}, {b7f, bff, bff, bff},
			{b80, b00, b00, b00}, {b80, b00, b00, b12}, {b80, b00, b12, b34}, {b80, b12, b34, b56}, {b80, bff, bff, bff},
			{bc0, b00, b00, b00}, {bc0, b00, b00, b12}, {bc0, b00, b12, b34}, {bc0, b12, b34, b56}, {bc0, bff, bff, bff},
			{bf0, b00, b00, b00}, {bf0, b00, b00, b12}, {bf0, b00, b12, b34}, {bf0, b12, b34, b56}, {bf0, bff, bff, bff},
			{b11, b11, b11, b11}, {b22, b22, b22, b22}, {b78, b88, b88, b88}, {bff, b00, b00, b00}, {bff, bff, bff, bff},
		};

		int num;
		byte[] expected, result;
		for (int i = 0; i < nums.length; i++) {
			num = nums[i];
			expected = results[i];
			result = expr.intToBytes(num);
			assertArrayEquals(expected, result);
		}
	}

	@Test
	public void testBytesToInt() {
		final byte b00  = 0x00, b12 = 0x12, b34 = 0x34, b56 = 0x56, b78 = 0x78,
				b40 = 0x40, b7f = 0x7F, b80 = (byte) 0x80, bc0 = (byte) 0xC0,
				bf0 = (byte) 0xF0, b11 = 0x11, b22 = 0x22, b88 = (byte) 0x88,
				bff = (byte) 0xFF;
		byte[][] args = {
			{b00, b00, b00, b00}, {b00, b00, b00, b12}, {b00, b00, b12, b34}, {b00, b12, b34, b56}, {b12, b34, b56, b78},
			{b40, b00, b00, b00}, {b40, b00, b00, b12}, {b40, b00, b12, b34}, {b40, b12, b34, b56}, {b40, bff, bff, bff},
			{b7f, b00, b00, b00}, {b7f, b00, b00, b12}, {b7f, b00, b12, b34}, {b7f, b12, b34, b56}, {b7f, bff, bff, bff},
			{b80, b00, b00, b00}, {b80, b00, b00, b12}, {b80, b00, b12, b34}, {b80, b12, b34, b56}, {b80, bff, bff, bff},
			{bc0, b00, b00, b00}, {bc0, b00, b00, b12}, {bc0, b00, b12, b34}, {bc0, b12, b34, b56}, {bc0, bff, bff, bff},
			{bf0, b00, b00, b00}, {bf0, b00, b00, b12}, {bf0, b00, b12, b34}, {bf0, b12, b34, b56}, {bf0, bff, bff, bff},
			{b11, b11, b11, b11}, {b22, b22, b22, b22}, {b78, b88, b88, b88}, {bff, b00, b00, b00}, {bff, bff, bff, bff},
		};

		int[] results = {
			0x00000000,           0x00000012,           0x00001234,           0x00123456,           0x12345678,
		    0x40000000,           0x40000012,           0x40001234,           0x40123456,           0x40FFFFFF,
		    0x7F000000,           0x7F000012,           0x7F001234,           0x7F123456,           0x7FFFFFFF,
		    0x80000000,           0x80000012,           0x80001234,           0x80123456,           0x80FFFFFF,
		    0xC0000000,           0xC0000012,           0xC0001234,           0xC0123456,           0xC0FFFFFF,
		    0xF0000000,           0xF0000012,           0xF0001234,           0xF0123456,           0xF0FFFFFF,
		    0x11111111,           0x22222222,           0x78888888,           0xFF000000,           0xFFFFFFFF,
		};

		byte[] arg;
		int expected, result;
		for (int i = 0; i < args.length; i++) {
			arg = args[i];
			expected = results[i];
			result = expr.bytesToInt(arg);
			assertEquals(expected, result);
		}
	}

	@Test
	public void testIntegerDivision() {
		int[] as = {
			1,   2,  5,  -1,  -5,    5,   1,  -1,
			333, 333,  -333,  -333,   11,   11,   -11,   -11,
		};
		int[] bs = {
			1,   1,  2,  -1,   2,   -2,   0,   0,
			11,  -11,   11,   -11,   333,  -333,   333,  -333,
		};

		int a, b;
		double expected, result;
		for (int i = 0; i < as.length; i++) {
			a = as[i];
			b = bs[i];
			expected = (double) a / (double) b;
			result = expr.integerDivision(a, b);
			assertEquals(expected, result, 0.001);
		}
	}

	@Test
	public void testIntToMasks() {
		int[] masks = {
			0x00000000,
			0x00000001, 0x00000002, 0x00000003, 0x00000004, 0x00000005,
			0x00000006, 0x00000007, 0x00000008, 0x00000009, 0x0000000A,
			0x0000000B, 0x0000000C, 0x0000000D, 0x0000000E, 0x0000000F,
			0x00000010, 0x000000F0, 0x00001FF0, 0x00001FFF, 0x0000FFFF,
			0x40000000, 0x40000001, 0x41111111, 0x4FEDCBA9, 0x4FFFFFFF,
			0x70000000, 0x7100000F, 0x71234567, 0x7FEDCBA9, 0x7FFFFFFF,
			0x80000000, 0x80000001, 0x8FFFFFFF, 0xA0000000, 0xAFFFFFFF,
			0xC1111111, 0xC2222222, 0xC1234567, 0xC89ABCDE, 0xCCCCCCCC,
			0xF0000000, 0xF147ADF0, 0xF000F000, 0xFFFFFFF0, 0xFFFFFFFF,
		};

		int[] expected, result;
		for (int mask : masks) {
//			System.out.println("------ " + Integer.toHexString(mask));
			expected = intToMasks(mask);
//			Arrays.stream(expected).mapToObj(Integer::toHexString).forEach(System.out::println);
			result = expr.intToMasks(mask);
			assertArrayEquals(expected, result);
		}
	}

	@Test
	public void testMasksToInt() {
		Method method = null;
		for (Method m : expr.getClass().getDeclaredMethods()) {
			if (m.getName().equals("masksToInt")
					&& (m.getModifiers() & Modifier.PUBLIC) != 0
					&& m.getReturnType().equals(int.class)
					&& (m.isVarArgs() || (m.getParameterCount() == 1
					&& m.getParameters()[0].getType().equals(int[].class)))) {
				method = m;
				break;
			}
		}
		assertNotNull(method);

		int[] b = new int[32];
		for (int i = 0; i < 32; i++) {
			b[i] = 1 << i;
		}
		int[][] args = {
			{},
			{b[0]},
			{b[5]},
			{b[0], b[1]},
			{b[8], b[10]},
			{b[21], b[15], b[31], b[10]},
			{b[11], b[3], b[5], b[16]},
			{b[8], b[12], b[17], b[30], b[28], b[15], b[6], b[21]},
			{b[3], b[3]},
		};
		int[] results = {
			0, b[0], b[5], b[0] | b[1], b[8] | b[10],
			b[21] | b[15] | b[31] | b[10],
			b[11] | b[3] | b[5] | b[16],
			b[8] | b[12] | b[17] | b[30] | b[28] | b[15] | b[6] | b[21],
			b[3] | b[3],
		};

		try {
			int[] arg;
			int expected, result;
			for (int i = 0; i <  args.length; i++) {
				arg = args[i];
				expected = results[i];
				result = (int) method.invoke(expr, arg);
				assertEquals(expected, result);
			}
		}
		catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testPrintf() {
		Method method = null;
		for (Method m : expr.getClass().getDeclaredMethods()) {
			if (m.getName().equals("printf")
					&& (m.getModifiers() & Modifier.PUBLIC) != 0
					&& m.getReturnType().equals(void.class)
					&& m.isVarArgs()) {
				method = m;
				break;
			}
		}
		assertNotNull(method);

		int[][] args = {
			{},
			{0},
			{-1},
			{1, 2, 3},
			{1, -1, 8, -3},
			{1024, 859, -3586887, 153847698, -3957663, -2456, 13},
		};

		try {
			for (int[] arg : args) {
				method.invoke(expr, arg);
			}
		}
		catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testAddIntegers4() {
		Integer a;
		int b;
		Integer result;

		a = null;
		b = 0;
		result = expr.addIntegers4(a, b);
		assertNull(result);

		a = 3;
		result = expr.addIntegers4(a, b);
		assertEquals(a, result);

		a = 8756;
		b = -3844;
		result = expr.addIntegers4(a, b);
		assertEquals((Integer) (a + b), result);
	}

	@Test
	public void testIsEqual3() {
		Integer[] as = {
			null,   0,     0,    1,    -1,     1,   -1,   1389,  684576, -756830, -18653867,
		};
		Integer[] bs = {
			 0,    null,   0,    1,    -1,    -1,    1,   83695, 684576, 756830,  -18653867,
		};
		boolean[] results = {
			false, false, true, true, true, false, false, false,  true,  false,   true,
		};

		Integer a, b;
		boolean expected, result;
		for (int i = 0; i < as.length; i++) {
			a = as[i];
			b = bs[i];
			expected = results[i];
			result = expr.isEqual3(a, b);
			assertEquals(expected, result);
		}
	}

	@Test
	public void testCreateMap() {
		final int[][] expected = {
			{1, 1, 1, 1, 1,  1, 1, 1, 1, 1,  1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1,  1, 1, 1, 1, 1,  1, 3, 3, 3, 3},
			{1, 1, 1, 1, 1,  1, 1, 1, 1, 1,  1, 3, 3, 3, 2},
			{1, 1, 1, 1, 1,  2, 1, 1, 1, 1,  1, 3, 3, 3, 3},
			{1, 1, 1, 1, 1,  1, 1, 1, 1, 1,  1, 1, 1, 1, 1},

			{1, 1, 1, 1, 1,  1, 1, 1, 1, 1,  4, 4, 4, 1, 1},
			{1, 1, 1, 1, 1,  1, 1, 1, 2, 1,  4, 4, 4, 1, 1},
			{1, 3, 3, 3, 3,  3, 1, 1, 1, 2,  4, 4, 4, 1, 1},
			{1, 3, 3, 3, 3,  3, 1, 1, 1, 1,  1, 1, 1, 1, 1},
			{1, 3, 3, 3, 3,  3, 1, 1, 1, 1,  1, 2, 1, 1, 1},

			{1, 1, 1, 1, 1,  1, 1, 1, 1, 1,  1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1,  1, 1, 1, 1, 1,  1, 1, 1, 1, 1},
			{1, 1, 1, 2, 1,  1, 4, 4, 4, 2,  1, 1, 1, 1, 1},
			{1, 4, 4, 4, 4,  4, 4, 4, 4, 1,  1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1,  1, 4, 4, 4, 1,  1, 3, 3, 1, 1},
		};
		int[][] map = expr.createMap();

		for (int i = 0; i < expected.length; i++) {
			assertArrayEquals(expected[i], map[i]);
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

	private int[] intToMasks(int mask) {
		int[] bitMasks = new int[32];
		int metaMask = 0x8000_0000;

		for (int i = 0; i < 32; i++) {
			bitMasks[i] = metaMask & mask;
			metaMask >>>= 1;
		}

		return bitMasks;
	}
}
