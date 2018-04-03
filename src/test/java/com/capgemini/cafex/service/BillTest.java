package com.capgemini.cafex.service;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * This is the BillTest JUnit test suit. It contains various unit tests which
 * are designed to test functionality of Bill class.
 * 
 * @author Arka Mitra
 *
 */
public class BillTest {

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void testGetBillOfEmptyInputList() {
		assertEquals(new BigDecimal("0.00"), new Bill(new String[0]).getBill());
	}

	@Test
	public void testBillConstructorSpaceRemission() {
		assertEquals("SteakSandwich", new Bill(new String[] { "Steak Sandwich" }).getItems().get(0).toString());
	}

	@Test
	public void testGetStandardBillExerciseExample() {
		String[] purchasedItems = { "Cola", "Coffee", "Cheese Sandwich" };
		Bill bill = new Bill(purchasedItems);
		assertEquals(new BigDecimal("3.50"),
				bill.getBill().subtract(ServiceCharge.getServiceCharge(new BigDecimal(3.50), bill.getItems())));
	}

	@Test
	public void testGetBill() {
		String[] purchasedItems = { "Cola", "Coffee", "Cheese Sandwich" };
		assertEquals(new BigDecimal("3.85"), new Bill(purchasedItems).getBill());
	}

	@Test
	public void testBillWithIllegalArgs() {
		exception.expect(IllegalArgumentException.class);
		new Bill(new String[] { "Mango Pudding", "Chocolate Cupcake" });
	}

	@Test
	public void testGetFormattedBillForDisplay() {
		String[] purchasedItems = { "Cola", "Coffee", "Cheese Sandwich" };
		assertEquals(NumberFormat.getCurrencyInstance(Locale.UK).format(new BigDecimal(3.85).doubleValue()).toString()
				.trim(), new Bill(purchasedItems).getFormattedBillForDisplay());
	}
}
