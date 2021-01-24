package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="Home")
public class Home {
	
	@Id
	@Column(name="home_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int homeId;
	
//	@OneToMany(mappedBy="home", fetch=FetchType.EAGER)
//	@JsonBackReference
//	private List<Image> imageList = new ArrayList<>();
	
	@Column(name="img_url")
	private String imgURL;
	
	@Column(name="address", nullable=false)
	private String address;
	
	public Home() {
		// TODO Auto-generated constructor stub
	}

	public Home(String imgURL, String address) {
		super();
		this.imgURL = imgURL;
		this.address = address;
	}

	public Home(int homeId, String imgURL, String address) {
		super();
		this.homeId = homeId;
		this.imgURL = imgURL;
		this.address = address;
	}

	public int getHomeId() {
		return homeId;
	}

	public void setHomeId(int homeId) {
		this.homeId = homeId;
	}

	public String getImgURL() {
		return imgURL;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Home [homeId=" + homeId + ", imgURL=" + imgURL + ", address=" + address + "]";
	}

	
	
}
