package study.javase.collection;

import org.junit.Before;
import org.junit.runner.RunWith;

import study.javase.assist.SkippedRunner;

@RunWith(SkippedRunner.class)
public class TestDeques {

	protected Deques deques;

	@Before
	public void init() {
		deques = new Deques();
	}

}
