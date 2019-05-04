package study.javase.assist;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class SkippedRunner extends BlockJUnit4ClassRunner {
	private boolean needTest;

	public SkippedRunner(Class<?> clazz) throws InitializationError {
		super(clazz);
		needTest = Configurations.needTest(clazz);
	}

	@Override
	public void run(final RunNotifier notifier) {
		if (needTest) {
			super.run(notifier);
		}
		else {
			notifier.fireTestIgnored(getDescription());
		}
	}

}
