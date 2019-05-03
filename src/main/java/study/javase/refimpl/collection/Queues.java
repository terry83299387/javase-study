package study.javase.refimpl.collection;

import java.util.Queue;
import java.util.function.Consumer;
import java.util.function.Supplier;

import study.javase.collection.beans.Client;

public class Queues {

	/**
	 * 请创建并返回一个 Queue<String> 对象，其中的元素是排队等待服务的客户
	 * （用姓名来表示）。该队列使用简单的先来先服务策略。
	 */
	public Queue<String> getServiceQueue() {
		// TODO your code goes here
		return null;
	}

	/**
	 * queue 是 {@link Queues#getServiceQueue()} 方法所返回的队列，
	 * 队列中是当前正在排队等待服务的客户（用姓名来表示）。
	 * 假设在一段时间内排队和服务情况如下，请使用合适的队列操作来表示每一个动作：
	 * (1) 新来了一个客户 John，排在了队伍的最后
	 * (2) 又来了一个客户 Rebecca，排在了 John 的后面
	 * (3) 某个服务窗口的客户离开，排在队伍前面的人离开队伍，到该窗口接受服务（提供
	 * 服务的过程由 service 这个 Consumer 对象来表示）
	 * (4) 来了一个客户 Terry，排在了 Rebecca 的后面
	 * (5) 有两个窗口的客户同时离开，排在队伍前面的两人相继离开队伍，分别到两个窗口接受服务
	 * (6) 来了一个客户 Tom，他比较赶时间，因此他来了之后先观察排队情况，如果正在排队
	 * 的人大于 5 个，则不排队，否则就加入队伍排队
	 * (7) 又来了一个客户，他身体不好，无法长时间站立，因此他女儿 Rebecca 帮他排队。
	 * 此时他过来是看看他女儿是否已经排在了队伍的最前面，如果不是，他会选择再到旁边坐会；
	 * 如果是，则他会走过去准备等待叫号。请帮助他，并根据结果返回 true（Rebecca 已经在
	 * 队伍最前面）或 false。
	 */
	public boolean serviceQueue(Queue<String> queue, Consumer<String> service) {
		// TODO your code goes here
		return false;
	}

	/**
	 * 请根据以下条件创建一个用来存放 {@link study.javase.collection.beans.Client} 对象的
	 * 队列，该队列有以下要求：
	 * (1) 队列用来存放正在排队等待服务的客户（Client）
	 * (2) 客户有三种类型，用枚举类型 {@link study.javase.collection.beans.ClientType} 表示：
	 *     普通客户：{@link study.javase.collection.beans.ClientType#REGULAR}；
	 *     预约客户：{@link study.javase.collection.beans.ClientType#APPOINTMENT}；
	 *     VIP 客户：{@link study.javase.collection.beans.ClientType#VIP}。
	 * (3) 队列需要首先按照客户类型来安排顺序：VIP 客户 > 预约客户 > 普通客户
	 * (4) 对于同一类型的客户，则根据入队时间来安排顺序，先来的排在前面
	 * （考察优先级队列的特性和构造方法）
	 */
	public Queue<Client> getClientQueue() {
		// TODO your code goes here
		return null;
	}

	/**
	 * queue 是 {@link Queues#getClientQueue()} 方法所返回的队列，假设现在普通
	 * 客户的号码排到了 34 号（即下一个即将到来的普通客户将取到的号码为第 35 号），
	 * 预约客户的号码排到了 11 号，VIP 客户的号码排到了 6 号。假设在接下来的一段时间
	 * 内排队和服务情况如下，请使用合适的队列操作来表示每一个动作：
	 * (1) 来了一个普通客户 Andy
	 * (2) 某一个窗口完成了对前一位客户的服务，开始向队列中的下一个客户提供服务（提供
	 * 服务的过程由 service 这个 Consumer 对象来表示）
	 * (3) 来了一个普通客户 Mary
	 * (4) 来了一个预约客户 Sandy
	 * (5) 来了一个普通客户 Bob
	 * (6) 某一个窗口完成了服务，开始向队列中的下一个客户提供服务
	 * (7) 来了一个 VIP 客户 Leon
	 * (8) 来了一个普通客户 Dean
	 * (9) 某一个窗口完成了服务，开始向队列中的下一个客户提供服务
	 * (10) 来了一个预约客户 Lily
	 * (11) 来了一个 VIP 客户 Black
	 * (12) 某一个窗口完成了服务，开始向队列中的下一个客户提供服务
	 * (13) 某一个窗口完成了服务，开始向队列中的下一个客户提供服务
	 * (14) 来了一个普通客户 Wudy
	 * (15) 来了一个预约客户 Bill
	 */
	public void clientQueue(Queue<Client> queue, Consumer<Client> service) {
		// 普通客户的当前号码
		int commonQueueNumber = 34;
		// 预约客户的当前号码
		int appointmentQueueNumber = 11;
		// VIP 客户的当前号码
		int vipQueueNumber = 6;

		// TODO your code goes here
	}

	/**
	 * 使用队列实现生产者消费者模型，其中有两个线程：product（生产者线程）和 consume（消费者线程）。
	 * 生产者线程每次调用 producer 来生产一个“产品”（T 对象）；消费者线程每次调用 consumer 来消费
	 * 队列中的一个产品。
	 * queue 是一个有限队列，当它已满时，便不可以再存放新的元素；同理，当它为空时，便代表没有产品可供
	 * 消费。
	 * 由于两个线程是以非预期的方式并发执行，因此生产和消费时必须同步。以防止过度生产和过度消费的问题。
	 */
	public <T> void producerConsumer(final Queue<T> queue,
			final Supplier<T> producer, final Consumer<T> consumer) {
		// TODO do some initializing here if needed

		Thread product = new Thread() {
			@Override
			public void run() {
				// TODO your code goes here
			}
		};
		Thread consume = new Thread() {
			@Override
			public void run() {
				// TODO your code goes here
			}
		};

		product.start();
		consume.start();

		try {
			// 等待 1 分钟，等两个线程退出
			product.join(60000L);
			consume.join(10L);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
