package com.jw.model;

import java.io.Serializable;

public class Shop implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7943295171165311639L;

	private Long id;
	
	private String name;
	
	private String address;
	
	private String postcode;
	
	public Shop(Long id, String name, String address, String postcode) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.postcode = postcode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + ", address=" + address
				+ ", postcode=" + postcode + "]";
	}
	
	
	
}
