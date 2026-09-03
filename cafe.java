package com.cafe.pojo;

public class cafe {
	
	private int cafeId;
	private String mName;
	private double price;
	private int quantity;
	private String category;
	
	
	
	public cafe() {
		super();
	}


	public cafe(int cafeId, String mName, double price, int quantity, String category) {
		super();
		this.cafeId = cafeId;
		this.mName = mName;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}

	
	public cafe(String mName, double price, int quantity, String category) {
		super();
		this.mName = mName;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}


	public int getCafeId() {
		return cafeId;
	}

	public void setCafeId(int cafeId) {
		this.cafeId = cafeId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "cafe [cafeId=" + cafeId + ", mName=" + mName + ", price=" + price + ", quantity=" + quantity
				+ ", category=" + category + "]";
	}

	
	
	

}
