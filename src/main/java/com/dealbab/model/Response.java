package com.dealbab.model;

import java.util.List;

public class Response {
	private List<Coupon> coupon;
	private int totalPages;
	private int pageNumber;
	private int pageSize;
	
	public Response(){}
	
	public Response(List<Coupon> coupon, int totalPages,
						int pageNumber, int pageSize) {
		this.coupon  = coupon;
		this.totalPages = totalPages;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
	}
	
	public List<Coupon> getCoupon() {
		return coupon;
	}

	public void setCoupon(List<Coupon> coupon) {
		this.coupon = coupon;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	
	public int getTotalPages() {
		return this.totalPages;
	}
	
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	
	public int getPageNumber() {
		return this.pageNumber;
	}
	
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public int getPageSize() {
		return this.pageSize;
	}
}