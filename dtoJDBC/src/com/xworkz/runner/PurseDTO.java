package com.xworkz.runner;

public class PurseDTO {

	    private int purse_id;
	    private String purse_name;
	    private String material;
	    private String color;
	    private String size;
	    private String style;
	    private int price;
	    private String brand;
	    private String release_date;

	    public PurseDTO(int purse_id, String purse_name, String material, String color, String size,
	                    String style, int price, String brand, String release_date) {
	        super();
	        this.purse_id = purse_id;
	        this.purse_name = purse_name;
	        this.material = material;
	        this.color = color;
	        this.size = size;
	        this.style = style;
	        this.price = price;
	        this.brand = brand;
	        this.release_date = release_date;
	    }

	    public int getPurse_id() {
	        return purse_id;
	    }

	    public void setPurse_id(int purse_id) {
	        this.purse_id = purse_id;
	    }

	    public String getPurse_name() {
	        return purse_name;
	    }

	    public void setPurse_name(String purse_name) {
	        this.purse_name = purse_name;
	    }

	    public String getMaterial() {
	        return material;
	    }

	    public void setMaterial(String material) {
	        this.material = material;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public String getSize() {
	        return size;
	    }

	    public void setSize(String size) {
	        this.size = size;
	    }

	    public String getStyle() {
	        return style;
	    }

	    public void setStyle(String style) {
	        this.style = style;
	    }

	    public int getPrice() {
	        return price;
	    }

	    public void setPrice(int price) {
	        this.price = price;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    public String getRelease_date() {
	        return release_date;
	    }

	    public void setRelease_date(String release_date) {
	        this.release_date = release_date;
	    }
	}


