package com.dealbab.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CouponCategories")
public class CouponCategories {

	private String id;
    private String couponId;
    private String categoryId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCouponId() {
		return couponId;
	}
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	@Override
	public String toString() {
		return "CouponCategories [id=" + id + ", couponId=" + couponId + ", categoryId=" + categoryId + "]";
	}
    
    
}
