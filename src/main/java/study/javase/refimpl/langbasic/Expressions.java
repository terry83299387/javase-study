package study.javase.refimpl.langbasic;

import java.util.Arrays;

public class Expressions extends study.javase.langbasic.Expressions {

	/**
	 * 请按照要求完成此方法。
	 * (1) 声明两个 int 变量 a 和 b
	 * (2) 将它们分别初始化为 15 和 20
	 * (3) 再声明一个 int 变量 c
	 * (4) 计算 a + b 的值，并将结果赋值给 c
	 * (5) 返回 c 的值
	 */
	public int addIntegers1() {
		int a = 15;
		int b = 20;
		int c;
		c = a + b;
		return c;
	}

	/**
	 * 请按照要求完成此方法。
	 * (1) 声明 int 变量 c
	 * (2) 计算 a + b 的值，并将结果赋值给 c
	 * (3) 返回 c 的值
	 */
	public int addIntegers2(int a, int b) {
		int c;
		c = a + b;
		return c;
	}

	/**
	 * 请按照要求完成此方法。
	 * (1) 计算 a + b 的值，并将结果赋值给 a
	 * (2) 返回 a 的值
	 */
	public int addIntegers3(int a, int b) {
		a = a + b; // or a += b;
		return a;
	}

	/**
	 * 请声明一个基本类型的变量 a，将其赋值为 -123，并返回 a。
	 * 在保证不丢失值的情况下（即其内存长度需要能够放得下 -123 这个值，下同），
	 * 请将 a 的类型声明为占用内存最小的类型。
	 */
	public Object fixedValue1() {
		byte a = -123;
		return a;
	}

	/**
	 * 请声明一个基本类型的变量 a，将其赋值为 32767，并返回 a。
	 * 在保证不丢失值的情况下，请将 a 的类型声明为占用内存最小的类型。
	 */
	public Object fixedValue2() {
		short a = 32767; // or char a = 32767;
		return a;
	}

	/**
	 * 请声明一个基本类型的变量 a，将其赋值为 PI 的近似值 3.14159，并返回 a。
	 * 在保证不丢失值的情况下，请将 a 的类型声明为占用内存最小的类型。
	 */
	public Object fixedValue3() {
		float a = 3.14159F;
		return a;
	}

	/**
	 * 请声明一个基本类型的变量 a，将其赋值为 PI 的近似值 3.141592654
	 * （比前一题更精确），并返回 a。
	 * 在保证不丢失值的情况下，请将 a 的类型声明为占用内存最小的类型。
	 */
	public Object fixedValue4() {
		double a = 3.141592654;
		return a;
	}

	/**
	 * 请声明一个基本类型的变量 a，将其赋值为 32768，并返回 a。
	 * 在保证不丢失值的情况下，请将 a 的类型声明为占用内存最小的类型。
	 * （考察 char 是无符号类型）
	 */
	public Object fixedValue5() {
		char a = 32768;
		return a;
	}

	/**
	 * 请声明一个基本类型的变量 a，将其赋值为字符“我”，并返回 a。
	 * 请将 a 声明为最适合的类型。
	 */
	public Object fixedValue6() {
		char a = '我';
		return a;
	}

	/**
	 * 请声明一个基本类型的变量 a，将其赋值为侏罗纪距今的时间
	 * （约 150,000,000 年），并返回 a。
	 * 在保证不丢失值的情况下，请将 a 的类型声明为占用内存最小的类型。
	 */
	public Object fixedValue7() {
		int a = 150_000_000;
		return a;
	}

	/**
	 * 请声明一个基本类型的变量 a，将其赋值为侏罗纪距今的时间的秒数
	 * （约 4,750,000,000,000,000 秒），并返回 a。
	 * 在保证不丢失值的情况下，请将 a 的类型声明为占用内存最小的类型。
	 */
	public Object fixedValue8() {
		long a = 4_750_000_000_000_000L;
		return a;
	}

