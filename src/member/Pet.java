package member;

import java.time.LocalDate;

public class Pet {
	Member master =new Member();
	private int petID;
	private String petName;
	private String petGender;
	private LocalDate petbirth;
	private String masterID = master.getID();


public Pet() {
	
}
public Pet(int vpetID, String vpetName, String vpetGender, LocalDate vpetbirth, String vmasterID) {
	this.setPetID(vpetID);
	this.setPetName(vpetName);
	this.setPetGender(vpetGender);
	this.setPetbirth(vpetbirth);
	this.setMasterID(vmasterID);
}
private void setPetbirth(LocalDate vpetbirth) {
	// TODO Auto-generated method stub
	
}
public String getMasterID() {
	return masterID;
}
public void setMasterID(String masterID) {
	this.masterID = masterID;
}
public int getPetID() {
	return petID;
}
public void setPetID(int petID) {
	this.petID = petID;
}
public String getPetName() {
	return petName;
}
public void setPetName(String petName) {
	this.petName = petName;
}
public String getPetGender() {
	return petGender;
}
public void setPetGender(String petGender) {
	this.petGender = petGender;
}
public LocalDate getPetbirth() {
	return petbirth;
}
public void setPetbirth(int year, int month, int day) {
	this.petbirth = LocalDate.of(year, month, day);
}
@Override
public String toString() {
	return "Pet [masterID= "+masterID+", petID=" + petID + ", petName=" + petName + ", petGender=" + petGender + ", pet"+ "birth=" + petbirth + "]";
}
}
