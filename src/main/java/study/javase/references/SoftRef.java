package study.javase.references;

/**
 * 请实现一个内存敏感型缓存，并实现基本的操作（存入、取出、清空）。
 * 
 * 内存敏感型缓存是指它所缓存的数据在内存充足时并不会积极地清理，而当内存不足时，
 * 会按照某种顺序（例如最近最少使用）来删除部分或全部缓存的数据。
 * 
 */
public class SoftRef<K, V> {

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
