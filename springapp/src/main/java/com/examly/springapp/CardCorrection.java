package com.examly.springapp;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="card_correction_update")
public class CardCorrection {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="fathername")
	private String fathername;
	
	@Column(name="mothername")
	private String mothername;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="age")
	private int age;
	
	@Column(name="phonenumber")
	private String phonenumber;
	
	@Column(name="alternatenumber")
	private String alternatenumber;
	
	@Column(name="housenumber")
	private String housenumber;
	
	@Column(name="streetname")
	private String streetname;
	
	@Column(name="area")
	private String area;
	
	@Column(name="pincode")
	private String pincode;
	
	@Column(name="state")
	private String state;
	
	@Column(name="nationality")
	private String nationality;
	
	@Column(name="housenumberp")
	private String housenumberp;
	
	@Column(name="streetnamep")
	private String streetnamep;
	
	@Column(name="areap")
	private String areap;
	
	@Column(name="pincodep")
	private String pincodep;
	
	@Column(name="statep")
	private String statep;
	
	@Column(name="nationalityp")
	private String nationalityp;
	
	@Column(name="doctype")
	private String doctype;
	
	@Column(name="filename")
	private String filename ;
	
	public CardCorrection() {
		
	}
	
	public CardCorrection(String firstName,String lastName,String fatherName,String motherName,String gender,String email,int age,String phoneNumber,String alternateNumber,String houseNumber,String streetName,String area,String pincode,String nationality,String state,String houseNumberP,String stateP,String areaP,String streetNameP,String pincodeP,String nationalityP, String doctype, String filename) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.fathername=fatherName;
		this.mothername=motherName;
		this.gender=gender;
		this.email=email;
		this.age=age;
		this.phonenumber=phoneNumber;
		this.alternatenumber=alternateNumber;
		this.housenumber=houseNumber;
		this.area=area;
		this.streetname=streetName;
		this.pincode=pincode;
		this.state=state;
		this.nationality=nationality;
		this.housenumberp=houseNumberP;
		this.areap=areaP;
		this.streetnamep=streetNameP;
		this.pincodep=pincodeP;
		this.statep=stateP;
		this.nationalityp=nationalityP;
		this.doctype=doctype;
		this.filename=filename;
		
	}
	
	

	
//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAlternatenumber() {
		return alternatenumber;
	}

	public void setAlternatenumber(String alternatenumber) {
		this.alternatenumber = alternatenumber;
	}

	public String getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getHousenumberp() {
		return housenumberp;
	}

	public void setHousenumberp(String housenumberp) {
		this.housenumberp = housenumberp;
	}

	public String getStreetnamep() {
		return streetnamep;
	}

	public void setStreetnamep(String streetnamep) {
		this.streetnamep = streetnamep;
	}

	public String getAreap() {
		return areap;
	}

	public void setAreap(String areap) {
		this.areap = areap;
	}

	public String getPincodep() {
		return pincodep;
	}

	public void setPincodep(String pincodep) {
		this.pincodep = pincodep;
	}

	public String getStatep() {
		return statep;
	}

	public void setStatep(String statep) {
		this.statep = statep;
	}

	public String getNationalityp() {
		return nationalityp;
	}

	public void setNationalityp(String nationalityp) {
		this.nationalityp = nationalityp;
	}

	public String getDoctype() {
		return doctype;
	}

	public void setDoctype(String doctype) {
		this.doctype =doctype;
	}

	public String getfilename() {
		return filename;
	}

	public void setChoosefile(String filename) {
		this.filename = filename;
	}

	@Override
	public String toString() {
		return "CardCorrection [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", fathername=" + fathername + ", mothername=" + mothername + ", gender=" + gender + ", age=" + age
				+ ", phonenumber=" + phonenumber + ", alternatenumber=" + alternatenumber + ", housenumber="
				+ housenumber + ", streetname=" + streetname + ", area=" + area + ", pincode=" + pincode + ", state="
				+ state + ", nationality=" + nationality + ", housenumberp=" + housenumberp + ", streetnamep="
				+ streetnamep + ", areap=" + areap + ", pincodep=" + pincodep + ", statep=" + statep + ", nationalityp="
				+ nationalityp + ", uploaddocumet=" + doctype + ", filename=" + filename + "]";
	}
	
	
	

}
