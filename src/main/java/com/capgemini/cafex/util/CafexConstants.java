package com.capgemini.cafex.util;

import java.math.BigDecimal;

public final class CafexConstants {

    public static final BigDecimal COLA_PRICE = new BigDecimal("0.50");
    public static final boolean COLA_IS_HOT = false;
    public static final boolean COLA_IS_FOOD = false;

    public static final BigDecimal COFFEE_PRICE = new BigDecimal("1.00");
    public static final boolean COFFEE_IS_HOT = true;
    public static final boolean COFFEE_IS_FOOD = false;

    public static final BigDecimal CHEESE_SANDWICH_PRICE = new BigDecimal("2.00");
    public static final boolean CHEESE_SANDWICH_IS_HOT = false;
    public static final boolean CHEESE_SANDWICH_IS_FOOD = true;

    public static final BigDecimal STEAK_SANDWICH_PRICE = new BigDecimal("4.50");
    public static final boolean STEAK_SANDWICH_IS_HOT = true;
    public static final boolean STEAK_SANDWICH_IS_FOOD = true;

    private CafexConstants() {
    }
}
