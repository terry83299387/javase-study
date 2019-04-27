package study.javase.io;

import study.javase.assist.data.RandomPrimitiveValues;

public class DataStreamBasic {

	/**
	 * {@link study.javase.assist.data.RandomPrimitiveValues} 实例提供了随机的基本类型值。
	 * 
	 * (1) 请使用 DataOutputStream 将 data 中的数据写入一个临时文件。
	 * (2) 新建一个 RandomPrimitiveValues 对象 newValue，使用 DataInputStream 从生成的临时
	 * 文件中依次读取之前保存的值，并依次设置到 newValue 中。
	 * (3) 返回 newValue。
	 */
	public RandomPrimitiveValues dataStream(RandomPrimitiveValues values) {
		// TODO your code goes here
		return null;
	}

	/**
	 * {@link study.javase.assist.data.RandomPrimitiveValues} 对象是可序列化的。请
	 * 使用 ObjectOutputStream 将参数 values 序列化并写到一个临时文件中，然后使用
	 * ObjectInputStream 将其重新读取出来（反序列化），并将反序列化的结果返回。
	 */
	public RandomPrimitiveValues objectStream(RandomPrimitiveValues values) {
		// TODO your code goes here
		return null;
	}

	/**
	 * 以随机访问的方式打开文件 file。依次进行以下操作：
	 * (1) 读取文件的第一个字节，判断它是否为0
	 * (2) 如果不为0，则从第 0x36 个字节的位置（相对于文件开头的偏移）读取该位置上的一个 int
	 * (3) 如果为0，则从第 0x42 个字节的位置上读取一个 float
	 * (4) 无论前一步的结果如何，都在其结果位置处后退 0x1C 个字节，然后写入一个 double 值 47.3583346
	 * (5) 将文件的长度设置为 0x400，然后在文件的最后写入一个 long，值为 -1
	 * (6) 返回 (2) 或 (3) 中读取到的 int 或 float 的字符串形式
	 */
	public String randomAccessFileStream(String file) {
		// TODO your code goes here
		return null;
	}

}
