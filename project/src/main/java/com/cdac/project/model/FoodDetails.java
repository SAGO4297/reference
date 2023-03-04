package com.cdac.project.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "foodtbl")
public class FoodDetails {

	@Id
	@Column(name = "fid")
	private String fId;

	@Column(name = "fname")
	private String fName;

	@Column(name = "fprice")
	private double fPrice;

	@Column(name = "fcategory")
	private String fCategory;

	@Lob
	@Column(name = "fimg")
	private String fImg;

	@Column(name = "fdescript")
	private String fDescript;

	public String getfId() {
		return fId;
	}

	public void setfId(String fId) {
		this.fId = fId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public double getfPrice() {
		return fPrice;
	}

	public void setfPrice(double fPrice) {
		this.fPrice = fPrice;
	}

	public String getfCategory() {
		return fCategory;
	}

	public void setfCategory(String fCategory) {
		this.fCategory = fCategory;
	}

	public String getfDescript() {
		return fDescript;
	}

	public void setfDescript(String fDescript) {
		this.fDescript = fDescript;
	}

	public String getfImg() {
		return fImg;
	}

	public void setfImg(String fImg) {
		this.fImg = fImg;
	}

	@Override
	public String toString() {
		return "FoodDetails [fId=" + fId + ", fName=" + fName + ", fPrice=" + fPrice + ", fCategory=" + fCategory
				+ ", fImg=" + fImg + ", fDescript=" + fDescript + "]";
	}

}
