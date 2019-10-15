import java.util.*;

public class AddressImpl implements Address {
	private String firstName;
	private String lastName;
	private Map<String, String> fields;

	public AddressImpl() {
		this.fields = new HashMap<String, String>();
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		this.firstName = firstName;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}

	@Override
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		this.lastName = lastName;
	}

	@Override
	public Set<String> getFieldNames() {
		// TODO Auto-generated method stub
		return this.fields.keySet();
	}

	@Override
	public void addField(String fieldName, String value) {
		// TODO Auto-generated method stub
		this.fields.put(fieldName, value);
	}

	@Override
	public String getField(String fieldName) {
		// TODO Auto-generated method stub
		return this.fields.get(fieldName);
	}

	@Override
	public void removeField(String fieldName) {
		// TODO Auto-generated method stub
		this.fields.remove(fieldName);
	}

}
