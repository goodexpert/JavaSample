import java.util.*;

public class CollectionSample {
	public static void main(String[] args) throws Exception {
		setTest();
	}

	
	// 맵은 키와 데이터(value)로 구성됨
	// Key로 데이터에 바로 접근 가능
	// 성능은 O(1)
	public static void mapTest() {
		Map<String, String> people = new HashMap<String, String>();
		people.put("홍길동", "1반");
		people.put("김수철", "2반");
		people.put("한국화", "3반");
		people.put("윤명길", "4반");
		people.put("강호동", "1반");
		people.put("홍길동", "3반");

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
		// 달력의 인스턴스를 가져온다.
		// getTimeInMillis() : 1970년 1월 1일 0시 0분 0초 부터 시작한 밀리세컨즈 단위의 시간
//		Calendar c = Calendar.getInstance();
//		for (int i = 0; i < 10; i++) {
//			System.out.format("Thread Id: %d, Time: %d\n",
//					Thread.currentThread().getId(), Calendar.getInstance().getTimeInMillis());
//			// 현재 쓰레드를 지정된 시간(밀리세컨즈) 만큼 잠들게(sleep, 스케줄링을 하지 않고 수면 대기하는 것) 한다
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
