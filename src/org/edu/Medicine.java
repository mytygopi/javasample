package org.edu;

public class Medicine extends Engineering {
	public void physio() {
		System.out.println("physio is UG course");
		
	}
	
	public void Dental() {
		System.out.println("Dental is UG course");
		
	}
	
	public void MBBS() {
		System.out.println("MBBS is UG course");
		
	}

	public static void main(String[] args) {
		
	Medicine m = new Medicine();
	m.physio();
	m.MBBS();
	m.BBA();
	}
}
