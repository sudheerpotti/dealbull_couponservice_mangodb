package com.dealbab.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Category")
public class Category {
	

    private Integer cid;
    private String catName;
    private String catType;
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getCatType() {
		return catType;
	}
	public void setCatType(String catType) {
		this.catType = catType;
	}
	@Override
	public String toString() {
		return "Category [cid=" + cid + ", catName=" + catName + ", catType=" + catType + "]";
	}

}