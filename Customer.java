import java.time.LocalDate;

public class Customer extends User{
	private String memberID;
	private static int memberIDCounter = 1;
	private boolean isMember;
	private boolean membership;
	
	public Customer(){
		
	}
	
	public Customer(String name, LocalDate birthdate, String hp, String email, String address){
		this.memberID = String.format("C%04d", memberIDCounter++);
		this.name = name;
		this.birthdate = birthdate;
		this.hp = hp;
		this.email = email;
		this.address = address;
		memberIDCounter++;
	}
	
	public Customer(String memberID, String name, LocalDate birthdate, String hp, String email, String address){
		this.memberID = memberID;
		this.name = name;
		this.birthdate = birthdate;
		this.hp = hp;
		this.email = email;
		this.address = address;
	}

	public String getMemberID() {
		return memberID;
	}
	
	public boolean getIsMember() {
		return isMember;
	}
	
	public void setIsMember(boolean isMember) {
		this.isMember = isMember;
	}

	public boolean getMembership() {
		return membership;
	}

	public void setMembership(boolean membership) {
		this.membership = membership;
	}
}
