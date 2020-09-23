package com.cg.day1;


class Rocket {
	private void blastoff() {
		System.out.print("bang");
	}
}

public class Program6 extends Rocket {
	public static void main(String[] args) {
		new  Program6().go();
	}

	void go() {
		blastoff();
		// Rocket.blastoff();//line A
	}

	private void blastoff() {
		System.out.print("sh-bang ");
	}
}