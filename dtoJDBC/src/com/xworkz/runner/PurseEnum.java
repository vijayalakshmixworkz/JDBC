package com.xworkz.runner;

public enum PurseEnum {
	URL("jdbc:mysql://localhost:3306/purse"), USERNAME("root"), PASSWORD("7483381416");

	private final String value;
	private PurseEnum(String value) {
		System.out.println("value==" + value);
		this.value = value;
		System.out.println("this value==" + this.value);
	}

	public String getValue() {
		return value;
	}
}
