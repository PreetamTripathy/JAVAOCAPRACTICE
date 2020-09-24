package com.cg.day2;

	public class Program11 implements Device{


		public void doIt() {
			
		}

	}
	abstract class Phone1 extends Program11 {
		
	}
	abstract class Phone2 extends Program11 {
		
	}
	class Phone3 extends Program11 implements Device {
		public void doStuff() {}
	}
	interface Device {
		public void doIt();
	}