	/**
	 * 请声明一个基本类型的变量 a，将其赋值为宇宙的可观测直径的米数
	 * （约 8,798,544,000,000,000,000,000,000 米），并返回 a。
	 * 在保证不丢失值的情况下，请将 a 的类型声明为占用内存最小的类型。
	 */
	public Object fixedValue9() {
		float a = 8.798544E24F;
		return a;
	}

	/**
	 * 请声明一个基本类型的变量 a，将其赋值为宇宙中的原子数量
	 * （约 10 的 80 次方个），并返回 a。
	 * 在保证不丢失值的情况下，请将 a 的类型声明为占用内存最小的类型。
	 */
	public Object fixedValue10() {
		double a = 1E80;
		return a;
	}

	/**
	 * 请声明一个基本类型的变量 a，将其赋值为 3 > 5 的结果，并返回 a。
	 */
	public Object fixedValue11() {
		boolean a = 3 > 5;
		return a;
	}

	/**
	 * a 的值为 0.1 + 0.2 计算的结果，b 的值为字面量 0.3。即 a 和 b 是用以下代码来赋值的：
	 * 
	 *     double a = 0.1 + 0.2;
	 *     double b = 0.3;
	 * 
	 * 请比较 a 和 b 的值是否相等，并返回比较结果。
	 */
	public boolean isEqual(double a, double b) {
		return a == b;
	}

	/**
	 * a 的值为程序对两个浮点数进行运算的结果，b 为两个浮点数在数学上进行相同运算得到的精确结果。
	 * 
	 * 由于浮点数存储的不精确性，a 和 b 并不一定严格相等，因此如果直接比较，那么 a == b 的结果将可能为 false。
	 * 为了解决这一问题，通常在比较两个浮点数是否相等时，会先计算它们的差值，当差值为 0 或者在一个很小的范围内
	 * 时，则认为两者是相等的，否则就认为它们不相等。
	 * 
	 * 请按照这种方式来比较 a 和 b，当两者的误差范围在 -0.01 和 0.01 之间时（-0.01 ≤ δ ≤ 0.01），则返回 true，
	 * 否则返回 false。
	 */
	public boolean isEqual2(double a, double b) {
		double δ = a - b;
		return δ <= 0.01 && δ >= -0.01;
	}

	/**
	 * num 是一个 int 类型的整数，请计算并返回其平方值。
	 * 注：为了防止结果溢出，应以 long 型来存储结果。
	 */
	public long square(int num) {
		long square = (long) num * (long) num;
		return square;
	}

	/**
	 * 请判断整数 n 是否满足以下条件：
	 * (1) 其绝对值是一个 5 位数
	 * (2) 能被 10 整除，或者能被 8 整除
	 * (3) 不能被 100 整除
	 * （考察关系运算、条件运算、取模）
	 */
	public boolean isWantedNumber(int n) {
		boolean first  = (n >= 10000 && n <= 99999) || (n >= -99999 && n <= -10000);
		boolean second = (n % 10 == 0) || (n % 8 == 0);
		boolean third  = n % 100 != 0;
		return first && second && third;
	}

	/**
	 * 替换加密是一种古老的加密方法。它是将字母表中的字母用表中的其他字母来替换，
	 * 以此形成不可读的密文的过程。
	 * 假设现在有密文 cipher，其中的每个字符 c 是由明文字符 t 和密码 p 采用
	 * 以下方法计算得到：c = t + p
	 * 现在请对密文 cipher 进行解密，还原出其明文并返回结果。
	 */
	public char[] decrypt(char[] cipher, short password) {
		if (cipher == null) return null;

		char[] clearText = new char[cipher.length];
		for (int i = 0; i < cipher.length; i++) {
			clearText[i] = (char) (cipher[i] - password);
		}

		return clearText;
	}

