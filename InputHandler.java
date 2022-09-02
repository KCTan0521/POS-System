/*
 * Version : 1.0
 * Last Date : 25/8/2022
 * *If got any problem please inform Khang Chuan
 * */

import java.util.Scanner;
import java.io.Console;
import java.io.IOException;


public class InputHandler {
	
	private String nextIntQuestion;
	private String nextDoubleQuestion;
	private String nextLineQuestion;
	private String nextQuestion;
	private String nextBooleanQuestion;
	private String nextCharQuestion;
	private String nextPasswordQuestion;
	private String invalidInputError;
	private String intNotInRangeError;
	private String stringNotInRangeError;
	private String nullError;
	
	InputHandler(){
		reset();
	}
	
	// accessors and mutators of private variables
	public String getNextIntQuestion() {return nextIntQuestion;}
	public void setNextIntQuestion(String nextIntQuestion) {this.nextIntQuestion = nextIntQuestion;}
	
	public String getNextDoubleQuestion() {return nextDoubleQuestion;}
	public void setNextDoubleQuestion(String nextDoubleQuestion) {this.nextDoubleQuestion = nextDoubleQuestion;}

	public String getNextLineQuestion() {return nextLineQuestion;}
	public void setNextLineQuestion(String nextLineQuestion) {this.nextLineQuestion = nextLineQuestion;}

	public String getNextQuestion() {return nextQuestion;}
	public void setNextQuestion(String nextQuestion) {this.nextQuestion = nextQuestion;}

	public String getNextBooleanQuestion() {return nextBooleanQuestion;}
	public void setNextBooleanQuestion(String nextBooleanQuestion) {this.nextBooleanQuestion = nextBooleanQuestion;}

	public String getNextCharQuestion() {return nextCharQuestion;}
	public void setNextCharQuestion(String nextCharQuestion) {this.nextCharQuestion = nextCharQuestion;}

	public String getNextPasswordQuestion() {return nextPasswordQuestion;}
	public void setNextPasswordQuestion(String nextPasswordQuestion) {this.nextPasswordQuestion = nextPasswordQuestion;}

	public String getInvalidInputError() {return invalidInputError;}
	public void setInvalidInputError(String invalidInputError) {this.invalidInputError = invalidInputError;}

	public String getIntNotInRangeError() {return intNotInRangeError;}
	public void setIntNotInRangeError(String intNotInRangeError) {this.intNotInRangeError = intNotInRangeError;}
	
	public String getStringNotInRangeError() {return stringNotInRangeError;}
	public void setStringNotInRangeError(String stringNotInRangeError) {this.stringNotInRangeError = stringNotInRangeError;}

	public String getNullError() {return nullError;}
	public void setNullError(String nullError) {this.nullError = nullError;}
	
	// reset the user input hint to default
	public void reset() {
		nextIntQuestion = "Enter an integer : ";
		nextDoubleQuestion = "Enter a double : ";
		nextLineQuestion = "Enter a string : ";
		nextQuestion = "Enter a word : ";
		nextBooleanQuestion = "Enter a boolean : ";
		nextCharQuestion = "Enter a character : ";
		nextPasswordQuestion = "Enter a password : ";
		invalidInputError = "Invalid input. Please re-enter.";
		intNotInRangeError = "The integer is not in range. Please re-enter.";
		stringNotInRangeError = "The length of string is not in range. Please re-enter.";
		nullError = "The string cannot be blank. Please re-enter.";
	}
	
	
	// password input (only carry out password masking in windows command prompt)
	public String nextPassword() {
		Scanner sc = new Scanner(System.in);
		Console cons = System.console();
		
		boolean wrongInput = true;
		String input = null; 
		char[] tempInput =  new char[50];
		
		do {
			try {
				System.out.print(nextPasswordQuestion);
				if((cons = System.console()) != null) {
					tempInput = cons.readPassword();
					input = new String(tempInput);	
					
				}
				else {
					input = sc.nextLine();
				}
				wrongInput = false;
				
				if (input.equals("")) {
					System.out.println(nullError);
					wrongInput = true;
				}
			}
			catch(Exception e){
				System.out.println(invalidInputError);
			}
		}while(wrongInput);
		
		return input;
	}
	
