package com.xworkz.formJDBC.constants;

public class FormConnection {

	URL("jdbc:mysql://localhost:3306/form"), USERNAME("root"), PASSWORD("7483381416");

	private String value;

	private FormConnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}