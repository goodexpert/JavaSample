import java.util.*;

public class CollectionSample {
	public static void main(String[] args) throws Exception {
		setTest();
	}

	
	// ���� Ű�� ������(value)�� ������
	// Key�� �����Ϳ� �ٷ� ���� ����
	// ������ O(1)
	public static void mapTest() {
		Map<String, String> people = new HashMap<String, String>();
		people.put("ȫ�浿", "1��");
		people.put("���ö", "2��");
		people.put("�ѱ�ȭ", "3��");
		people.put("�����", "4��");
		people.put("��ȣ��", "1��");
		people.put("ȫ�浿", "3��");

		for (String key : people.keySet()) {
			System.out.format("key: %s, value: %s\n", key, people.get(key));
		}
	}

	public static void listTest() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for (int i = 0; i < 10; i++) 
			list.addLast(i);

//		Collections.reverse(list);
		for (Integer temp : list) {
			System.out.println("temp = " + temp);
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println("temp = " + list.get(i));
		}
	}

	public static void setTest() throws Exception {
		Set<Integer> numbers = new HashSet<Integer>();
		// Calendar.getInstance()
		// �޷��� �ν��Ͻ��� �����´�.
		// getTimeInMillis() : 1970�� 1�� 1�� 0�� 0�� 0�� ���� ������ �и������� ������ �ð�
//		Calendar c = Calendar.getInstance();
//		for (int i = 0; i < 10; i++) {
//			System.out.format("Thread Id: %d, Time: %d\n",
//					Thread.currentThread().getId(), Calendar.getInstance().getTimeInMillis());
//			// ���� �����带 ������ �ð�(�и�������) ��ŭ ����(sleep, �����ٸ��� ���� �ʰ� ���� ����ϴ� ��) �Ѵ�
//			Thread.currentThread().sleep(1000);
//		}
		for (int i = 0; i < 100; i++) {
			System.out.println("Time is " + Calendar.getInstance().getTimeInMillis());
		}

		while (numbers.size() < 6) {
			double rand = Math.random() * Calendar.getInstance().getTimeInMillis();
			numbers.add(Math.abs((int)((long)rand) % 45) + 1);
		}

		for (Integer temp : numbers) {
			System.out.println(temp);
		}
	}

}
