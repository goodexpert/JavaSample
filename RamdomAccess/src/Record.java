import java.io.*;
import java.nio.*;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Record {

	private int id;

	private byte[] name = new byte[256];

	private byte[] department = new byte[256];

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return new String(this.name);
	}

	public void setName(String name) {
		byte[] temp = name.getBytes();
		int len = Math.min(temp.length, 256);

		Arrays.fill(this.name, (byte) 256);
		System.arraycopy(temp, 0, this.name, 0, len);
	}

	public String getDepartment() {
		return new String(this.department);
	}

	public void setDepartment(String department) {
		byte[] temp = department.getBytes();
		int len = Math.min(temp.length, 256);

		Arrays.fill(this.name, (byte) 256);
		System.arraycopy(temp, 0, this.department, 0, len);
	}

	public static Record createFromFile(RandomAccessFile file) throws IOException {
		Record record = new Record();

		record.id = file.readInt();
		file.read(record.name, 0, 256);
		file.read(record.department, 0, 256);

		return record;
	}

	public void writeToFile(RandomAccessFile file) throws IOException {
		file.writeInt(this.id);
		file.write(this.name, 0, 256);
		file.write(this.department, 0, 256);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + getName() + " " + getDepartment();
	}
}
