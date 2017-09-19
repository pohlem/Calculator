package main;

import java.util.Scanner;
import calculation.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
		System.out.println("Write your calculation or write \"close\" to close the program.");
		String s = sc.next();
		while (!s.matches("close")) {
			c.doCalculation(s);
			s = sc.next();
		}
		sc.close();
	}
}
