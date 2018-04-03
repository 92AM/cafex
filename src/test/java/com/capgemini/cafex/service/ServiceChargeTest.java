package com.capgemini.cafex.service;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

/**
 * This is the ServiceChargeTest JUnit test suit. It contains various unit tests
 * which are designed to test functionality of ServiceCharge class.
 * 
 * @author Arka Mitra
 *
 */
public class ServiceChargeTest {

	@Test
	public void testNoFoodServiceCharge() {
		String[] purchaseItems = { "Cola", "Coffee" };
		assertEquals(new BigDecimal(0.00).setScale(2, BigDecimal.ROUND_HALF_UP),
				ServiceCharge.getServiceCharge(new BigDecimal(1.50), new Bill(purchaseItems).getItems()));
	}

	@Test
	public void testFoodServiceCharge() {
		String[] purchaseItems = { "Cola", "Coffee", "Cheese Sandwich", "Cheese Sandwich" };
		assertEquals(new BigDecimal(0.55).setScale(2, BigDecimal.ROUND_HALF_UP),
				ServiceCharge.getServiceCharge(new BigDecimal(5.50), new Bill(purchaseItems).getItems()));
	}

	@Test
	public void testHotFoodServiceCharge() {
		String[] purchaseItems = { "Cola", "Coffee", "Cheese Sandwich", "Steak Sandwich" };
		assertEquals(new BigDecimal(1.60).setScale(2, BigDecimal.ROUND_HALF_UP),
				ServiceCharge.getServiceCharge(new BigDecimal(8.00), new Bill(purchaseItems).getItems()));
	}

	@Test
	public void testMaxServiceChargeOfTwenty() {
		String[] purchaseItems = { "Steak Sandwich", "Steak Sandwich", "Steak Sandwich", "Steak Sandwich",
				"Steak Sandwich", "Steak Sandwich", "Steak Sandwich", "Steak Sandwich", "Steak Sandwich",
				"Steak Sandwich", "Steak Sandwich", "Steak Sandwich", "Steak Sandwich", "Steak Sandwich",
				"Steak Sandwich", "Steak Sandwich", "Steak Sandwich", "Steak Sandwich", "Steak Sandwich",
				"Steak Sandwich", "Steak Sandwich", "Steak Sandwich", "Steak Sandwich", "Steak Sandwich",
				"Steak Sandwich", "Steak Sandwich", "Steak Sandwich", "Steak Sandwich", "Steak Sandwich",
				"Steak Sandwich" };
		assertEquals(new BigDecimal(20.00).setScale(2, BigDecimal.ROUND_HALF_UP),
				ServiceCharge.getServiceCharge(new BigDecimal(150.00), new Bill(purchaseItems).getItems()));
	}
}
