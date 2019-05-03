package study.javase.refimpl.collection.beans;

/**
 * 表示一个客户。包含排队号、客户类型、姓名等属性。
 *
 */
public class Client {

	private int queueNumber;
	private ClientType clientType;
	private String name;

	public Client() {
		
	}

	public Client(int queueNumber, ClientType clientType, String name) {
		this.queueNumber = queueNumber;
		this.clientType = clientType;
		this.name = name;
	}

	public int getQueueNumber() {
		return this.queueNumber;
	}

	public void setQueueNumber(int queueNumber) {
		this.queueNumber = queueNumber;
	}

	public ClientType getClientType() {
		return this.clientType;
	}

	public void setClientType(ClientType clientType) {
		this.clientType = clientType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
