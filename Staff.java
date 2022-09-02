import java.time.LocalDate;

public class Staff extends User{
	protected String staffID;
	protected static int staffIDCounter = 1;
	protected int salary;
	protected String position;
	protected String department;
	protected LocalDate startDate;
	
	public Staff() {
		
	}
	
	public Staff(String name, LocalDate birthdate, String hp, String email, String address, int salary, String position, String department, LocalDate startDate){
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
	
	public Staff(String staffID, String name, LocalDate birthdate, String hp, String email, String address, int salary, String position, String department, LocalDate startDate){
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
}
