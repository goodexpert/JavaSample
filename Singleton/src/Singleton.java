
public class Singleton {

	private Singleton() {
		
	}

	private static Singleton sInstance = new Singleton();

	public static Singleton getInstance() {
		/* Case 1: 다중스레드 환경에서 안전하지 않다.
		if (sInstance == null) {
			sInstance = new Singleton();
		}
		return sInstance;
		*/
		/* Case 2:
		if (sInstance == null) {
			synchronized(sInstance) {
				if (sInstance == null) {
					sInstance = new Singleton();
				}
			}
		}
		*/
		return sInstance;
	}
}