	// integer input
	public int nextInt() {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		int input = 0;
		
		do {
			try {
				System.out.print(nextIntQuestion);
				input = sc.nextInt();
				sc.nextLine();
				wrongInput = false;
			}
			catch(Exception e){
				System.out.println(invalidInputError);
				sc.nextLine();
			}
		}while(wrongInput);
		
		return input;
	}
	
	public int nextInt(String question, String errorQuestion) {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		int input = 0;
		
		do {
			try {
				System.out.print(question);
				input = sc.nextInt();
				sc.nextLine();
				wrongInput = false;
			}
			catch(Exception e){
				System.out.println(errorQuestion);
				sc.nextLine();
			}
		}while(wrongInput);

		return input;
	}
	
	public int nextInt(int min, int max) {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		int input = 0;
		
		do {
			try {
				System.out.print(nextIntQuestion);
				input = sc.nextInt();
				sc.nextLine();
				wrongInput = false;
				
				if (!(input>= min && input<= max)) {
					System.out.println(intNotInRangeError);
					wrongInput = true;
				}
				
			}
			catch(Exception e){
				System.out.println(invalidInputError);
				sc.nextLine();
			}
		}while(wrongInput);
	
		return input;
	}
	
	public int nextInt(String question, String errorQuestion, String notInRangeErrorQuestion, int min, int max) {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		int input = 0;
		
		do {
			try {
				System.out.print(question);
				input = sc.nextInt();
				sc.nextLine();
				wrongInput = false;
				
				if (!(input>= min && input<= max)) {
					System.out.println(notInRangeErrorQuestion);
					wrongInput = true;
				}
				
			}
			catch(Exception e){
				System.out.println(errorQuestion);
				sc.nextLine();
			}
		}while(wrongInput);
		
		return input;
	}
	
	// double input
	public double nextDouble() {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		double input = 0;
		
		do {
			try {
				System.out.print(nextDoubleQuestion);
				input = sc.nextDouble();
				sc.nextLine();
				wrongInput = false;
			}
			catch(Exception e){
				System.out.println(invalidInputError);
				sc.nextLine();
			}
		}while(wrongInput);
		
		return input;
	}
	
	public double nextDouble(String question, String errorQuestion) {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		double input = 0;
		
		do {
			try {
				System.out.print(question);
				input = sc.nextDouble();
				sc.nextLine();
				wrongInput = false;
			}
			catch(Exception e){
				System.out.println(errorQuestion);
				sc.nextLine();
			}
		}while(wrongInput);

		return input;
	}
	
	public double nextDouble(double min, double max) {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		double input = 0;
		
		do {
			try {
				System.out.print(nextDoubleQuestion);
				input = sc.nextDouble();
				sc.nextLine();
				wrongInput = false;
				
				if (!(input>= min && input<= max)) {
					System.out.println(intNotInRangeError);
					sc.nextLine();
					wrongInput = true;
				}
				
			}
			catch(Exception e){
				System.out.println(invalidInputError);
				sc.nextLine();
			}
		}while(wrongInput);
	
		return input;
	}
	
	public double nextDouble(String question, String errorQuestion, String notInRangeErrorQuestion, double min, double max) {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		double input = 0;
		
		do {
			try {
				System.out.print(question);
				input = sc.nextDouble();
				sc.nextLine();
				wrongInput = false;
				
				if (!(input>= min && input<= max)) {
					System.out.println(notInRangeErrorQuestion);
					wrongInput = true;
				}
				
			}
			catch(Exception e){
				System.out.println(errorQuestion);
				sc.nextLine();
			}
		}while(wrongInput);
		
		return input;
	}
	
	// line input
	public String nextLine() {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		String input = "";
		
		do {
			try {
				System.out.print(nextLineQuestion);
				input = sc.nextLine();
				wrongInput = false;
				
				if (input.equals("")) {
					System.out.println(nullError);
					wrongInput = true;
				}
			}
			catch(Exception e){
				System.out.println(invalidInputError);
				sc.nextLine();
			}
		}while(wrongInput);
		
		return input;
	}
	
	public String nextLine(String question, String errorQuestion, String nullErrorQuestion) {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		String input = "";
		
		do {
			try {
				System.out.print(question);
				input = sc.nextLine();
				wrongInput = false;
				
				if (input.equals("")) {
					System.out.println(nullErrorQuestion);
					wrongInput = true;
				}
			}
			catch(Exception e){
				System.out.println(errorQuestion);
				sc.nextLine();
			}
		}while(wrongInput);
		
		return input;
	}
	
