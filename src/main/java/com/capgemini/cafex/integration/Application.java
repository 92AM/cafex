package com.capgemini.cafex.integration;

import com.capgemini.cafex.service.Bill;

/**
 * Application is an entry point class containing the main method. This calls
 * getFormattedBillForDisplay method of Bill class to display the bill based on
 * array of purchased items entered by end user.
 * 
 * @author Arka Mitra
 *
 */
public class Application {

	/**
	 * Entry point java main method, invokes getFormattedBillForDisplay method of
	 * Bill class, displays the final overall bill based on a input string array.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new Bill(args).getFormattedBillForDisplay());
	}
}
