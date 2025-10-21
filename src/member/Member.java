package member;

public class Member {
	private String ID;
	private String Pwd;
	private String Name;
	private String Tel;
	private String Address;
	private int MemberPoints;

	public Member() {this.ID = "0001";this.Pwd = "Jacky0001 ";}

	public Member(String  id) {this.setID(id);}
	
	public Member(String  id,String pwd) {this.setID(id);this.setPwd(pwd);} 
	
	public Member(String  id,int memberpoints) {this.setID(id);this.setMemberPoints(memberpoints);} 
	public Member(String  id,String  pwd,String  name,String  tel,String address,int memberpoints) {
		this.setID(id);
		this.setPwd(pwd);
		this.setName(name);
		this.setTel(tel);
		this.setAddress(address);
		this.setMemberPoints(memberpoints);
	} 
	
	
	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getPwd() {
		return Pwd;
	}


	public void setPwd(String pwd) {
		Pwd = pwd;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getTel() {
		return Tel;
	}


	public void setTel(String tel) {
		Tel = tel;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public int getMemberPoints() {
		return MemberPoints;
	}


	public void setMemberPoints(int memberPoints) {
		MemberPoints = memberPoints;
	}

	public void setID(String id, String pwd) {
        this.setID(id);
        this.setPwd(pwd);
    }

    public void setID_MemberPoints(String id, int memberPoints) {
        this.setID(id);
        this.setMemberPoints(memberPoints);
    }

    public void setID_Name_Pwd_Name_Tel_Address_MemberPoints(String id, String pwd, String name, String tel, String address, int memberPoints) {
        this.setID(id);
        this.setPwd(pwd);
        this.setName(name);
        this.setTel(tel);
        this.setAddress(address);
        this.setMemberPoints(memberPoints);
    }
	

	@Override
	public String toString() {
		return String.format("ID: %s, Password: %s, Name: %s, Tel: %s, Address: %s, Points: %d", 
			ID, Pwd, Name, Tel, Address, MemberPoints);
	}

}