	public String nextLine(String[]keywords, boolean isContain) {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		String input = "";
		
		do {
			try {
				System.out.print(nextLineQuestion);
				input = sc.nextLine();
				wrongInput = false;
				
				if (input.equals("")) {
					System.out.println(nullError);
					wrongInput = true;
					continue;
				}
				
				if(!(isContain)) {
					for (int i = 0; i<keywords.length; i++) {
						// if keyword is found in input, then let user input again
						if(input.indexOf(keywords[i])!=-1) {
							System.out.println("The input cannot have '" + keywords[i]+ "'. Please re-enter");
							wrongInput = true;
							break;
						}
					}
				}
				else {
					for (int i = 0; i<keywords.length; i++) {
						// if keyword is not found in input, then let user input again
						if(input.indexOf(keywords[i])==-1) {
							System.out.println("The input must have '" + keywords[i]+ "'. Please re-enter");
							wrongInput = true;
							break;
						}
					}
				}
				
			}
			catch(Exception e){
				System.out.println(invalidInputError);
				sc.nextLine();
			}
		}while(wrongInput);
		
		return input;
	}
	
	public String nextLine(String question, String errorQuestion, String nullErrorQuestion, String[]keywords, boolean isContain) {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		String input = "";
		
		do {
			try {
				System.out.print(question);
				input = sc.nextLine();
				wrongInput = false;
				
				if (input.equals("")) {
					System.out.println(nullErrorQuestion);
					wrongInput = true;
					continue;
				}
				
				if(!(isContain)) {
					for (int i = 0; i<keywords.length; i++) {
						// if keyword is found in input, then let user input again
						if(input.indexOf(keywords[i])!=-1) {
							System.out.println("The input cannot have '" + keywords[i]+ "'. Please re-enter");
							wrongInput = true;
							break;
						}
					}
				}
				else {
					for (int i = 0; i<keywords.length; i++) {
						// if keyword is not found in input, then let user input again
						if(input.indexOf(keywords[i])==-1) {
							System.out.println("The input must have '" + keywords[i]+ "'. Please re-enter");
							wrongInput = true;
							break;
						}
					}
				}
				
			}
			catch(Exception e){
				System.out.println(errorQuestion);
				sc.nextLine();
			}
		}while(wrongInput);
		
		return input;
	}
	
	public String nextLine(int min, int max) {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		String input = "";
		
		do {
			try {
				System.out.print(nextLineQuestion);
				input = sc.nextLine();
				wrongInput = false;
				
				if (input.equals("")) {
					System.out.println(nullError);
					wrongInput = true;
					continue;
				}
				
				if (!(input.length()>= min && input.length()<= max)) {
					System.out.println(stringNotInRangeError);
					wrongInput = true;
				}
			}
			catch(Exception e){
				System.out.println(invalidInputError);
				sc.nextLine();
			}
		}while(wrongInput);
		
		return input;
	}
	
	public String nextLine(String question, String errorQuestion, String notInRangeErrorQuestion, String nullErrorQuestion, int min, int max) {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		String input = "";
		
		do {
			try {
				System.out.print(question);
				input = sc.nextLine();
				wrongInput = false;
				
				if (input.equals("")) {
					System.out.println(nullErrorQuestion);
					wrongInput = true;
					continue;
				}
				
				if (!(input.length()>= min && input.length()<= max)) {
					System.out.println(notInRangeErrorQuestion);
					wrongInput = true;
				}
			}
			catch(Exception e){
				System.out.println(errorQuestion);
				sc.nextLine();
			}
		}while(wrongInput);
		
		return input;
	}
	
