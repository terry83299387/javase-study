package study.javase.collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import study.javase.assist.SkippedRunner;

@RunWith(SkippedRunner.class)
public class TestLists {
	protected Lists lists;

	@Before
	public void init() {
		lists = new Lists();
	}

	@Test
	public void testReadPhoneNumbers() {
		System.out.println("testReadPhoneNumbers");
	}
}
