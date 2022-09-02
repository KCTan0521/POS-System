import java.time.LocalDate;
import java.time.Period;

public abstract class User {
	protected String name;
	protected LocalDate birthdate;
	protected String hp;
	protected String email;
	protected String address;
	private final int currentYear = LocalDate.now().getYear();
	
	public User() {
		
	}
	
	public int getAge() {
		return currentYear - birthdate.getYear();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public String getHP() {
		return hp;
	}

	public void setHP(String hp) {
		this.hp = hp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
