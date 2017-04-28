package main;

import java.util.Scanner;

public class Class7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);

		while (true) {
			System.out.println("Welcome to [A shop]. What would you like to buy?");
			String buying = myScanner.nextLine();
			if (buying.equals("iPhone")) {
				System.out.println("Which version?");
				int iPhoneType = myScanner.nextInt();
				myScanner.nextLine();
				if (iPhoneType < 4) {
					System.out.println("No more in stock.");
				} else if (iPhoneType == 4) {
					System.out.println("$59.99");
				} else if (iPhoneType == 5) {
					System.out.println("$69.99");
				} else if (iPhoneType == 6) {
					System.out.println("$79.99");
				} else if (iPhoneType == 7) {
					System.out.println("$99.99");
				}
			} else if (buying.equals("Macintosh")) {
				System.out.println("89.99");
			} else if (buying.equals("iPad")) {
				System.out.println("$79.99");
			} else if (buying.equals("iPod")) {
				System.out.println("$99.99");
			} else {
				System.out.println(buying + " is not in stock.");
			}
			
			System.out.println("Would you like to keep buying?");
			if (myScanner.nextLine().equals("No")) {
				break;
			}
			
		}
	}

}
