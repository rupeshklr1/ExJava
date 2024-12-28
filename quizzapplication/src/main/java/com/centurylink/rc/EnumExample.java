package com.centurylink.rc;
// Define an enum called Day
enum Day {
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY
}

enum Operation {
	ADDITION {
		@Override
		public double apply(double x, double y) {
			return x + y;
		}
	},
	SUBTRACTION {
		@Override
		public double apply(double x, double y) {
			return x - y;
		}
	},
	MULTIPLICATION {
		@Override
		public double apply(double x, double y) {
			return x * y;
		}
	},
	DIVISION {
		@Override
		public double apply(double x, double y) {
			if (y == 0) {
				throw new ArithmeticException("Cannot divide by zero");
			}
			return x / y;
		}
	};
	
	public abstract double apply(double x, double y);
}

public class EnumExample {
	
	// Method to demonstrate the use of enums
	public void printDay(Day day) {
		switch (day) {
			case SUNDAY:
				System.out.println("It's Sunday! Time to relax.");
				break;
			case MONDAY:
				System.out.println("It's Monday! Back to work.");
				break;
			case TUESDAY:
				System.out.println("It's Tuesday! Keep going.");
				break;
			case WEDNESDAY:
				System.out.println("It's Wednesday! Halfway through the week.");
				break;
			case THURSDAY:
				System.out.println("It's Thursday! Almost there.");
				break;
			case FRIDAY:
				System.out.println("It's Friday! The weekend is near.");
				break;
			case SATURDAY:
				System.out.println("It's Saturday! Enjoy your day off.");
				break;
		}
	}
	
	public static void main(String[] args) {
		EnumExample example = new EnumExample();
		
		// Loop through all days of the week and print a message for each
		for (Day day : Day.values()) {
			example.printDay(day);
		}
		System.out.println("Day.FRIDAY :-  "+Day.FRIDAY + Day.FRIDAY.ordinal());
		System.out.println("Day.TUESDAY :-  "+Day.TUESDAY + Day.TUESDAY.ordinal());
		
		// Perform arithmetic operations using enums
		System.out.println("\n\n\nArithmetic Operations:");
		double a = 10.0;
		double b = 5.0;
		
		for (Operation op : Operation.values()) {
			System.out.printf("%s of %.2f and %.2f is %.2f%n", op, a, b, op.apply(a, b));
		}
	}
}