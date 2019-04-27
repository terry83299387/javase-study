package study.javase.string.regex;

import java.util.List;

public class RegExpression {

	/**
	 * 请统计一段 ASCII 文本中的单词个数。
	 * （考察预设字符类型“\w”的使用）
	 */
	public int wordCount(String text) {
		// TODO your code goes here
		return 0;
	}

	/**
	 * 请统计一段 ASCII 文本中连续数量大于等于 3 个的数字的出现次数。
	 * （考察预设字符类型“\d”的使用）
	 */
	public int moreThan3DigitalsCount(String text) {
		// TODO your code goes here
		return 0;
	}

	/**
	 * 请统计一段 ASCII 文本中不包含任何数字的单词数量。
	 * （考察预设字符类型“\D”的使用）
	 */
	public int noneDigitalCount(String text) {
		// TODO your code goes here
		return 0;
	}

	/**
	 * 请统计一段文本中有多少位置包含空白字符（同一个位置上的多个连续空白字符只算一个）
	 * （考察预设字符类型“\s”的使用）
	 */
	public int whitespacePositions(String text) {
		// TODO your code goes here
		return 0;
	}

	/**
	 * 请找出一段文本中符合以下条件的子串：以单词“I”开头，后面是可选的“do”、“don't”或“do not”，
	 * 再后面是“love”或“like”或“hate”，然后是 1 或多个其他单词，最后以句号或叹号结尾。
	 * 例如“I love Java.”、“I don't like coffee!”。
	 * （考察“|”操作符）
	 */
	public List<String> doILike(String text) {
		// TODO your code goes here
		return null;
	}

	/**
	 * 请找出一段文本中某个单词出现了 1 次以上的句子（句子以句号、叹号或问号结尾）。
	 * 例如：“This program is running within another program.”
	 * （考察反向引用）
	 */
	public List<String> duplicateWords(String text) {
		// TODO your code goes here
		return null;
	}

	/**
	 * 请找出单行单词数量小于等于 5 个的行。
	 * （考察 ^ 和 $）
	 */
	public List<String> shortLine(String text) {
		// TODO your code goes here
		return null;
	}

	/**
	 * TODO 环视
	 */

	/**
	 * TODO 量词（贪婪、惰性、占有）
	 */

	/**
	 * TODO flags
	 */

	/**
	 * TODO group
	 */

	/**
	 * TODO Matcher & MatchResult
	 */

	/**
	 * 请判断字符串 input 是否是一个十进制整数，即是否能够满足下面的某一条要求：
	 * (1) 全部字符都为数字。如“1234”、“01234”
	 * (2) 以正号或负号开头，后面的全部字符都为数字。如“+1234”、“-1234”
	 */
	public boolean isInteger(String input) {
		// TODO your code goes here
		return false;
	}

	/**
	 * 请判断字符串 input 是否是一个十六进制整数，即是否能够满足下面的某一条要求：
	 * (1) 以“0x”或“0X”开头，后面的字符为 0 ~ 9、a ~ f（或 A ~ F）。如“0x3a”、“0x003F”
	 * (2) 以正号或负号开头，后面的部分满足 (1) 的要求。如“+0x3a”、“-0x003F”
	 */
	public boolean isHexInteger(String input) {
		// TODO your code goes here
		return false;
	}

	/**
	 * 请判断字符串 input 是否是一个十进制小数，即是否能够满足下面的某一条要求：
	 * (1) 字符只能为数字、正/负号（+/-）和小数点（.）。正/负号和小数点最多出现一次，且正/负号
	 * 只能出现在开头，小数点不能出现在最后；正/负号后面不能立即是小数点。如“3.14”、“.25”、“-0.25”
	 * (2) 在 (1) 的基础上，后面加上“e/E”和一个可选的正/负号，再后面是 1 或多个数字。
	 * 如“.314e1”、“314e-2”、“-25E-2”
	 */
	public boolean isDigital(String input) {
		// TODO your code goes here
		return false;
	}

	/**
	 * 请判断字符串 input 是否是一个合法的 XML 标签（不考虑闭标签）。符合以下全部要求的字符串
	 * 是一个合法 XML 标签：
	 * (1) 以小于号（&lt;）开头，以大于号（&gt;）结尾；
	 * (2) 小于号后面立即跟着一个标签名，标签名中的字符全部由数字或英文字母组成，且不区分大小写；
	 * (3) 标签名后面可以有若干个属性，属性的格式有以下几种：
	 *     (a) 属性名。即仅有一个属性名，不包含属性值。例如“enabled”、“readonly”。
	 *     (b) 属性名="属性值"。属性值由双引号引起来
	 *     (c) 属性名='属性值'。属性值由单引号引起来
	 *     (d) 属性名=""。空值属性。
	 *     (e) 属性名=''。空值属性。
	 * (4) 属性名的命名要求与标签名一样。
	 * (5) 属性值可以是除了与包裹它们的引号之外的任意值，例如双引号引起来的属性值中不能有双引号，
	 * 单引号同理。但双引号中可以包含单引号、单引号中可以包含双引号
	 * (6) 标签名与属性之间、属性与属性之间可以有 1 或多个空白字符或换行符。
	 */
	public boolean isXmlTag(String input) {
		// TODO your code goes here
		return false;
	}
}
