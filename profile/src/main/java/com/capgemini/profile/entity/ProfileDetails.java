package com.capgemini.profile.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ProfileDetails {

	private int orderId;
	private String status;
	private int rating;
	private Cart cart;
	
	
	public ProfileDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProfileDetails(int orderId, String status, int rating, Cart cart) {
		super();
		this.orderId = orderId;
		this.status = status;
		this.rating = rating;
		this.cart = cart;
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	@Override
	public String toString() {
		return "ProfileDetails [orderId=" + orderId + ", status=" + status + ", rating=" + rating + ", cart=" + cart
				+ "]";
	}
	
	
	
	
	
}
