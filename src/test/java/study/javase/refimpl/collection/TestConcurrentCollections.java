package study.javase.refimpl.collection;

import org.junit.Before;

public class TestConcurrentCollections extends study.javase.collection.TestConcurrentCollections {

	@Before
	public void init() {
		cc = new ConcurrentCollections();
	}

}
