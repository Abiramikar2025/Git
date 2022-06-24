package org.test;

public class Sample {
	
	public void set() {
		
		System.out.println("1");

		}
		public void map() {
			System.out.println("2");

		}
		public void gap() {
			System.out.println("3");

		}
		public static void main(String[] args) {
			
			Sample s = new Sample();
			s.set();
			s.map();
			s.gap();
		}
}
