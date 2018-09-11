package dougpinheiro;


import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Logger;

public class LeapYearDetector {


	private static Logger logger = Logger.getLogger("LeapYearDetector"); 

	/**
	 * @param year Give the year by this format "yyyy"
	 * @return true if the year is a leap year or false if it is not
	 */
	public static boolean isLeapYear(String year){
		Calendar c = Calendar.getInstance();
		try{
			c.set(Calendar.YEAR, Integer.valueOf(year));
			int days = c.getActualMaximum(Calendar.DAY_OF_YEAR);
			if(days == 366){
				return true;
			}
		}catch(NumberFormatException nfe){
			logger.warning("You have to inform a valid year.");
		}

		return false;
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please, inform the year: ");
		String year = s.nextLine();      
		if(LeapYearDetector.isLeapYear(year)){
			System.out.println("The year is a leap year");
		}else{
			System.out.println("The year is NOT a leap year");
		}
		s.close();
		System.exit(0);
	}

}
