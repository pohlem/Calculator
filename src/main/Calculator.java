package main;

import java.util.Scanner;
import calculation.*;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Operation op = new Operation(s);
		op.result();
	}

}
