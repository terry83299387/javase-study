package study.javase.refimpl.io;

import study.javase.assist.data.RandomPrimitiveValues;

public class DataStreamBasic extends study.javase.io.DataStreamBasic {

	@Override
	public RandomPrimitiveValues dataStream(RandomPrimitiveValues values) {
		// TODO Auto-generated method stub
		return super.dataStream(values);
	}

	@Override
	public RandomPrimitiveValues objectStream(RandomPrimitiveValues values) {
		// TODO Auto-generated method stub
		return super.objectStream(values);
	}

	@Override
	public String randomAccessFileStream(String file) {
		// TODO Auto-generated method stub
		return super.randomAccessFileStream(file);
	}


//	/*
//	 * need to be implemented.
//	 * 内部类 Data 提供了各基本类型和字符串的测试值，这些值可通过 getXxx() 方法来获取。
//	 * 例如 getInt() 方法返回一个整数（值是确定的，同一个 Data 对象每次返回的都是相同的整数）。
//	 * 
//	 * data 是一个 Data 对象。
//	 * (1) 请使用 DataOutputStream 将 data 中的数据写入一个字节数组。
//	 * (2) 使用 DataInputStream 从生成的字节数组中依次读取之前保存的值，然后与 data 中的原
//	 * 值比较，确保两者是相等的。
//	 */
//	public void dataStream() throws IOException {
//		System.out.println("------------ dataStream() begins");
//		Data data = new Data();
//		ByteArrayOutputStream bos = new ByteArrayOutputStream();
//		DataOutputStream dos = new DataOutputStream(bos);
//		dos.writeInt(data.getInt());
//		dos.writeByte(data.getByte());
//		dos.writeShort(data.getShort());
//		dos.writeDouble(data.getDouble());
//		dos.writeBoolean(data.getFalse());
//		dos.writeBoolean(data.getTrue());
//		dos.writeChar(data.getChar());
//		dos.writeFloat(data.getFloat());
//		dos.writeUTF(data.getString());
//		dos.writeLong(data.getLong());
//		dos.flush();
//
//		byte[] buf = bos.toByteArray();
//		ByteArrayInputStream bis = new ByteArrayInputStream(buf);
//		DataInputStream dis = new DataInputStream(bis);
//		assert dis.readInt() == data.getInt();
//		assert dis.readByte() == data.getByte();
//		assert dis.readShort() == data.getShort();
//		assert dis.readDouble() == data.getDouble();
//		assert dis.readBoolean() == data.getFalse();
//		assert dis.readBoolean() == data.getTrue();
//		assert dis.readChar() == data.getChar();
//		assert dis.readFloat() == data.getFloat();
//		assert dis.readUTF().equals(data.getString());
//		assert dis.readLong() == data.getLong();
//
//		System.out.println("------------ dataStream() ends");
//	}
//
//	/*
//	 * need to be implemented.
//	 */
//	public void objectStream() {
//		System.out.println("------------ objectStream() begins");
//		// TODO
//		System.out.println("------------ objectStream() ends");
//	}
//
//	/*
//	 * need to be implemented.
//	 */
//	public void randomAccessFileStream() {
//		System.out.println("------------ randomAccessFileStream() begins");
//
//		// TODO your code goes here
//
//		System.out.println("------------ randomAccessFileStream() ends");
//	}

}
