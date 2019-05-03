package study.javase.refimpl.io;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.util.function.Consumer;

import study.javase.assist.data.RandomPrimitiveValues;

public class ByteStreams {

	/**
	 * bytes 是一个 byte 数组。
	 * (1) 请使用 ByteArrayInputStream 从 bytes 中读出字节，并存入一个临时数组 temp。
	 * (2) 请将 temp 中的字节写入一个 ByteArrayOutputStream 对象 bos，完成后从 bos 中获取字节数组并返回。
	 * 
	 * 注意：请确保最终返回的数组与原数组是相等的（{@link java.util.Arrays#equals(byte[], byte[])}）
	 */
	public byte[] byteArrayStream(byte[] bytes) {
		// TODO your code goes here
		return null;
	}

	/**
	 * 参数 file 表示文件的路径，使用 FileInputStream 将指定文件 file 中的内容读出来，
	 * 用 FileOutputStream 将内容写到临时目录下的 xxx-copied.yyy 文件中（xxx 为 file
	 * 文件的文件名，yyy 为 file 文件的扩展名）。
	 */
	public void copyFile(String file) {
		// TODO your code goes here
	}

	/**
	 * in 和 out 是两个长度相等的字节数组，请使用两个线程 tin 和 tout，然后使用已连接的
	 * PipedInputStream 和 PipedOutputStream 将 in 中的字节复制到 out 中。
	 */
	public void pipedStream(final byte[] in, final byte[] out) {
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
	 * file 是一个文件的路径，bytes 为一个字节数组。
	 * 首先获取文件的输入字节流，并将 bytes 数组也包装为一个字节流，然后使用 SequenceInputStream
	 * 将两个字节流串起来，并将两者的内容依次复制到另一个字节数组中（先文件后字节数组），最后将结果数组
	 * 返回。
	 */
	public byte[] sequenceStream(String file, byte[] bytes) {
		// TODO your code goes here
		return null;
	}

	/**
	 * 请使用 BufferedInputStream 为 FileInputStream 提供缓冲功能，来完成与
	 * copyFile(String file) 相同的操作。
	 */
	public void bufferedStream(String file) {
		// TODO your code goes here
	}

	/**
	 * {@link study.javase.assist.data.RandomPrimitiveValues} 实例提供了随机的基本类型值，
	 * 请使用 PrintStream 将 values 中的值的字符串形式按照以下要求打印到输出流 dest 中：
	 * (1) 将 int、byte、short、long 依次打印在第一行，中间不要有空格
	 * (2) 将 char 打印在第二行
	 * (3) 将 double 和 float 依次打印在第三行，double 保留 11 位小数，float 保留 5 位小数，两个数字用逗号隔开
	 * (4) 将 bool 打印在第四行
	 * (5) 将 null 打印在第五行
	 * (6) 将 string 打印在最后一行（行末不要有换行符）
	 */
	public void printStream(OutputStream dest, RandomPrimitiveValues values) {
		// TODO your code goes here
	}

	/**
	 * data 是从服务端接收到的数据流，请将其中的全部内容读取到一个由字节数组充当的缓冲区中并返回。
	 * 读取时请注意：
	 * (1) 如果读取到的字节在 0x00 ~ 0x07 之间，说明这是一个控制字节，需要将其放回输入流中，并交由
	 * controller 处理。（controller 会将处理结果放回流中，因此待其返回后当前方法可继续读取）
	 * (2) 除此之外的其他值是普通字节，请原样放到缓冲区中。
	 * 
	 * 控制字节包括（这只是题目，不需要在意实际意义）：
	 *     0x00 忽略并丢弃下一个字节
	 *     0x01 将下一个字节的值翻倍（作为有符号数对待，且溢出时不做特殊处理）
	 *     0x02 将下一个字节的值减半
	 *     0x03 将下一个字节重复两次
	 *     0x04 将下一个字节重复四次
	 *     0x05 将后面两个字节的值相加（作为有符号数对待，且溢出时不做特殊处理）
	 *     0x06 将后面两个字节的值相减（作为有符号数对待，且溢出时不做特殊处理）
	 *     0x07 将后面两个字节的值异或
	 */
	public byte[] pushbackStream(InputStream data, Consumer<PushbackInputStream> controller) {
		// TODO your code goes here
		return null;
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
