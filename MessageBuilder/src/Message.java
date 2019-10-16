
public class Message {

	private String title;
	private String message;
	private Integer alertId;
	private Integer badgeCount;

	private Message() {
	}

	public static class Builder {
		private String title;
		private String message;
		private Integer alertId;
		private Integer badgeCount;

		public Builder setTitle(String title) {
			this.title = title;
			return this;
		}

		public Builder setMessage(String message) {
			this.message = message;
			return this;
		}

		public Builder setAlertId(Integer alertId) {
			this.alertId = alertId;
			return this;
		}

		public Builder setBadgeCount(Integer badgeCount) {
			this.badgeCount = badgeCount;
			return this;
		}

		public Builder setNotification(Integer id) {
			this.alertId = id;

			switch (id) {
				case 100:
					this.message = "��� ȣ�� �Դϴ�.";
					break;
				case 200:
					this.message = "������ �ް��Դϴ�.";
					break;
				default:
					this.message = "������ ���� �н��� ���� �ʽ��ϴ�.";
					break;
			}
			return this;
		}

		public Message build() {
			Message message = new Message();
			message.title = this.title;
			message.message = this.message;
			message.alertId = this.alertId;
			message.badgeCount = this.badgeCount;
			return message;
		}
	}
}