	/**
	 * 每个 int 整数包含 4 个字节，请将整数 i 中所包含的字节提取出来，放到一个
	 * byte 数组中并返回。
	 * 提取时请按照由高位字节到低位字节的顺序提取（大端字节序）。例如对于整数
	 * 0x12345678，返回的数组 b 中，b[0] ~ b[3] 分别为 0x12、0x34、0x56、0x78。
	 * （考察位运算、数组、强制转换、有符号数的符号位）
	 */
	public byte[] intToBytes(int i) {
		byte[] bytes = new byte[4];
		bytes[0] = (byte) (i >>> 24);
		bytes[1] = (byte) ((i >>> 16) & 0xFF);
		bytes[2] = (byte) ((i >>> 8) & 0xFF);
		bytes[3] = (byte) (i & 0xFF);
		return bytes;
	}

	/**
	 * 字节数组 bytes 是用 intToBytes(int) 方法从某个 int 整数中提取出来的，
	 * 请将其还原为原来的整数。
	 */
	public int bytesToInt(byte[] bytes) {
		if (bytes == null || bytes.length != 4) {
			throw new IllegalArgumentException("数组必须包含 4 个元素。");
		}

		int i = ((bytes[0] & 0xFF) << 24) | ((bytes[1] & 0xFF) << 16)
				| ((bytes[2] & 0xFF) << 8) | (bytes[3] & 0xFF);

		return i;
	}

	/**
	 * a 和 b 是两个整数，现在希望计算 a 除以 b 的商（a ÷ b），但是由于 Java 的
	 * 整数在整除时会对结果进行截断，从而影响结果的准确性。例如 6 / 4 的结果为 1，
	 * 而不是我们所期待的 1.5。
	 * 如果在相除之前先将 a 和 b 转换为 double 类型，再进行除法运算时将会以浮点数
	 * 的除法来进行，从而能够得到较为精确的结果。请按照此思路来计算 a 和 b 的商。
	 */
	public double integerDivision(int a, int b) {
		double result = (double) a / (double) b;
		return result;
	}

	/**
	 * 位掩码是一种常用的编程模式：由整数中的相应的位是否被设置来判断该位所代表的特性是否开启。
	 * 假设 match 函数可以用来对字符串进行模式匹配，为了提高灵活性，函数允许在调用时可以通过
	 * 一个包含位掩码的整数来对匹配过程进行设置。以 8 位整数为例，首先从左往右对每一位进行编
	 * 号，然后规定：
	 * (1) 第 1 位（最左边的二进制位）表示是否忽略大小写
	 * (2) 第 2 位表示在找到一个匹配时是否停止（仅匹配第一个，还是找出全部匹配）
	 * (3) ...
	 * 那么，当需要忽略大小写，并且只希望找到第一个匹配时，可以将掩码的第 1、第 2 位设置为 1，
	 * 即 1100 0000；如果需要忽略大小写，并且希望找出全部匹配时，可以指定掩码为 1000 0000；
	 * 以此类推。
	 * 
	 * 掩码 1100 0000 包含两个掩码分量：1000 0000 和 0100 0000。对每个掩码分量因此进行
	 * 按位或运算可得到掩码。如 1000 0000 | 0100 0000 可得到掩码 1100 0000。
	 * 
	 * 请实现方法，将掩码 mask 中的每一个掩码分量提取出来，放到一个 int 数组中，数组中的第
	 * n 项是掩码 mask 的第 n 个掩码分量（从左往右）。例如前面的例子 1100 0000，返回的数组
	 * a 中，a[0] 为 1000 0000、a[1] 为 0100 0000、其他全为 0。
	 * 
	 * 注意：Java 的 int 为 32 位。
	 * （考察位运算、强制转换）
	 */
	public int[] intToMasks(int mask) {
		int[] bitMasks = new int[32];
		int metaMask = 0x8000_0000;

		for (int i = 0; i < 32; i++) {
			bitMasks[i] = metaMask & mask;
			metaMask >>>= 1;
		}

		return bitMasks;
	}

