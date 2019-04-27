package study.javase.assist.data;

import java.io.CharArrayWriter;
import java.io.Serializable;
import java.util.Random;

public class RandomPrimitiveValues implements Serializable {
	private static final long serialVersionUID = -5171183335426866556L;

	private int intVal;
	private byte byteVal;
	private short shortVal;
	private char charVal;
	private long longVal;
	private double doubleVal;
	private float floatVal;
	private boolean boolVal;
	private Object nullVal;
	private String string;

	public static RandomPrimitiveValues random() {
		Random rnd = new Random();
		RandomPrimitiveValues rpv = new RandomPrimitiveValues();
		rpv.intVal = rnd.nextInt();
		rpv.byteVal = (byte) rnd.nextInt();
		rpv.shortVal = (short) rnd.nextInt();
		rpv.charVal = (char) (rnd.nextInt(0xFFFF - 0x20) + 0x20);
		rpv.longVal = rnd.nextLong();
		rpv.doubleVal = rnd.nextDouble();
		rpv.floatVal = rnd.nextFloat();
		rpv.boolVal = rnd.nextBoolean();
		rpv.nullVal = null;

		CharArrayWriter caw = new CharArrayWriter();
		rnd.ints(rnd.nextInt(100)).forEach(e -> caw.write(e));
		rpv.string = caw.toString();

		return rpv;
	}

	public int getIntVal() {
		return intVal;
	}

	public void setIntVal(int intVal) {
		this.intVal = intVal;
	}

	public byte getByteVal() {
		return byteVal;
	}

	public void setByteVal(byte byteVal) {
		this.byteVal = byteVal;
	}

	public short getShortVal() {
		return shortVal;
	}

	public void setShortVal(short shortVal) {
		this.shortVal = shortVal;
	}

	public char getCharVal() {
		return charVal;
	}

	public void setCharVal(char charVal) {
		this.charVal = charVal;
	}

	public long getLongVal() {
		return longVal;
	}

	public void setLongVal(long longVal) {
		this.longVal = longVal;
	}

	public double getDoubleVal() {
		return doubleVal;
	}

	public void setDoubleVal(double doubleVal) {
		this.doubleVal = doubleVal;
	}

	public float getFloatVal() {
		return floatVal;
	}

	public void setFloatVal(float floatVal) {
		this.floatVal = floatVal;
	}

	public boolean isBoolVal() {
		return boolVal;
	}

	public void setBoolVal(boolean boolVal) {
		this.boolVal = boolVal;
	}

	public Object getNullVal() {
		return nullVal;
	}

	public void setNullVal(Object nullVal) {
		this.nullVal = nullVal;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	@Override
	public boolean equals(Object v) {
		// TODO
		return false;
	}

	@Override
	public int hashCode() {
		// TODO
		return -1;
	}
}
