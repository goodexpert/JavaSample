import java.util.*;

public class Main {

	private AddressBook<Address> addressBook;
	private Scanner scanner;

	public Main() {
		this.addressBook = new AddressBook<Address>();
		this.scanner = new Scanner(System.in);
	}

	private void drawMenu() {
		System.out.println("a) 추가");
		System.out.println("p) 출력");
		System.out.println("x) 종료");
		System.out.print("메뉴를 선택하세요: ");
	}

	private void printAddress() {
		addressBook.print();
	}

	private void processField(Address address) {
		String fieldName = "";
		String value = "";

		while (true) {
			System.out.print("필드 이름: " + fieldName);
			fieldName = this.scanner.next();

			System.out.print("필드 벨류: " + value);
			value = this.scanner.next();
			
			System.out.println("s) 저장");
			System.out.println("c) 취소");
			System.out.print("입력: ");

			String cmd = this.scanner.next();
			cmd.trim();

			if (cmd.equalsIgnoreCase("s")) {
				address.addField(fieldName, value);
				return;
			} else if (cmd.equalsIgnoreCase("c")) {
				return;
			}
		}
	}

	private void processFields(Address address) {
		while (true) {
			Set<String> fields = address.getFieldNames();
			int i = 0;
			for (String field : fields) {
				System.out.format("%d) %s\n", i++, field);
			}
			System.out.println("a) 추가");
			System.out.println("c) 취소");
			System.out.print("수행할 명령: ");
			
			String cmd = this.scanner.next();
			if (cmd.equalsIgnoreCase("a")) {
				processField(address);
			} else if (cmd.equalsIgnoreCase("c")) {
				return;
			}
		}
	}

	private void processAdd() {
		Address address = new AddressImpl();

		try {
			while (true) {
				System.out.format("1) 이름 : %s\n", address.getFirstName());
				System.out.format("2) 성 : %s\n", address.getLastName());
				System.out.println("3) 필드 추가");
				System.out.println("s) 저장");
				System.out.println("c) 취소");
				System.out.print("수정할 필드: ");
				
				String cmd = this.scanner.next();
				cmd.trim();
				if (cmd.equalsIgnoreCase("1")) {
					
				} else if (cmd.equalsIgnoreCase("2")) {

				} else if (cmd.equalsIgnoreCase("3")) {
					processFields(address);
				} else if (cmd.equalsIgnoreCase("s")) {
					return;
				} else if (cmd.equalsIgnoreCase("c")) {
					return;
				}
			}
		} finally {
		}
	}

	private void processInput() {
		try {
			String cmd = this.scanner.next();
			cmd.trim();

			if (cmd.equalsIgnoreCase("a")) {
				processAdd();
			} else if (cmd.equalsIgnoreCase("p")) {
				printAddress();
			} else if (cmd.equalsIgnoreCase("x")) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			} else {
			}
		} finally {
		}
	}

	public void run() {
		while (true) {
			drawMenu();
			processInput();
		}
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
}
