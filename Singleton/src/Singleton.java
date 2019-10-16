
public class Singleton {

	private Singleton() {
		
	}

	private static Singleton sInstance = new Singleton();

	public static Singleton getInstance() {
		/* Case 1: ���߽����� ȯ�濡�� �������� �ʴ�.
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
