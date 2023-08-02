package org.edu;

public class Education {
	public void UG() {
		System.out.println("UG Details");
		
	}
	
	public void PG() {
		System.out.println("PG Details");
	}
	
	public static void main(String[] args) {
		Education e = new Education();
				e.UG();
		e.PG();
	}
	}