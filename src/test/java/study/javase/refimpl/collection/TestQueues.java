package study.javase.refimpl.collection;

import org.junit.Before;

public class TestQueues extends study.javase.collection.TestQueues {

	@Before
	public void init() {
		queues = new Queues();
	}

}
