package study.javase.assist;

import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public final class Configurations {

	private static final String PACKAGE_PREFIX = "study.javase.";
	private static final String REFIMPL_PACKAGE_PREFIX = "study.javase.refimpl.";

	private static final Properties config = new Properties();
	private static final Set<String> ignorePackages = new HashSet<>();

	static {
		try (InputStream is = Configurations.class.getResourceAsStream("/config.ini")) {
			config.load(is);
			String ignorePkgStr = config.getProperty("ignore_pkg");
			if (ignorePkgStr != null && ignorePkgStr.length() > 0) {
				String[] ignorePkgs = (PACKAGE_PREFIX + ignorePkgStr).replace(":", ":" + PACKAGE_PREFIX).split(":");
				ignorePackages.addAll(Arrays.asList(ignorePkgs));
			}

			if (!testAnswers()) {
				// TODO warn
			}
		}
		catch (Exception e) {
			System.err.println("配置文件读取失败，将使用默认设置。");
			e.printStackTrace();
		}
	}

	public static boolean testAnswers() {
		return Boolean.parseBoolean(config.getProperty("test_answers", "false"));
	}

	public static boolean testRefImpl() {
		return Boolean.parseBoolean(config.getProperty("test_refimpl", "true"));
	}

	public static boolean testPackage(String pkg) {
		if (!pkg.startsWith(PACKAGE_PREFIX)) {
			return false;
		}

		return !ignorePackages.contains(pkg);
	}

	public static boolean needTest(Object obj) {
		return needTest(obj.getClass());
	}

	public static boolean needTest(Class<?> clazz) {
		String pkg = clazz.getPackage().getName();

		if (!pkg.startsWith(PACKAGE_PREFIX)) {
			return false;
		}

		if (pkg.startsWith(REFIMPL_PACKAGE_PREFIX)) {
			return testRefImpl();
		}

		return testAnswers() && testPackage(pkg);
	}

	public static void main(String[] args) {
		System.out.println("test answers: " + testAnswers());
		System.out.println("test refImpl: " + testRefImpl());
		System.out.println("ignore packages: " + ignorePackages);
		System.out.println("accessibility: " + testPackage("study.javase.accessibility"));
		System.out.println("script: " + testPackage("study.javase.script"));
		System.out.println("awt: " + testPackage("study.javase.awt"));
		System.out.println("awt.dd: " + testPackage("study.javase.awt.dd"));
		System.out.println("awt.graphic2d: " + testPackage("study.javase.awt.graphic2d"));
		System.out.println("awt.imf: " + testPackage("study.javase.awt.imf"));
		System.out.println("swing: " + testPackage("study.javase.swing"));
		System.out.println("sound: " + testPackage("study.javase.sound"));
		System.out.println("imageio: " + testPackage("study.javase.imageio"));
		System.out.println("deployment: " + testPackage("study.javase.deployment"));
		System.out.println("deployment.jnlp: " + testPackage("study.javase.deployment.jnlp"));
		System.out.println("ext_mechanism: " + testPackage("study.javase.ext_mechanism"));
		System.out.println("fullscreen_exclusive: " + testPackage("study.javase.fullscreen_exclusive"));
		System.out.println("jpda: " + testPackage("study.javase.jpda"));
		System.out.println("jvmti: " + testPackage("study.javase.jvmti"));
		System.out.println("net.sdp: " + testPackage("study.javase.net.sdp"));
		System.out.println("print: " + testPackage("study.javase.print"));
		System.out.println("tools: " + testPackage("study.javase.tools"));
		System.out.println("tools.attach: " + testPackage("study.javase.tools.attach"));
		System.out.println("tools.jconsole: " + testPackage("study.javase.tools.jconsole"));
		System.out.println("refimpl: " + testPackage("study.javase.refimpl"));
		System.out.println("langbasic: " + testPackage("study.javase.langbasic"));
		System.out.println("string: " + testPackage("study.javase.string"));
		System.out.println("string.regex: " + testPackage("study.javase.string.regex"));
		System.out.println("enum_type: " + testPackage("study.javase.enum_type"));
		System.out.println("reflect: " + testPackage("study.javase.reflect"));
		System.out.println("generic: " + testPackage("study.javase.generic"));
		System.out.println("annotation: " + testPackage("study.javase.annotation"));
		System.out.println("collection: " + testPackage("study.javase.collection"));
		System.out.println("collection.lagacy: " + testPackage("study.javase.collection.lagacy"));
		System.out.println("functional: " + testPackage("study.javase.functional"));
		System.out.println("time: " + testPackage("study.javase.time"));
		System.out.println("time.lagacy: " + testPackage("study.javase.time.lagacy"));
		System.out.println("text: " + testPackage("study.javase.text"));
		System.out.println("util: " + testPackage("study.javase.util"));
		System.out.println("math: " + testPackage("study.javase.math"));
		System.out.println("security: " + testPackage("study.javase.security"));
		System.out.println("security.policy: " + testPackage("study.javase.security.policy"));
		System.out.println("io: " + testPackage("study.javase.io"));
		System.out.println("nio: " + testPackage("study.javase.nio"));
		System.out.println("net: " + testPackage("study.javase.net"));
		System.out.println("logging: " + testPackage("study.javase.logging"));
		System.out.println("classloader: " + testPackage("study.javase.classloader"));
		System.out.println("beans: " + testPackage("study.javase.beans"));
		System.out.println("i18n: " + testPackage("study.javase.i18n"));
		System.out.println("jdbc: " + testPackage("study.javase.jdbc"));
		System.out.println("jndi: " + testPackage("study.javase.jndi"));
		System.out.println("jmx: " + testPackage("study.javase.jmx"));
		System.out.println("rmi: " + testPackage("study.javase.rmi"));
		System.out.println("jni: " + testPackage("study.javase.jni"));
		System.out.println("xml: " + testPackage("study.javase.xml"));
		System.out.println("reference: " + testPackage("study.javase.reference"));
		System.out.println("abc: " + testPackage("abc.references"));
	}
}