	/**
	 * 为了方便对 match 函数（见前一题中的例子）的调用，程序员 Code Farmer 决定写一个
	 * 辅助函数，可以将任意数量的掩码分量（每个掩码分量为一个 int 类型的整数）组合成掩码
	 * （假设掩码分量的数量不会超过整数所包含的位数）。
	 * 
	 * 注意：本题需要你来设计方法的参数列表，使得方法调用可以尽可能地方便。
	 * （考察位运算、varargs）
	 */
	public int masksToInt(int... bitMasks) {
		int mask = 0;
		for (int bitMask : bitMasks) {
			mask |= bitMask;
		}
		return mask;
	}

	/**
	 * {@link java.lang.System#out} 是一个 {@link java.io.PrintStream} 实例，它的
	 * printf() 方法可以接受一个格式化字符串以及任意数量的额外参数。请仿照 printf() 写一个
	 * 类似的方法，利用 {@link java.lang.System#out} 的 print() 方法将任意数量的 int
	 * 参数打印出来，打印时用空格将每个参数隔开，参数全部打印完之后再额外打印一个换行符。
	 * 下面是一些调用的例子：
	 * 
	 * □ 无参数直接调用 printf()：只打印一个空行；
	 * □ printf(1)：打印数字“1”和一个换行符（\n）；
	 * □ printf(1, 2)：打印“1 2”和一个换行符；
	 * □ printf(1, 2, -3)： 打印“1 2 -3”和一个换行符；
	 * □ ……
	 * □ printf("abc")：「错误」非法调用！
	 * □ printf(3.2)：「错误」非法调用！
	 * 
	 * （考察 varargs）
	 */
	public void printf(int... nums) {
		for (int num : nums) {
			System.out.print(num);
			System.out.print(" ");
		}
		System.out.println();
	}

	/**
	 * 参数 a 和 b 都是整数，但 a 的类型是 int 的包装类型 Integer。
	 * 请完成下面的方法，计算并返回 a 和 b 的和。
	 * 注：如果因为某种原因导致计算无法完成，请返回 null。
	 * （考察自动拆箱和装箱；以及 a 有可能为 null 的问题）
	 */
	public Integer addIntegers4(Integer a, int b) {
		if (a == null) return null;
		return a + b;
	}

	/**
	 * 请比较两个 Integer 类型的参数是否相等。
	 * （考察 equals 方法、null 的问题）
	 */
	public boolean isEqual3(Integer a, Integer b) {
		if (a == null) {
			return b == null;
		}
		return a.equals(b);
	}

