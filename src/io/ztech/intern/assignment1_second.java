package io.ztech.intern;


import java.util.*;
import java.util.Date;
public class assignment1_second {

	static public boolean checkbeer(String day, int value) {
		if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
			if (value > 40)
				return true;
		} else {
			if (value > 40 && value < 60)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		Scanner nav = new Scanner(System.in);
		try {
			String day = nav.next();
			int noOfBeers = nav.nextInt();
			System.out.println(checkbeer(day, noOfBeers));
		} catch (InputMismatchException e) {
			System.out.println("Please enter data in the right format");
		}
	}
}
