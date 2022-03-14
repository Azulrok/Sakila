package br.com.sakila.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address", schema = "sakila")
public class AdressModel implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "address_id")
	private Integer addressId;
	@Column(name = "address")
	private String address;
	@Column(name = "address2")
	private String address2;
	@Column(name = "district")
	private String district;
	@Column(name = "city_id")
	private Integer city_Id;
	@Column(name = "postal_code")
	private String postal_Code;
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Integer getCity_Id() {
		return city_Id;
	}
	public void setCity_Id(Integer city_Id) {
		this.city_Id = city_Id;
	}
	public String getPostal_Code() {
		return postal_Code;
	}
	public void setPostal_Code(String postal_Code) {
		this.postal_Code = postal_Code;
	}
	
	
	
	
}
