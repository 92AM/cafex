package com.capgemini.cafex.model;

import java.math.BigDecimal;

import lombok.Getter;

/**
 * MenuItem enum contains standard constant enums, a constructor, various member
 * variables and accessible public getter methods as per the spec. The actual
 * menu items entered by the user can be mapped mapped against this MenuItem
 * enum.
 * 
 * @author Arka Mitra
 *
 */
public enum MenuItem {

	// Menu Items
	Cola(new BigDecimal("0.50"), false, false), Coffee(new BigDecimal("1.00"), true, false), CheeseSandwich(
			new BigDecimal("2.00"), false, true), SteakSandwich(new BigDecimal("4.50"), true, true);

	@Getter
	private final BigDecimal price;
	@Getter
	private final boolean isHot;
	@Getter
	private final boolean isFood;

	MenuItem(BigDecimal price, boolean isHot, boolean isFood) {
		this.price = price;
		this.isHot = isHot;
		this.isFood = isFood;
	}
}
