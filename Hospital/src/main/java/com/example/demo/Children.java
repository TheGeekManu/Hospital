package com.example.demo;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Children {
	
	@Id
	Integer registrationNumber;
	
	String name;
	String placeOfBirth;
	Integer dateOfBirth;
	String gender;
	Integer weight;
	String mothersName;
	Integer mothersAge;
	String occupation;
	String maritalStatus;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	public int getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getMothersName() {
		return mothersName;
	}
	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}
	public int getMothersAge() {
		return mothersAge;
	}
	public void setMothersAge(int mothersAge) {
		this.mothersAge = mothersAge;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	@Override
	public String toString() {
		return "Children [registrationNumber=" + registrationNumber + ", name=" + name + ", placeOfBirth="
				+ placeOfBirth + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", weight=" + weight
				+ ", mothersName=" + mothersName + ", mothersAge=" + mothersAge + ", occupation=" + occupation
				+ ", maritalStatus=" + maritalStatus + "]";
	}
	
	

}