	public String nextLine(String question, String errorQuestion, String notInRangeErrorQuestion, String nullErrorQuestion, String[]keywords, boolean isContain, int min, int max) {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		String input = "";
		
		do {
			try {
				System.out.print(question);
				input = sc.nextLine();
				wrongInput = false;
				
				if (input.equals("")) {
					System.out.println(nullErrorQuestion);
					wrongInput = true;
					continue;
				}
				
				if (!(input.length()>= min && input.length()<= max)) {
					System.out.println(stringNotInRangeError);
					wrongInput = true;
					continue;
				}
				
				if(!(isContain)) {
					for (int i = 0; i<keywords.length; i++) {
						// if keyword is found in input, then let user input again
						if(input.indexOf(keywords[i])!=-1) {
							System.out.println("The input cannot have '" + keywords[i]+ "'. Please re-enter");
							wrongInput = true;
							break;
						}
					}
				}
				else {
					for (int i = 0; i<keywords.length; i++) {
						// if keyword is not found in input, then let user input again
						if(input.indexOf(keywords[i])==-1) {
							System.out.println("The input must have '" + keywords[i]+ "'. Please re-enter");
							wrongInput = true;
							break;
						}
					}
				}
				
			}
			catch(Exception e){
				System.out.println(errorQuestion);
				sc.nextLine();
			}
		}while(wrongInput);
		
		return input;
	}

	// word input
	public String next() {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		String input = "";
		
		do {
			try {
				System.out.print(nextQuestion);
				input = sc.next();
				wrongInput = false;
				sc.nextLine();
				
			}
			catch(Exception e){
				System.out.println(invalidInputError);
				sc.nextLine();
			}
		}while(wrongInput);
		
		return input;
	}
	
	public String next(String question, String errorQuestion) {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		String input = "";
		
		do {
			try {
				System.out.print(question);
				input = sc.next();
				wrongInput = false;
				sc.nextLine();
				
			}
			catch(Exception e){
				System.out.println(errorQuestion);
				sc.nextLine();
			}
		}while(wrongInput);
		
		return input;
	}
	
	public String next(String[]keywords, boolean isContain) {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		String input = "";
		
		do {
			try {
				System.out.print(nextQuestion);
				input = sc.next();
				wrongInput = false;
				sc.nextLine();
				
				if(!(isContain)) {
					for (int i = 0; i<keywords.length; i++) {
						// if keyword is found in input, then let user input again
						if(input.indexOf(keywords[i])!=-1) {
							System.out.println("The input cannot have '" + keywords[i]+ "'. Please re-enter");
							wrongInput = true;
							break;
						}
					}
				}
				else {
					for (int i = 0; i<keywords.length; i++) {
						// if keyword is not found in input, then let user input again
						if(input.indexOf(keywords[i])==-1) {
							System.out.println("The input must have '" + keywords[i]+ "'. Please re-enter");
							wrongInput = true;
							break;
						}
					}
				}
				
			}
			catch(Exception e){
				System.out.println(invalidInputError);
				sc.nextLine();
			}
		}while(wrongInput);
		
		return input;
	}
	
	public String next(String question, String errorQuestion, String[]keywords, boolean isContain) {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		String input = "";
		
		do {
			try {
				System.out.print(question);
				input = sc.next();
				wrongInput = false;
				sc.nextLine();
				
				if(!(isContain)) {
					for (int i = 0; i<keywords.length; i++) {
						// if keyword is found in input, then let user input again
						if(input.indexOf(keywords[i])!=-1) {
							System.out.println("The input cannot have '" + keywords[i]+ "'. Please re-enter");
							wrongInput = true;
							break;
						}
					}
				}
				else {
					for (int i = 0; i<keywords.length; i++) {
						// if keyword is not found in input, then let user input again
						if(input.indexOf(keywords[i])==-1) {
							System.out.println("The input must have '" + keywords[i]+ "'. Please re-enter");
							wrongInput = true;
							break;
						}
					}
				}
				
			}
			catch(Exception e){
				System.out.println(errorQuestion);
				sc.nextLine();
			}
		}while(wrongInput);
		
		return input;
	}

	public String next(int min, int max) {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		String input = "";
		
		do {
			try {
				System.out.print(nextQuestion);
				input = sc.next();
				wrongInput = false;
				sc.nextLine();
				
				if (!(input.length()>= min && input.length()<= max)) {
					System.out.println(stringNotInRangeError);
					wrongInput = true;
				}
			}
			catch(Exception e){
				System.out.println(invalidInputError);
				sc.nextLine();
			}
		}while(wrongInput);
		
		return input;
	
	}

