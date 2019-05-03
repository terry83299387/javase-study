package study.javase.refimpl.io;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackReader;
import java.io.Writer;
import java.util.function.Consumer;

import study.javase.assist.data.RandomPrimitiveValues;

public class CharStreams {

	/**
	 * chars 是一个随机生成的字符数组，
	 * (1) 请使用 CharArrayReader 从 chars 中读出字符，并存入一个临时数组 temp。
	 * (2) 请将 temp 中的字节写入一个 CharArrayWriter 对象 caw，完成后从 caw 中获取字符数组并返回。
	 * 
	 * 注意：请确保最终返回的数组与原数组是相等的（{@link java.util.Arrays#equals(char[], char[])}）
	 */
	public char[] charArrayStream(char[] chars) {
		// TODO your code goes here
		return null;
	}

	/**
	 * (1) 请使用 InputStreamReader 从输入流 input 中读取字节，并使用参数 inputCharset 所指定的字符编码
	 * 将字节转换为字符；
	 * (2) 将读取到的字符按照 outputCharset 所指定的字符串编码转换为字节，并写入输出流 output。
	 */
	public void byteCharStream(InputStream input, String inputCharset,
			OutputStream output, String outputCharset) {
		// TODO your code goes here
	}

	/**
	 * 参数 file 是一个文本文件的路径，文件内容的字符编码由参数 charset 指定。
	 * 请使用 FileReader 将文件中的文本读出来，然后写到临时目录下的 xxx-copied.txt 文件中（xxx 为 file
	 * 文件的文件名）。
	 */
	public void copyTextFile(String file, String charset) {
	}

	/**
	 * in 和 out 是两个长度相等的字符数组，请使用两个线程 tin 和 tout，然后使用已连接的
	 * PipedReader 和 PipedWriter 将 in 中的字节复制到 out 中。
	 */
	public void pipedStream(final char[] in, final char[] out) {
		// TODO do some initializing here

		Thread tin = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO your code goes here
			}
		});

		Thread tout = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO your code goes here
			}
		});

		tin.start();
		tout.start();
		try {
			// 等待 1 分钟，等两个线程退出
			tin.join(60000L);
			tout.join(10L);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 请使用 StringReader 从参数 in 中读取字符，并将读取到的字符写入一个 StringWriter，sw。
	 * 然后从 sw 中获取字符串并返回。
	 */
	public String stringStream(String in) {
		// TODO your code goes here
		return null;
	}
	
	/**
	 * 请使用 BufferedReader 为 FileReader 提供缓冲功能，实现与
	 * copyTextFile(String file, String charset) 相同的功能。
	 */
	public void bufferedStream(String file, String charset) {
		// TODO your code goes here
	}

	/**
	 * data 是从服务端接收到的由字符流（已转换为字节形式），请将其中的全部字符读取到一个字符数组中并返回。
	 * 读取时请注意：
	 * (1) 如果读取到的字符为“\”，说明下一个是控制字符，需要将其放回，并交由 controller 处理。
	 * （controller 会将处理结果放回，因此待其返回后当前方法可继续读取）
	 * (2) 除此之外的其他字符是普通字符，请原样放到结果数组中。
	 * 
	 * 控制字符包括（这只是题目，不需要在意实际意义）：
	 *     \\ 代表一个反斜线字符
	 *     \{n} 将下一个字符重复 n 次，n 为一个正整数。例如 \3 表示下一个字符重复 3 次
	 *     \d 删除或跳过下一个字符
	 *     \s 将后面两个字符交换顺序
	 */
	public char[] pushbackStream(InputStream data, Consumer<PushbackReader> controller) {
		// TODO your code goes here
		return null;
	}

	/**
	 * {@link study.javase.assist.data.RandomPrimitiveValues} 实例提供了随机的基本类型值，
	 * 请使用 PrintWriter 将 values 中的值的字符串形式按照以下要求打印到 dest 中：
	 * (1) 将 int、byte、short、long 依次打印在第一行，中间不要有空格
	 * (2) 将 char 打印在第二行
	 * (3) 将 double 和 float 依次打印在第三行，double 保留 11 位小数，float 保留 5 位小数，两个数字用逗号隔开
	 * (4) 将 bool 打印在第四行
	 * (5) 将 null 打印在第五行
	 * (6) 将 string 打印在最后一行（行末不要有换行符）
	 */
	public void printStream(Writer dest, RandomPrimitiveValues values) {
		// TODO your code goes here
	}

	/*
//	 * need to be implemented.
//	 * chars 是一个随机生成的字符数组，请使用 CharArrayReader 从 chars 中读出字符，并打印出来。
//	 */
//	public void charArrayStream() throws IOException {
//		System.out.println("------------ charArrayStream() begins");
//		char[] chars = generateRandomChars(100);
//		for (char c : chars) {
//			System.out.printf("%c ", c);
//		}
//		System.out.println();
//
//		// TODO your code goes here
//		CharArrayReader car = new CharArrayReader(chars);
//		int c;
//		while ((c = car.read()) != -1) {
//			System.out.printf("%c ", c);
//		}
//		System.out.println();
//
//		System.out.println("------------ charArrayStream() ends");
//	}
//
//	/*
//	 * need to be implemented.
//	 */
//	public void byteCharStream() {
//		System.out.println("------------ byteCharStream() begins");
//		// TODO 
//		System.out.println("------------ byteCharStream() ends");
//	}
//
//	/*
//	 * need to be implemented.
//	 * 请使用 FileReader 从指定的文本文件中读出里面的字符，并打印到屏幕上。
//	 */
//	public void fileStream(String file) throws IOException {
//		System.out.println("------------ fileStream() begins");
//
//		// TODO your code goes here
//		try (FileReader fr = new FileReader(file)) {
//			int c;
//			while ((c = fr.read()) != -1) {
//				System.out.print((char) c);
//			}
//		}
//
//		System.out.println("------------ fileStream() ends");
//	}
//
//	/*
//	 * need to be implemented.
//	 */
//	public void pipedStream() {
//		System.out.println("------------ pipedStream() begins");
//		// TODO
//		System.out.println("------------ pipedStream() ends");
//	}
//
//	/*
//	 * need to be implemented.
//	 */
//	public void stringStream() {
//		System.out.println("------------ stringStream() begins");
//		// TODO
//		System.out.println("------------ stringStream() ends");
//	}
//	
//	/*
//	 * need to be implemented.
//	 * 请使用 BufferedReader 为 FileReader 提供缓冲功能，实现与 fileStream() 相同的功能。
//	 */
//	public void bufferedStream(String file) throws IOException {
//		System.out.println("------------ bufferedStream() begins");
//
//		// TODO your code goes here
//		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//			int c;
//			while ((c = br.read()) != -1) {
//				System.out.print((char) c);
//			}
//		}
//
//		System.out.println("------------ bufferedStream() ends");
//	}
//	
//	/*
//	 * need to be implemented.
//	 */
//	public void lineNumberStream() {
//		System.out.println("------------ lineNumberStream() begins");
//		// TODO
//		System.out.println("------------ lineNumberStream() ends");
//	}
//	
//	/*
//	 * need to be implemented.
//	 */
//	public void pushbackStream() {
//		System.out.println("------------ pushbackStream() begins");
//		// TODO
//		System.out.println("------------ pushbackStream() ends");
//	}
//	
//	/*
//	 * need to be implemented.
//	 */
//	public void printStream() {
//		System.out.println("------------ printStream() begins");
//		// TODO
//		System.out.println("------------ printStream() ends");
//	}

}
