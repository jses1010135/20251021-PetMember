package member;

public class Runme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member Jacky = new Member();
		System.out.println(" Jacky: " + Jacky.toString());

		Member Julia = new Member();
		Julia.setID("0023");
		System.out.println(" Julia: " + Julia.toString());

		Member James = new Member();
		James.setID("5123", "1234");
		System.out.println(" James: " + James.toString());

		Member Mary = new Member();
		Mary.setID_MemberPoints("0002", 980);
		System.out.println(" Mary: " + Mary.toString());

		Member Wendy = new Member();
		Wendy.setID_Name_Pwd_Name_Tel_Address_MemberPoints("0003", "0003USER", "Wendy", "0935-123123", "馬公市六合路 300 號",500);
		System.out.println(" Wendy: " + Wendy.toString());
		
		Pet pet1 = new Pet();
		pet1.setPetID(1001);
		pet1.setPetName("Fluffy");
		pet1.setPetGender("female");
		pet1.setMasterID(Jacky.getID());
		pet1.setPetbirth(2022,6,15);
		System.out.println(" Pet1: " + pet1.toString());
	}

}
