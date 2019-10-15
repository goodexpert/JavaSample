
public enum FieldName {
	DOB("DOB"),
	NICKNAME("NICKNAME"),
	ADDRESS_CITY("ADDRESS_CITY"),
	ADDRESS_STATE("ADDRESS_STATE"),
	ADDRESS_POSTCODE("ADDRESS_POSTCODE"),
	ADDRESS_STREET("ADDRESS_STREET")
	;

	private String value;
	private FieldName(String value) {
		this.value = value;
	}
	
	public String value() {
		return this.value;
	}

	public String type() {
		if (value.equals("ADDRESS_POSTCODE")) {
			return "숫자";
		} else {
			return "문자열";
		}
	}
}
