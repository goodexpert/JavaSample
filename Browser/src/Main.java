import java.io.*;

public class Main {

	public static void main(String[] args) {
		File file;

		try {
			file = new File("C:\\Users\\user");
			System.out.println("exists : " + file.exists());
			System.out.println("isDirectory : " + file.isDirectory());
			System.out.println("isFile : " + file.isFile());
			
			File[] files = file.listFiles();
			for (File child : files) {
				System.out.format("%s, isDirectory: %b\n", child.getName(), child.isDirectory());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
