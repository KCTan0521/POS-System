
import java.time.LocalDate;
/*
 * 
 * LocalDate
 * LocalTime
 * LocalDateTime
 * ZonedDateTime
 * DateTimeFormatter
 * https://www.youtube.com/watch?v=0XgdX5hDL4U
 * 
 * 
 */

// use private instead of protected

public class Main {
	public static void main(String[] args) {
		/*
		LocalDate custBirthdate = LocalDate.of(2003, 8, 31);
		Customer cust = new Customer("James", custBirthdate, "012-1234567", "james@gmail.com", "14, Jalan Utama, Taman Sentosa, 13200 Butterworth, Pulau Pinang");
		
		
		System.out.println(cust.getName());
		System.out.println(cust.getBirthdate());
		System.out.println(cust.getMemberID());
		System.out.println(cust.getAge());
		
		Staff sm = new Staff();
		sm.getStaffID();
		sm.staffID = "qweqwe";
		System.out.println(sm.staffID);
		*/
		
		InputHandler input = new InputHandler();
		// System.out.println("Ans : " + input.nextInt("Enter amount : ", "Please try again lolll"));
		
		//System.out.println(input.nextInt(4,7));
		
		//System.out.println(input.nextLine(new String[]{"@","q","asas"}, false));
		//System.out.println(input.nextChar("Enter your gender : ", "Invalid gender", new char[] {'m','f'}));
		/*System.out.println("First input");
		System.out.println(input.nextInt());
		
		System.out.println("Second input");
		System.out.println(input.nextInt());// "Enter your integer : ", "Invalid integer try again"
		
		System.out.println("abc");
		System.out.println(input.nextInt(1,6));
		
		System.out.println("abc");
		System.out.println(input.nextInt("Enter his integer : ", "Re-enter please", "Range error sadly", 1,6));
		*/
		
		/*System.out.println(input.nextLine());
		System.out.println(input.nextLine(new String[] {"2","@"},true));
		System.out.println(input.nextLine("Enter a string", "invalid asnwer", "out of range", "not null lol", new String[] {"q"}, true, 4, 10));
		*/
		
		/*System.out.println(input.next());
		System.out.println(input.next("yoyo", "jaja"));
		System.out.println(input.next(new String[] {"q"}, true));*/
		
		//System.out.println(input.nextBoolean());
		
		//System.out.println(input.nextChar("Select your gender (M/F) : ", "Invalid gender. Please try again", new char[] {'m','f'}));
		
		
		System.out.println(input.nextPassword());
		//System.out.println(input.nextPassword());
		//System.out.println(input.nextPassword());
		//System.out.println(input.nextPassword());
		input.next("asdasd", "asd");
		
	}
}
a