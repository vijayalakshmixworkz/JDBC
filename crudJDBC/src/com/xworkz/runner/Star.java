package com.xworkz.runner;

public enum Star {
	URL("jdbc:mysql://localhost:3306/stars"), USERNAME("root"), PASSWORD("7483381416");

	private final String value;
	private Star(String value) {
		System.out.println("value==" + value);
		this.value = value;
		System.out.println("this value==" + this.value);
	}

	public String getValue() {
		return value;
	}
}
