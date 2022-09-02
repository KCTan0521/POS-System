import java.time.LocalDate;

public class StaffManager extends Staff{
	// copy constructor from Staff (if there are no other solutions)
	
public StaffManager() {
		
	}
	
	public StaffManager(String name, LocalDate birthdate, String hp, String email, String address, int salary, String position, String department, LocalDate startDate){
		this.staffID = String.format("C%04d", staffIDCounter++);
		this.name = name;
		this.birthdate = birthdate;
		this.hp = hp;
		this.email = email;
		this.address = address;
		staffIDCounter++;
		
		this.salary = salary;
		this.position = position;
		this.department = department;
		this.startDate = startDate;
	}
	
	public StaffManager(String staffID, String name, LocalDate birthdate, String hp, String email, String address, int salary, String position, String department, LocalDate startDate){
		this.staffID = staffID;
		this.name = name;
		this.birthdate = birthdate;
		this.hp = hp;
		this.email = email;
		this.address = address;
		
		this.salary = salary;
		this.position = position;
		this.department = department;
		this.startDate = startDate;
	}
	
	public String getStaffID() {
		return staffID;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String getPosition() {
		return position;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	/*Function that only staff manager have*/
	
	public void createStaffAccount() {
		
	}
	
	public void deleteStaffAccount(String staffID) { 
		
	}
	
	public void freezeStaffAccount(String staffID) {
		
	}
	
	public void unfreezeStaffAccount(String staffID) {
		
	}
	
	public void resetStaffAccountPassword(String StaffID) {
		
	}
}
