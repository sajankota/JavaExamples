package com.roundcodebox.calendarexamples;

/*
Add or substract hours to current time using Java Calendar
This example shows how to add or substract hours in current time  
using Java Calendar class.
*/

/*
Typical output would be
Current Date : 3-8-2019
Current time : 15:41:25
New time after adding 10 hours : 1:41:25
New date after adding 10 hours : 3-9-2019
Time before 3 hours : 12:41:25
 */

import java.util.Calendar;

public class AddHoursToCurrentDate {

	public static void main(String[] args) {

		// create Calendar instance
		Calendar now = Calendar.getInstance();

		System.out.println("Current Date : " + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE) + "-"
				+ now.get(Calendar.YEAR));

		System.out.println("Current time : " + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":"
				+ now.get(Calendar.SECOND));

		// add hours to current date using Calendar.add method
		now.add(Calendar.HOUR, 10);

		System.out.println("New time after adding 10 hours : " + now.get(Calendar.HOUR_OF_DAY) + ":"
				+ now.get(Calendar.MINUTE) + ":" + now.get(Calendar.SECOND));

		/*
		 * Java Calendar class automatically adjust the date accordingly if adding hours
		 * to the current time causes current date to be changed.
		 */

		System.out.println("New date after adding 10 hours : " + (now.get(Calendar.MONTH) + 1) + "-"
				+ now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR));

		// substract hours from current date using Calendar.add method
		now = Calendar.getInstance();
		now.add(Calendar.HOUR, -3);

		System.out.println("Time before 3 hours : " + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE)
				+ ":" + now.get(Calendar.SECOND));

	}
}
