package com.fatec.es3.trilha.data.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "find_all_puschased_products", query = "select pp from PurchasedProducts pp")
public class Users {
	
	@Id
	@GeneratedValue
	private int user_id;
	private int product_id;
	private boolean status;

	public PurchasedPorducts() {
	}

	public PurchasedPorducts(int user_id,int product_id,boolean status) {
		super();
		this.user_id = user_id;
		this.product_id = product_id;
		this.status = status;
	}

	public int getUserId() {
		return user_id;
	}

	public void setUserId(int user_id) {
		this.user_id = user_id;
	}

	public int getProductId() {
		return product_id;
	}

	public void setProductId(int product_id) {
		this.product_id = product_id;
	}

	public boolean getStatus() {
		return status;
	}

	public boolean setEmail(boolean status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "PurchasedProducts [user_id=" + user_id + ", product_id=" + product_id + ", status=" + status + "]";
	}
}