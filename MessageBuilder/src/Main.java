
public class Main {

	public static void main(String[] args) {
		/*
		Message message = new Message();
		message.setTitle("�˸�");
		message.setMessage("������ �����н��� �����ϴ�.");
		message.setAlertId(100);
		message.setBadgeCount(1);
		*/
		Message message = new Message.Builder()
				.setTitle("�˸�")
				.setNotification(100)
				.setBadgeCount(1)
				.build();
	}
}
