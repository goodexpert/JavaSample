import java.io.*;

public class Main {

	public static void main(String[] args) {
		Record record = new Record();
		record.setId(1000);
		record.setName("Steve Park");
		record.setDepartment("Java");
		System.out.println(record);

		record.setName("Steve Paa");
		System.out.println(record);

		writeRecord(record);
		readRecord();
	}

	public static void readRecord() {
		RandomAccessFile file = null;
		try {
			file = new RandomAccessFile("db.dat", "r");
			Record record = Record.createFromFile(file);
			System.out.println(record);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("레코드 읽기를 완료하였습니다.");

			try {
				if (file != null) {
					file.close();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void writeRecord(Record record) {
		RandomAccessFile file = null;
		try {
			file = new RandomAccessFile("db.dat", "rw");
			record.writeToFile(file);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("레코드를 저장하였습니다.");

			try {
				if (file != null) {
					file.close();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void randomAccessFile() {
		RandomAccessFile file = null;

		try {
			// read mode: "r"
			// write mode: "w"
			file = new RandomAccessFile("db.dat", "rw");

			// 현재 파일 사이즈는?
			System.out.format("file size: %d\n", file.length());

			// 현재 파일 포인터의 위치는?
			System.out.format("current position: %d\n", file.getFilePointer());

			// 파일 오프셋 변경은?
			file.seek(1000);
			System.out.println("after seek(1000)");

			// 현재 파일 사이즈는?
			System.out.format("file size: %d\n", file.length());

			// 현재 파일 포인터의 위치는?
			System.out.format("current position: %d\n", file.getFilePointer());
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (file != null) {
					file.close();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
