package study.javase.refimpl.collection;

import org.junit.Before;

public class TestLists extends study.javase.collection.TestLists {

	@Before
	public void init() {
		lists = new Lists();
	}
}
