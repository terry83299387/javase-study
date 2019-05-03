package study.javase.refimpl.references;

/**
 * Document 是一个表示文档的类，一个文档对象中包括文档内容（content）和一个打印机（Printer 对象）。
 * 
 * Printer 是一个稀缺资源，因此当用完后应尽快释放（关闭）。通过调用 Printer.close() 方法可以关闭
 * 当前的打印机对象。
 * 
 * 请实现一个能够自动释放 Document 对象中所包含的 Printer 资源的类。用户可以使用 register 注册一个
 * Document 对象，当 Document 对象不再使用时，应能够自动关闭它所持有的打印机对象。
 *
 */
public class PhantomRef {

	/**
	 * 注册一个 Document 对象，注册后，它所持有的 Printer 对象会在 Document 对象被回收时自动关闭。
	 */
	public void register(Document doc) {
		// TODO your code goes here
	}
}
