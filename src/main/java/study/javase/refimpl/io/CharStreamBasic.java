package study.javase.refimpl.io;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackReader;
import java.io.Writer;
import java.util.function.Consumer;

import study.javase.assist.data.RandomPrimitiveValues;

public class CharStreamBasic extends study.javase.io.CharStreamBasic {

	@Override
	public char[] charArrayStream(char[] chars) {
		// TODO Auto-generated method stub
		return super.charArrayStream(chars);
	}

	@Override
	public void byteCharStream(InputStream input, String inputCharset, OutputStream output, String outputCharset) {
		// TODO Auto-generated method stub
		super.byteCharStream(input, inputCharset, output, outputCharset);
	}

	@Override
	public void copyTextFile(String file, String charset) {
		// TODO Auto-generated method stub
		super.copyTextFile(file, charset);
	}

	@Override
	public void pipedStream(char[] in, char[] out) {
		// TODO Auto-generated method stub
		super.pipedStream(in, out);
	}

	@Override
	public String stringStream(String in) {
		// TODO Auto-generated method stub
		return super.stringStream(in);
	}

	@Override
	public void bufferedStream(String file, String charset) {
		// TODO Auto-generated method stub
		super.bufferedStream(file, charset);
	}

	@Override
	public char[] pushbackStream(InputStream data, Consumer<PushbackReader> controller) {
		// TODO Auto-generated method stub
		return super.pushbackStream(data, controller);
	}

	@Override
	public void printStream(Writer dest, RandomPrimitiveValues values) {
		// TODO Auto-generated method stub
		super.printStream(dest, values);
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
