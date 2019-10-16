
public class Main {

	public static void main(String[] args) {
		/*
		Message message = new Message();
		message.setTitle("알림");
		message.setMessage("오늘은 자유학습이 없습니다.");
		message.setAlertId(100);
		message.setBadgeCount(1);
		*/
		Message message = new Message.Builder()
				.setTitle("알림")
				.setNotification(100)
				.setBadgeCount(1)
				.build();
	}
}
