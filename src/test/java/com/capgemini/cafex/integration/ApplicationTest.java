package com.capgemini.cafex.integration;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

/**
 * This is the ApplicationTest JUnit test suit. It contains unit tests which are
 * designed to test functionality of Application class.
 * 
 * @author Arka Mitra
 *
 */
public class ApplicationTest {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Test
	public void testMain() {
		String[] purchasedItems = { "Cola", "Coffee", "Cheese Sandwich" };
		Application.main(purchasedItems);
		assertEquals(NumberFormat.getCurrencyInstance(Locale.UK).format(new BigDecimal(3.85).doubleValue()).toString()
				.trim(), systemOutRule.getLog().trim());
	}
}
