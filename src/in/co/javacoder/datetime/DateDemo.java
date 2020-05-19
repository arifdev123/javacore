package in.co.javacoder.datetime;

import java.time.LocalDate;

public class DateDemo {

	public static void main(String[] args) {
		
		System.out.println(OMNIAFirstTier("2016-01-01" , "4000-01-01"));
		
	}
	
	
	private static int OMNIAFirstTier(String effectiveDate , String endDate) {
		LocalDate efDate = LocalDate.parse(effectiveDate);
		LocalDate enDate = LocalDate.parse(endDate);
		
		LocalDate defaultDate = LocalDate.parse("4000-01-01");
		LocalDate curdate = LocalDate.now();
		
		if( !enDate.isEqual(defaultDate) && (enDate.isAfter(curdate) || enDate.isEqual(curdate))  && 
		    (efDate.isBefore(curdate) || efDate.isEqual(curdate)) ) return 1;
		
		if( enDate.isEqual(defaultDate) && (efDate.isBefore(curdate) || efDate.isEqual(curdate)) ) return 1;
		
		return 0;
		
	}

}
