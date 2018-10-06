package com.capgemini.cafex.service;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import com.capgemini.cafex.model.MenuItem;
import lombok.Getter;

/**
 * Bill is a service level class that carries out operations to calculate the
 * overall bill by using its internal constructor and the getBill method.
 * 
 * @author Arka Mitra
 *
 */
@Getter
public class Bill {

	private final List<MenuItem> items = new ArrayList<>();

	/**
	 * Constructor of Bill class. This constructor accepts an array of string
	 * variables, these are expected to be purchased but known menu items. For each
	 * of the items in the string array, 'space' characters are replaced with "" so
	 * that it allows mapping to enum constants and finally added to the MenuItem
	 * list called items using a forEach loop.
	 * 
	 * @param inputItems String[]
	 */
	public Bill(String[] inputItems) {
		Arrays.asList(inputItems).forEach(i -> this.items.add(MenuItem.valueOf(i.replaceAll("\\s", ""))));
	}

	/**
	 * The getBill method calculates the total bill based on purchased items, this
	 * is achieved by using Java 8 Stream functionality. Before returning the final
	 * value the service charge is added on top of the bill by calling the
	 * getServiceCharge method of ServiceCharge class.
	 * 
	 * @return A BigDecimal, total bill including the service charge
	 */
	public BigDecimal getBill() {
		BigDecimal totalBill = items.stream().map(MenuItem::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
		return totalBill.add(ServiceCharge.getServiceCharge(totalBill, items));
	}

	/**
	 * The getFormattedBillForDisplay method return the final bill in British Pound
	 * Sterling format just for displaying purposes.
	 * 
	 * @return the bill in UK sterling format
	 */
	public String getFormattedBillForDisplay() {
		return NumberFormat.getCurrencyInstance(Locale.UK).format(getBill().doubleValue()).trim();
	}

}
