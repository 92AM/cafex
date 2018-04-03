package com.capgemini.cafex.service;

import java.math.BigDecimal;
import java.util.List;
import com.capgemini.cafex.model.MenuItem;

/**
 * Implements getServiceCharge method, this calculates the overall service
 * charge based on purchased items.
 * 
 * @author Arka Mitra
 *
 */
public class ServiceCharge {

	/**
	 * Using an enhanced for loop the getServiceCharge method calculates the service
	 * charge based on the purchased items as per the spec. It then converts the
	 * service charge rate from double to BigDecimal, multiplies with the total cost
	 * and rounds up the final value to 2 decimal place before assigning it to
	 * serviceCharge. Finally, with the use of a shorthand 'if statement' the
	 * serviceCharge value is checked to see if it has exceeded 20.00. If it has
	 * exceeded 20.00 then 20.00 will be returned, otherwise the serviceCharge will
	 * be returned.
	 * 
	 * @param totalCost
	 * @param menuItems
	 * @return serviceCharge as a BigDecimal value
	 */
	public static BigDecimal getServiceCharge(BigDecimal totalCost, List<MenuItem> menuItems) {

		double serviceChargeRate = 0.0;

		for (MenuItem item : menuItems) {
			if (item.isHot() && item.isFood()) {
				serviceChargeRate = 0.2;
				break;
			} else if (item.isFood()) {
				serviceChargeRate = 0.1;
			}
		}

		BigDecimal serviceCharge = (totalCost.multiply(BigDecimal.valueOf(serviceChargeRate))).setScale(2,
				BigDecimal.ROUND_HALF_UP);

		return serviceCharge.doubleValue() > 20.0 ? new BigDecimal(20.00).setScale(2, BigDecimal.ROUND_HALF_UP)
				: serviceCharge;
	}

}
