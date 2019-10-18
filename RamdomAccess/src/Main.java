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
			System.out.println("���ڵ� �б⸦ �Ϸ��Ͽ����ϴ�.");

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
			System.out.println("���ڵ带 �����Ͽ����ϴ�.");

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

			// ���� ���� �������?
			System.out.format("file size: %d\n", file.length());

			// ���� ���� �������� ��ġ��?
			System.out.format("current position: %d\n", file.getFilePointer());

			// ���� ������ ������?
			file.seek(1000);
			System.out.println("after seek(1000)");

			// ���� ���� �������?
			System.out.format("file size: %d\n", file.length());

			// ���� ���� �������� ��ġ��?
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
