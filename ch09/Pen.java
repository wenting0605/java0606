package ch09;
/*
 * 設計此類別與PenTest.java一起使用
 * 暸解封裝的觀念
 */
public class Pen {
	private String brand;
	private double price;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brandXXX) {
		brand = brandXXX;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double priceXXX) {
		price = priceXXX;
	}
	
}
