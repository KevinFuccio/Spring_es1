package com.w4d1.orders;

public class Table {
	
	private static int tableNumber;
	private int numberOfSeats;
	private State_Enum state;
	
	public Table(int numberOfSeats, State_Enum state) {
		this.numberOfSeats = numberOfSeats;
		this.state = state;
		tableNumber++;
	}

	@Override
	public String toString() {
		return "Table [numberOfSeats=" + numberOfSeats + ", state=" + state + "]";
	}
	
	
}
