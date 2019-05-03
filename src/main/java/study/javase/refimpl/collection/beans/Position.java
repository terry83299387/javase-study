package study.javase.refimpl.collection.beans;

/**
 * 员工的职位。
 */
public enum Position {

	MANAGER("manager"), BACKEND_ENGINEER("back-end engineer"), FRONTEND_ENGINEER("front-end engineer"),
	QA("QA"), UI("UI");

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
