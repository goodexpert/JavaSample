
public class RaceCondition {
	private static Long count = 0L;

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {
				public void run() {
					synchronized (count) {
						for (int i = 0; i < 100; i++) {
							System.out.format("Thread: %d, count: %d\n",
									Thread.currentThread().getId(), count++);
						}
					}
				}
			}).start();
		}
	}
}
