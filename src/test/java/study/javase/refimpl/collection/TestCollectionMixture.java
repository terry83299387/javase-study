package study.javase.refimpl.collection;

import org.junit.Before;

public class TestCollectionMixture extends study.javase.collection.TestCollectionMixture {

	@Before
	public void init() {
		mixture = new CollectionMixture();
	}

}
