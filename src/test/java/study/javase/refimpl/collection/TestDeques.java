package study.javase.refimpl.collection;

import org.junit.Before;

public class TestDeques extends study.javase.collection.TestDeques {

	@Before
	public void init() {
		deques = new Deques();
	}

}
