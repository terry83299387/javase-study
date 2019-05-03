package study.javase.refimpl.references;

public class Document {

	private Object content;
	private Printer printer;

	public Document(Printer printer) {
		this.setPrinter(printer);
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}

	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

}
