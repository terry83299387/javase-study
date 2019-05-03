package study.javase.refimpl.references;

/**
 * 请实现一个“规范映射”型缓存，并实现基本的操作（存入、取出、清空）。
 * 
 * 规范映射（canonicalizing mapping）型缓存是指其中的数据如果还有其他地方正在使用，
 * 则不回收；而如果某条数据已经没有任何地方在使用，则应该尽快被回收。
 * 
 */
public class WeakRef<K, V> {

	/**
	 * 将一个对象放入缓存。
	 */
	public void cache(K key, V value) {
		// TODO your code goes here
	}

	/**
	 * 从缓存中取出对象，如果没有找到（之前没有缓存过，或者已被回收），返回 null。
	 */
	public V get(K key) {
		// TODO your code goes here
		return null;
	}

	/**
	 * 清空缓存。
	 */
	public void clear() {
		// TODO your code goes here
	}
}
