package study.javase.refimpl.collection;

import org.junit.Before;

public class TestLagacyCollections extends study.javase.collection.TestLagacyCollections {

	@Before
	public void init() {
		lagacy = new LagacyCollections();
	}

}