	/**
	 * 某 2D 游戏中的地图使用一个二维的 int 数组来表示，数组中的每个元素代表一个单元格，
	 * 元素的值为该单元格所在位置的地形。共有以下几种地形：1：草地、2：石块、3：树木、
	 * 4：水。
	 * 请初始化一个 15 × 15（15 行 15 列）的地图，并按照以下要求设置每个单元格的值：
	 * （以下用 [x, y] 表示第 x 行第 y 列，用 [x1~x2, y1~y2] 表示第 x1 到第 x2
	 * 行的第 y1 到第 y2 列。且 x、y、x1、x2、y1、y2 都是从 0 开始的）
	 * 
	 * (1) [2, 14]、[3, 5]、[6, 8]、[7, 9]、[9, 11]、[12, 3]、[12, 9] 是石块；
	 * (2) [1~3, 11~13]、[1, 14]、[3, 14]、[7~9, 1~5]、[14, 11~12] 是树木；
	 * (3) [5~7, 10~12]、[12~14, 6~8]、[13, 1~5] 是水；
	 * (4) 其余全是草地。
	 * 
	 * （考察二维数组）
	 */
	public int[][] createMap() {
		int[][] map = new int[15][15];
		for (int[] row : map) {
			Arrays.fill(row, 1);
		}

		int r, c;
		int[] stoneRows = {2,  3, 6, 7, 9, 12, 12};
		int[] stoneCols = {14, 5, 8, 9, 11, 3, 9};
		for (int i = 0; i < stoneRows.length; i++) {
			r = stoneRows[i];
			c = stoneCols[i];
			map[r][c] = 2;
		}

		int[] treeRows = {
			1,  1,  1,  2,  2,  2,  3,  3,  3,  1,  3,
			7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9,
			14, 14,
		};
		int[] treeCols = {
			11, 12, 13, 11, 12, 13, 11, 12, 13, 14, 14,
			1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5,
			11, 12,
		};
		for (int i = 0; i < treeRows.length; i++) {
			r = treeRows[i];
			c = treeCols[i];
			map[r][c] = 3;
		}

		int[] waterRows = {
			5,  5,  5,  6,  6,  6,  7,  7,  7, 
			12, 12, 12, 13, 13, 13, 14, 14, 14,
			13, 13, 13, 13, 13,
		};
		int[] waterCols = {
			10, 11, 12, 10, 11, 12, 10, 11, 12,
			6,  7,  8,  6,  7,  8,  6,  7,  8,
			1,  2,  3,  4,  5,
		};
		for (int i = 0; i < waterRows.length; i++) {
			r = waterRows[i];
			c = waterCols[i];
			map[r][c] = 4;
		}

		/*
		 * 或者声明后直接初始化：
		 * int[][] map = {
		 * {1, 1, 1, 1, 1,  1, 1, 1, 1, 1,  1, 1, 1, 1, 1},
		 * {1, 1, 1, 1, 1,  1, 1, 1, 1, 1,  1, 3, 3, 3, 3},
		 * {1, 1, 1, 1, 1,  1, 1, 1, 1, 1,  1, 3, 3, 3, 2},
		 * {1, 1, 1, 1, 1,  2, 1, 1, 1, 1,  1, 3, 3, 3, 3},
		 * {1, 1, 1, 1, 1,  1, 1, 1, 1, 1,  1, 1, 1, 1, 1},

		 * {1, 1, 1, 1, 1,  1, 1, 1, 1, 1,  4, 4, 4, 1, 1},
		 * {1, 1, 1, 1, 1,  1, 1, 1, 2, 1,  4, 4, 4, 1, 1},
		 * {1, 3, 3, 3, 3,  3, 1, 1, 1, 2,  4, 4, 4, 1, 1},
		 * {1, 3, 3, 3, 3,  3, 1, 1, 1, 1,  1, 1, 1, 1, 1},
		 * {1, 3, 3, 3, 3,  3, 1, 1, 1, 1,  1, 2, 1, 1, 1},

		 * {1, 1, 1, 1, 1,  1, 1, 1, 1, 1,  1, 1, 1, 1, 1},
		 * {1, 1, 1, 1, 1,  1, 1, 1, 1, 1,  1, 1, 1, 1, 1},
		 * {1, 1, 1, 2, 1,  1, 4, 4, 4, 2,  1, 1, 1, 1, 1},
		 * {1, 4, 4, 4, 4,  4, 4, 4, 4, 1,  1, 1, 1, 1, 1},
		 * {1, 1, 1, 1, 1,  1, 4, 4, 4, 1,  1, 3, 3, 1, 1},
		 * };
		 */

		return map;
	}

	/**
	 * TODO 数组、自动拆箱装箱、varargs
	 * 一元运算符：+ - ++ -- ~ !
	 * 强制转换：(基本类型)、(引用类型)、(引用类型 & 接口类型...)
	 * 乘法运算符：/ * %
	 * 加法运算符：+ -
	 * 移位运算符：<< >> >>>
	 * 关系运算符：< > <= >= instanceof
	 * 相等运算符：== !=
	 * 位和逻辑运算符：& | ^
	 * 条件运算符：&& || ?:
	 * 赋值运算符：= *= += -= /= %= <<= >>= >>>= &= |= ^=
	 * Lambda：->
	 * 括号：()
	 */
}
