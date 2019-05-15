package study.javase.collection.beans;

/**
 * 员工的职位。
 */
public enum Position {

	MNG("manager"), BE("back-end engineer"), FE("front-end engineer"), QA("QA"), UI("UI");

	private String name;
	private Position(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
