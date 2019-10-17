import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		writeObjects();
		readObjects();
	}

	public static void readObjects() {
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		
		try {
			FileInputStream is = new FileInputStream("contacts.dat");
			ObjectInputStream input = new ObjectInputStream(is);

//			int count = input.readInt();
//			for (int i = 0; i < count; i++) {
//				Contact contact = (Contact) input.readObject();
//				contacts.add(contact);
//			}
			contacts = (ArrayList<Contact>) input.readObject();

			for (Contact contact : contacts) {
				System.out.println(contact);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("읽기 완료.");
		}
	}

	public static void writeObjects() {
		ArrayList<Contact> contacts = new ArrayList<Contact>();

		for (int i = 0; i < 10; i++) {
			Contact contact = new Contact();
			contact.setFirstName("길동" + i);
			contact.setLastName("홍");
			contacts.add(contact);
		}
		
		try {
			FileOutputStream os = new FileOutputStream("contacts.dat");
			ObjectOutputStream output = new ObjectOutputStream(os);

			// 직렬화 객체를 읽을때 저장 갯수를 알수 없어서, 이문제를 해결하기 위해 ,
			// 저장된 객체의 수를 우선 저장한다.
//			output.writeInt(contacts.size());
//			for (Contact contact : contacts) {
//				output.writeObject(contact);
//			}
			output.writeObject(contacts);

			output.flush();
			output.close();
			os.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("저장되었습니다.");
		}
	}
}
