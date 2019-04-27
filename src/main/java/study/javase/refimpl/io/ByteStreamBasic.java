package study.javase.refimpl.io;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.util.function.Consumer;

import study.javase.assist.data.RandomPrimitiveValues;

public class ByteStreamBasic extends study.javase.io.ByteStreamBasic {

	@Override
	public byte[] byteArrayStream(byte[] bytes) {
		// TODO Auto-generated method stub
		return super.byteArrayStream(bytes);
	}

	@Override
	public void copyFile(String file) {
		// TODO Auto-generated method stub
		super.copyFile(file);
	}

	@Override
	public void pipedStream(byte[] in, byte[] out) {
		// TODO Auto-generated method stub
		super.pipedStream(in, out);
	}

	@Override
	public byte[] sequenceStream(String file, byte[] bytes) {
		// TODO Auto-generated method stub
		return super.sequenceStream(file, bytes);
	}

	@Override
	public void bufferedStream(String file) {
		// TODO Auto-generated method stub
		super.bufferedStream(file);
	}

	@Override
	public void printStream(OutputStream dest, RandomPrimitiveValues values) {
		// TODO Auto-generated method stub
		super.printStream(dest, values);
	}

	@Override
	public byte[] pushbackStream(InputStream data, Consumer<PushbackInputStream> controller) {
		// TODO Auto-generated method stub
		return super.pushbackStream(data, controller);
	}
	

//	/**
//	 * need to be implemented.
//	 * 
//	 * bytes 是一个 byte 数组。
//	 * (1) 请使用 ByteArrayInputStream 从 bytes 中读出字节，并存入一个临时数组 temp。
//	 * (2) 请将 temp 中的字节写入一个 ByteArrayOutputStream 对象 bos，完成后从 bos 中获取并返回已写入的字节数组。
//	 * 
//	 * 注意：请确保最终返回的数组与原数组是相等的（{@link Arrays#equals(byte[], byte[])}）
//	 */
//	public void byteArrayStream(byte[] bytes) throws IOException {
//		byte[] buf = this.generateRandomData();
//		for (byte b : buf) {
//			System.out.printf("%s ", Integer.toHexString(b & 0xFF));
//		}
//		System.out.println();
//
//		// use ByteArrayInputStream to wrap and read bytes of buf.
//		InputStream is = new ByteArrayInputStream(buf);
//		int b;
//		while ((b = is.read()) != -1) {
//			System.out.printf("%s ", Integer.toHexString(b));
//		}
//		System.out.println();
//
//		// write bytes of buf to a ByteArrayOutputStream.
//		ByteArrayOutputStream bos = new ByteArrayOutputStream();
//		for (byte b2 : buf) {
//			bos.write(b2);
//		}
//		boolean equal = Arrays.equals(buf, bos.toByteArray());
//		assert equal;
////		System.out.println(equal ? "equal" : "not equal");
//	}
//
//	/*
//	 * need to be implemented.
//	 * src 参数是源文件的路径，用 FileInputStream 将内容读取出来，
//	 * 然后写入 dest 参数指定的目的文件，实现文件的拷贝。
//	 */
//	public void copyFile(String src, String dest) throws IOException {
//		System.out.println("------------ copyFile() begins");
//		System.out.printf("source file: %s, destination file: %s%n", src, dest);
//		// TODO your code goes here
//		try (FileInputStream fis = new FileInputStream(src);
//				FileOutputStream fos = new FileOutputStream(dest)) {
//			byte[] buf = new byte[1024];
//			int len;
//			while ((len = fis.read(buf)) != -1) {
//				fos.write(buf, 0, len);
//			}
//		}
//
//		System.out.println("------------ copyFile() ends");
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
//	public void sequenceStream() {
//		System.out.println("------------ sequenceStream() begins");
//		// TODO
//		System.out.println("------------ sequenceStream() ends");
//	}
//
//	/*
//	 * need to be implemented.
//	 * 使用 BufferedInputStream 为 FileInputStream 提供缓冲功能，来完成与 copyFile() 相同的操作。
//	 */
//	public void bufferedStream(String src, String dest) throws FileNotFoundException, IOException {
//		System.out.println("------------ bufferedStream() begins");
//		// TODO your code goes here
//		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
//				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {
//			byte[] buf = new byte[1024];
//			int len;
//			while ((len = bis.read(buf)) != -1) {
//				bos.write(buf, 0, len);
//			}
//		}
//
//		System.out.println("------------ bufferedStream() ends");
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
//
//	/*
//	 * need to be implemented.
//	 */
//	public void pushbackStream() {
//		System.out.println("------------ pushbackStream() begins");
//		// TODO
//		System.out.println("------------ pushbackStream() ends");
//	}

}
