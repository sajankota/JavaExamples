package com.roundcodebox.calendarexamples;

/*
Add or substract days to current date using Java Calendar
This example shows how to add or substract days in current date and time values 
using Java Calendar class.
*/

/* Typical output would be :
 * Current date : 3-8-2019
date after one day : 3-9-2019
date before 10 days : 2-26-2019
*/

import java.util.Calendar;

public class AddDaysToCurrentDate {

	public static void main(String[] args) {

		// create Calendar instance
		Calendar now = Calendar.getInstance();

		System.out.println("Current date : " + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE) + "-"
				+ now.get(Calendar.YEAR));

		// add days to current date using Calendar.add method
		now.add(Calendar.DATE, 1);

		System.out.println("date after one day : " + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE) + "-"
				+ now.get(Calendar.YEAR));

		// substract days from current date using Calendar.add method
		now = Calendar.getInstance();
		now.add(Calendar.DATE, -10);

		System.out.println("date before 10 days : " + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE) + "-"
				+ now.get(Calendar.YEAR));

	}
}

