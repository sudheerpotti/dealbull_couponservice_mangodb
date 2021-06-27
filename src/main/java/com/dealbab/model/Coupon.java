package com.dealbab.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Coupon")
public class Coupon {

	  	private Integer id;
	    private String couponCode;
	    private String couponCat;
	    private String couponDesc;
	    private String validFrom;
	    private String validUntil;
	    private String oid;
	    private String pid;
	    private String sid;
	    private String createdDate;
	    private String updatedDate;
	    private String productTitle;
	    private String basePrice;
	    private String discountPrice;
	    private String discountPercentage;
	    private String storeName;
	    private String storeImageUrl;
	    private String storeRedirectUrl;
	    private List<String> categoryies = null;
	    private List<String> region = null;
	    private String rating;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getCouponCode() {
			return couponCode;
		}
		public void setCouponCode(String couponCode) {
			this.couponCode = couponCode;
		}
		public String getCouponCat() {
			return couponCat;
		}
		public void setCouponCat(String couponCat) {
			this.couponCat = couponCat;
		}
		public String getCouponDesc() {
			return couponDesc;
		}
		public void setCouponDesc(String couponDesc) {
			this.couponDesc = couponDesc;
		}
		public String getValidFrom() {
			return validFrom;
		}
		public void setValidFrom(String validFrom) {
			this.validFrom = validFrom;
		}
		public String getValidUntil() {
			return validUntil;
		}
		public void setValidUntil(String validUntil) {
			this.validUntil = validUntil;
		}
		public String getOid() {
			return oid;
		}
		public void setOid(String oid) {
			this.oid = oid;
		}
		public String getPid() {
			return pid;
		}
		public void setPid(String pid) {
			this.pid = pid;
		}
		public String getSid() {
			return sid;
		}
		public void setSid(String sid) {
			this.sid = sid;
		}
		public String getCreatedDate() {
			return createdDate;
		}
		public void setCreatedDate(String createdDate) {
			this.createdDate = createdDate;
		}
		public String getUpdatedDate() {
			return updatedDate;
		}
		public void setUpdatedDate(String updatedDate) {
			this.updatedDate = updatedDate;
		}
		public String getProductTitle() {
			return productTitle;
		}
		public void setProductTitle(String productTitle) {
			this.productTitle = productTitle;
		}
		public String getBasePrice() {
			return basePrice;
		}
		public void setBasePrice(String basePrice) {
			this.basePrice = basePrice;
		}
		public String getDiscountPrice() {
			return discountPrice;
		}
		public void setDiscountPrice(String discountPrice) {
			this.discountPrice = discountPrice;
		}
		public String getDiscountPercentage() {
			return discountPercentage;
		}
		public void setDiscountPercentage(String discountPercentage) {
			this.discountPercentage = discountPercentage;
		}
		public String getStoreName() {
			return storeName;
		}
		public void setStoreName(String storeName) {
			this.storeName = storeName;
		}
		public String getStoreImageUrl() {
			return storeImageUrl;
		}
		public void setStoreImageUrl(String storeImageUrl) {
			this.storeImageUrl = storeImageUrl;
		}
		public String getStoreRedirectUrl() {
			return storeRedirectUrl;
		}
		public void setStoreRedirectUrl(String storeRedirectUrl) {
			this.storeRedirectUrl = storeRedirectUrl;
		}
		public List<String> getCategoryies() {
			return categoryies;
		}
		public void setCategoryies(List<String> categoryies) {
			this.categoryies = categoryies;
		}
		public List<String> getRegion() {
			return region;
		}
		public void setRegion(List<String> region) {
			this.region = region;
		}
		public String getRating() {
			return rating;
		}
		public void setRating(String rating) {
			this.rating = rating;
		}
		@Override
		public String toString() {
			return "Coupon [id=" + id + ", couponCode=" + couponCode + ", couponCat=" + couponCat + ", couponDesc="
					+ couponDesc + ", validFrom=" + validFrom + ", validUntil=" + validUntil + ", oid=" + oid + ", pid="
					+ pid + ", sid=" + sid + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate
					+ ", productTitle=" + productTitle + ", basePrice=" + basePrice + ", discountPrice=" + discountPrice
					+ ", discountPercentage=" + discountPercentage + ", storeName=" + storeName + ", storeImageUrl="
					+ storeImageUrl + ", storeRedirectUrl=" + storeRedirectUrl + ", categoryies=" + categoryies
					+ ", region=" + region + ", rating=" + rating + "]";
		}


}
