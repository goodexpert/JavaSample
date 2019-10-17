import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		writeFile();
		readFile();
	}

	public static void readFile() {
		try {
			File file = new File("friends.txt");
			if (!file.exists())
				return;
			Scanner scanner = new Scanner(file);

			while (scanner.hasNext()) {
				String name = scanner.next();
				System.out.format("이름: %s\n", name);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void writeFile() {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("저장할 친구의 인원은: ");
			int count = scanner.nextInt();

			PrintWriter printer = new PrintWriter("friends.txt");
			for (int i = 0; i < count; i++) {
				System.out.print("친구의 이름은: ");

				String name = scanner.next();
				name.trim();

				printer.println(name);
			}
			printer.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
