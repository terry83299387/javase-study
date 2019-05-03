package study.javase.assist.data;

import java.util.Random;

public class RandomValueGenerator {
	private Random rnd = new Random();

	public byte[] randomBytes() {
		return randomBytes(1, 100);
	}

	public byte[] randomBytes(int maxLen) {
		return randomBytes(1, maxLen);
	}

	public byte[] randomBytes(int minLen, int maxLen) {
		byte[] bytes = new byte[rnd.nextInt(maxLen - minLen) + minLen];
		rnd.nextBytes(bytes);
		return bytes;
	}

	public char[] randomChars() {
		return randomChars(1, 100);
	}

	public char[] randomChars(int maxLen) {
		return randomChars(1, maxLen);
	}

	public char[] randomChars(int minLen, int maxLen) {
		int len = rnd.nextInt(maxLen - minLen) + minLen;
		char[] chars = new char[len];

		for (int i = 0; i < len; i++) {
			chars[i] = (char) (rnd.nextInt(0xFFFF));
		}

		return chars;
	}

	public String randomString() {
		return randomString(1, 100);
	}

	public String randomString(int maxLen) {
		return randomString(1, maxLen);
	}

	public String randomString(int minLen, int maxLen) {
		char[] chars = randomChars(minLen, maxLen);
		return new String(chars);
	}
}
