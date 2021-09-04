package com.SAH.entity;
import java.io.Serializable;
public class Products implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String product_name;
	private String product_description;
	private int product_stock;
	private int product_price;
	private long id_pet;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public int getProduct_stock() {
		return product_stock;
	}
	public void setProduct_stock(int product_stock) {
		this.product_stock = product_stock;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public long getId_pet() {
		return id_pet;
	}
	public void setId_pet(long id_pet) {
		this.id_pet = id_pet;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", product_name= " + product_name + ", product_description=" + product_description + ",product_stock=" + product_stock + ",product_price=" + product_price + ",id_pet=" + id_pet + " ] ";
	}
	public Products(long id, String product_name, String product_description, int product_stock, int product_price,
			long id_pet) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.product_description = product_description;
		this.product_stock = product_stock;
		this.product_price = product_price;
		this.id_pet = id_pet;
	}
	
	
}
