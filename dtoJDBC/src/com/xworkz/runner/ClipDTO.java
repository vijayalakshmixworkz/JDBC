package com.xworkz.runner;

public class ClipDTO {
	

		private int clip_id;
		private String clip_name;
		private String material;
		private String color;
		private String size;
		private String style;
		private int price;
		private String manufacturer;
		private String release_date;

		public ClipDTO(int clip_id, String clip_name, String material, String color, String size,
				String style, int price, String manufacturer, String release_date) {
			super();
			this.release_date = release_date;
			this.clip_name = clip_name;
			this.material = material;
			this.color = color;
			this.style = style;
			this.price = price;
			this.manufacturer = manufacturer;
			this.release_date = release_date;
			
		}

		public int getClip_id() {
			return clip_id;
		}

		public void setClip_id(int clip_id) {
			this.clip_id = clip_id;
		}

		public String getClip_name() {
			return clip_name;
		}

		public void setClip_name(String clip_name) {
			this.clip_name = clip_name;
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

		public String getManufacturer() {
			return manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}

		public String getRelease_date() {
			return release_date;
		}

		public void setRelease_date(String release_date) {
			this.release_date = release_date;
		}

}