	public String next(String question, String errorQuestion, String notInRangeErrorQuestion, int min, int max) {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		String input = "";
		
		do {
			try {
				System.out.print(question);
				input = sc.next();
				wrongInput = false;
				sc.nextLine();
				
				if (!(input.length()>= min && input.length()<= max)) {
					System.out.println(notInRangeErrorQuestion);
					wrongInput = true;
				}
				
			}
			catch(Exception e){
				System.out.println(errorQuestion);
				sc.nextLine();
			}
		}while(wrongInput);
		
		return input;

	}
	
	public String next(String question, String errorQuestion, String notInRangeErrorQuestion, String[]keywords, boolean isContain, int min, int max) {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		String input = "";
		
		do {
			try {
				System.out.print(question);
				input = sc.next();
				wrongInput = false;
				sc.nextLine();
				
				if (!(input.length()>= min && input.length()<= max)) {
					System.out.println(notInRangeErrorQuestion);
					wrongInput = true;
					continue;
				}
				
				if(!(isContain)) {
					for (int i = 0; i<keywords.length; i++) {
						// if keyword is found in input, then let user input again
						if(input.indexOf(keywords[i])!=-1) {
							System.out.println("The input cannot have '" + keywords[i]+ "'. Please re-enter");
							wrongInput = true;
							break;
						}
					}
				}
				else {
					for (int i = 0; i<keywords.length; i++) {
						// if keyword is not found in input, then let user input again
						if(input.indexOf(keywords[i])==-1) {
							System.out.println("The input must have '" + keywords[i]+ "'. Please re-enter");
							wrongInput = true;
							break;
						}
					}
				}
				
			}
			catch(Exception e){
				System.out.println(errorQuestion);
				sc.nextLine();
			}
		}while(wrongInput);
		
		return input;

	}

	// boolean input
	public boolean nextBoolean() {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		boolean input = true;
		
		do {
			try {
				System.out.print(nextBooleanQuestion);
				input = sc.nextBoolean();
				wrongInput = false;
				sc.nextLine();
				
			}
			catch(Exception e){
				System.out.println(invalidInputError);
				sc.nextLine();
			}
		}while(wrongInput);
		
		return input;
	}
	
	public boolean nextBoolean(String question, String errorQuestion) {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		boolean input = true;
		
		do {
			try {
				System.out.print(question);
				input = sc.nextBoolean();
				wrongInput = false;
				sc.nextLine();
				
			}
			catch(Exception e){
				System.out.println(errorQuestion);
				sc.nextLine();
			}
		}while(wrongInput);
		
		return input;
	
	
	}

	// character input
	public char nextChar() {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		char input = ' ';
		
		do {
			try {
				System.out.print(nextCharQuestion);
				input = sc.next().charAt(0);
				wrongInput = false;
				sc.nextLine();
				
			}
			catch(Exception e){
				System.out.println(invalidInputError);
				sc.nextLine();
			}
		}while(wrongInput);
		
		return input;
	}
	
	public char nextChar(char[] keywords) {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		char input = ' ';
		
		do {
			try {
				System.out.print(nextCharQuestion);
				input = sc.next().charAt(0);
				sc.nextLine();
				
				input = Character.toUpperCase(input);
				for (int i = 0; i<keywords.length; i++) {
					if (input == Character.toUpperCase(keywords[i])) {
						wrongInput = false;
					}
				}
				
				if((wrongInput)) {
					System.out.println(invalidInputError);
				}
				
			}
			catch(Exception e){
				System.out.println(invalidInputError);
				sc.nextLine();
			}
		}while(wrongInput);
		
		return input;
	}
	
	public char nextChar(String question, String errorQuestion, char[] keywords) {
		Scanner sc = new Scanner(System.in);
		boolean wrongInput = true;
		char input = ' ';
		
		do {
			try {
				System.out.print(question);
				input = sc.next().charAt(0);
				sc.nextLine();
				
				input = Character.toUpperCase(input);
				for (int i = 0; i<keywords.length; i++) {
					if (input == Character.toUpperCase(keywords[i])) {
						wrongInput = false;
					}
				}
				
				if((wrongInput)) {
					System.out.println(errorQuestion);
				}
				
			}
			catch(Exception e){
				System.out.println(errorQuestion);
				sc.nextLine();
			}
		}while(wrongInput);
		
		return input;
	}

	
}
