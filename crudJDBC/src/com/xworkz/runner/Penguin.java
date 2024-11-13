package com.xworkz.runner;

public enum Penguin {
	URL("jdbc:mysql://localhost:3306/penguin"), USERNAME("root"), PASSWORD("7483381416");

	private final String value;
	private Penguin(String value) {
		System.out.println("value==" + value);
		this.value = value;
		System.out.println("this value==" + this.value);
	}

	public String getValue() {
		return value;
	}
}
