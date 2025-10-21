package member;

import java.util.Date;

public class Pet {
private int petID;
private int petName;
private String petGender;
private Date petbirth;

public Pet() {
	
}
public Pet(int vpetID,int vpetName,String vpetGender,Date vpetbirth) {
	this.setPetID(petID);
	this.setPetName(petName);
	this.setPetGender(petGender);
	this.setPetbirth(petbirth);
}

public int getPetID() {
	return petID;
}
public void setPetID(int petID) {
	this.petID = petID;
}
public int getPetName() {
	return petName;
}
public void setPetName(int petName) {
	this.petName = petName;
}
public String getPetGender() {
	return petGender;
}
public void setPetGender(String petGender) {
	this.petGender = petGender;
}
public Date getPetbirth() {
	return petbirth;
}
public void setPetbirth(Date petbirth) {
	this.petbirth = petbirth;
}
}
