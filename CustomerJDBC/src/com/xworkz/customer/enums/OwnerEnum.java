package com.xworkz.customer.enums;

public enum OwnerEnum {
	URL("jdbc:mysql://localhost:3306/owner_info"), USERNAME("root"), PASSWORD("7483381416");

	private final String value;
	private OwnerEnum(String value) {
		System.out.println("value==" + value);
		this.value = value;
		System.out.println("this value==" + this.value);
	}

	public String getValue() {
		return value;
	}
}
