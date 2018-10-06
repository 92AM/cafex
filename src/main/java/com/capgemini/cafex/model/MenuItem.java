package com.capgemini.cafex.model;

import com.capgemini.cafex.util.CafexConstants;
import lombok.Getter;

import java.math.BigDecimal;

/**
 * MenuItem enum contains standard constant enums, a constructor, various member
 * variables and accessible public getter methods as per the spec. The actual
 * menu items entered by the user can be mapped mapped against this MenuItem
 * enum.
 *
 * @author Arka Mitra
 */
public enum MenuItem {

    Cola(CafexConstants.COLA_PRICE,
            CafexConstants.COLA_IS_HOT,
            CafexConstants.COLA_IS_FOOD),
    Coffee(CafexConstants.COFFEE_PRICE,
            CafexConstants.COFFEE_IS_HOT,
            CafexConstants.COFFEE_IS_FOOD),
    CheeseSandwich(CafexConstants.CHEESE_SANDWICH_PRICE,
            CafexConstants.CHEESE_SANDWICH_IS_HOT,
            CafexConstants.CHEESE_SANDWICH_IS_FOOD),
    SteakSandwich(CafexConstants.STEAK_SANDWICH_PRICE,
            CafexConstants.STEAK_SANDWICH_IS_HOT,
            CafexConstants.STEAK_SANDWICH_IS_FOOD);

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
