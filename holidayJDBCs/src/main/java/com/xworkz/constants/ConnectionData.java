package com.xworkz.constants;

public enum ConnectionData {
URL("jdbc:mysql://localhost:3306/holidays_table"),USERNAME("root"),PASSWORD("7483381416");
	private String value;
	private ConnectionData(String value){
		this.value=value;
	}
	public String getValue() {
		return value;
	}
}
