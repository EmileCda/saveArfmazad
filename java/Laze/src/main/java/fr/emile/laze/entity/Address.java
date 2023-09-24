package fr.emile.laze.entity;

import fr.emile.laze.common.IConstant;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity

@Table(name = "address")
@XmlRootElement
@org.hibernate.annotations.NamedQueries({ 
	  @org.hibernate.annotations.NamedQuery(name = "address.getAll", query = "Select a from address a"),
	  @org.hibernate.annotations.NamedQuery(name = "address.getById", query = "Select a from address a where a.id = :id"),
	  @org.hibernate.annotations.NamedQuery(name = "address.getByzipCode", query = "Select a from address a where a.zipCode = :zipCode") })
public class Address implements IConstant {

	private int id;
	private String number;
	private String street;
	private String city;
	private String zipCode;
	private int idUser;
	private boolean isValide;
	private boolean isDeleted;


	public Address( String number, String street, String city, String zipCode) {

		this(DEFAULT_ID,number,street, city,zipCode,DEFAULT_ID,true,false);
	}

	public Address(int id, String number, String street, String city, String zipCode, int idUser, boolean isValide,
			boolean isDeleted) {
		this.setId(id);
		this.setNumber(number);
		this.setStreet(street);
		this.setCity(city);
		this.setZipCode(zipCode);
		this.setIdUser(idUser);
		this.setValide(isValide);
		this.setDeleted(isDeleted);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public boolean isValide() {
		return isValide;
	}

	public void setValide(boolean isValide) {
		this.isValide = isValide;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

}
